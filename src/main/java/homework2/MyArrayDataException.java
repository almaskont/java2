package homework2;

public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(int i, int j) {
        super("The string in " + i + " row and " + j + " column is not a number(indexes start from 0)");
    }
}
