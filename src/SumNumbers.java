import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        // Initialize sumTotal to 0
        int sumTotal = 0;

        // Create a Scanner object to read input from the user
        Scanner reader = new Scanner(System.in);

        // Ask the user for a number to sum to
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        // Use a while loop to sum the numbers from 1 to sumTo
        int i = 1;
        while (i <= sumTo) {
            sumTotal += i;
            i++;
        }

        // Print the result
        System.out.println("Sum of numbers from 1 to " + sumTo + ": " + sumTotal);
    }
}