package lesson4;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        Calculator operationObject = new Calculator();

        Scanner input = new Scanner(System.in);
        double n1;
        double n2;
        int op;
        System.out.print("Enter first number: ");
        n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        n2 = input.nextDouble();
        System.out.println("Select operation to perform:");
        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        op = input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Your result is: " + operationObject.getAdd(n1, n2));
                break;
            case 2:
                System.out.println("Your result is: " + operationObject.getSubstract(n1, n2));
                break;
            case 3:
                System.out.println("Your result is: " + operationObject.getMultiply(n1, n2));
                break;
            case 4:
                System.out.println("Your result is: " + operationObject.getDivide(n1, n2));
                break;
        }
    }
}
