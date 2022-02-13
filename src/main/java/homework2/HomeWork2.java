package homework2;

import static java.lang.Integer.parseInt;

public class HomeWork2 {
    public static void main(String[] args) {
        String[][] numbers = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] numbers1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "s"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] numbers2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4", "s"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] numbers3 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println(sumArray(numbers));
            System.out.println(sumArray(numbers1));
            System.out.println(sumArray(numbers2));
            System.out.println(sumArray(numbers3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        try {
            if(arr.length != 4)
                throw new MyArraySizeException("Number of rows do not equal to 4(indexes start from 0)");
            for(int i = 0; i < 4; i++) {
                if(arr[i].length != 4)
                    throw new MyArraySizeException(i);
                for (int j = 0; j < 4; j++) {
                    try{
                        if(isNumeric(arr[i][j])){
                            sum = sum + parseInt(arr[i][j]);
                        } else {
                            throw new MyArrayDataException(i, j);
                        }
                    } catch (MyArrayDataException exception) {
                        exception.printStackTrace();
                    }
                }
            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        return sum;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
