package homework2;

import java.io.IOException;

public class MyArraySizeException extends IOException {

    public MyArraySizeException(String s) {
        super(s);
    }

    public MyArraySizeException(int i) {
        super("Number of columns do not equal to 4 at " + i + " row(indexes start from 0)");
    }
}
