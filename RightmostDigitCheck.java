//write a java program that accept three integer from the user and return true if two or more of 
//them have the same rightmost digit . the integer are non-negative .


import java.util.Scanner;

public class RightmostDigitCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondValue = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdValue = scanner.nextInt();

        int rightmost1 = firstValue % 10;
        int rightmost2 = secondValue % 10;
        int rightmost3 = thirdValue % 10;

        boolean result = (rightmost1 == rightmost2) || 
                         (rightmost1 == rightmost3) || 
                         (rightmost2 == rightmost3);

        System.out.println("Two or more numbers have the same rightmost digit: " + result);

        scanner.close();
    }
}
