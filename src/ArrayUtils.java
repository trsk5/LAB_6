import java.util.Scanner;
public class ArrayUtils {
    private static final int ARRAY_SIZE = 10;
    private final double[] data;
    public ArrayUtils() {
        data = new double[ARRAY_SIZE];
    }
    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 10 елементів масиву:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            data[i] = scanner.nextDouble();
        }
    }
    public void outputArray() {
        System.out.println("Масив:");
        for (double element : data) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public double getVectorLength() {
        double sumOfSquares = 0;
        for (double element : data) {
            sumOfSquares += element * element;
        }
        return Math.sqrt(sumOfSquares);
    }
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.inputArray();
        arrayUtils.outputArray();
        double vectorLength = arrayUtils.getVectorLength();
        System.out.println("Довжина вектора: " + vectorLength);
    }
}
