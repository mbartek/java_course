package lesson4;

import java.util.stream.IntStream;

public class TwoArrays {
    public static void main(String[] args) {
        int[] arrayOne = {84, 2, 17};
        int[] arrayTwo = {9, 185, 47};
        int arrayOneSum = IntStream.of(arrayOne).sum();
        int arrayTwoSum = IntStream.of(arrayTwo).sum();

        System.out.println("The sum of numbers from both arrays is: " + (arrayOneSum + arrayTwoSum));
    }
}
