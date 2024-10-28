//write a java program that accept two integer values from the user and return the largest value are the same ,
//return 0 and find the smallest value if the two value have the same reminder when divided by 6
    import java.util.Scanner;

public class CompareIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondValue = scanner.nextInt();

        if (firstValue == secondValue) {
            System.out.println("Both values are the same. Returning: 0");
        } else {
            int largestValue = Math.max(firstValue, secondValue);
            System.out.println("The largest value is: " + largestValue);
        }

        if (firstValue % 6 == secondValue % 6) {
            int smallestValue = Math.min(firstValue, secondValue);
            System.out.println("Both values have the same remainder when divided by 6. The smallest value is: " + smallestValue);
        }

        scanner.close();
    }
}


