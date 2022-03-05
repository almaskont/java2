package homework5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 10000000;
        System.out.println("Without thread");
        float[] arr1 = first(size);
        System.out.println("With a thread");
        float[] arr2 = second(size);
        System.out.println(Arrays.compare(arr1, arr2) == 0 ? "Arrays are equal" : "Arrays are not equal");
    }

    public static float[] first(int size) {
        float[] arr1 = new float[size];
        Arrays.fill(arr1, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++){
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
        return arr1;
    }

    public static float[] second(int size) {
        int h = size/2;
        float[] arr2 = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        Arrays.fill(arr2, 1);

        long a = System.currentTimeMillis();

        System.arraycopy(arr2, 0, a1, 0, h);
        System.arraycopy(arr2, h, a2, 0, h);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = h; i < size; i++) {
                a2[i-h] = (float)(a2[i-h] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr2, 0, h);
        System.arraycopy(a2, 0, arr2, h, h);
        System.out.println(System.currentTimeMillis() - a);
        return arr2;
    }
}
