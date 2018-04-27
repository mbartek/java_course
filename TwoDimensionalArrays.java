package lesson4;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        double[][] array = new double[3][3];

        // column 1
        array[0][0] = 1.0;
        array[1][0] = 1.5;
        array[2][0] = 2.0;

        // column 2
        array[0][1] = 1.5;
        array[1][1] = 2.0;
        array[2][1] = 2.5;

        // column 3
        array[0][2] = 2.0;
        array[1][2] = 2.5;
        array[2][2] = 3.0;

        System.out.println("The sum of diagonal array products is: " + ( array[0][0] + array[1][1] + array[2][2] + array[0][2] + array[2][0] ));
        System.out.println("The product of multiplication of the middle column and row is: " + ( array[0][1] * array[1][1] * array[2][2] * array[1][0] * array[1][2] ));
        System.out.println("The sum of all edge elements is: " + ( array[0][0] + array[2][0] + array[0][2] + array[2][2] ));
    }
}
