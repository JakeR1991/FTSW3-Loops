import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner reader = new Scanner(System.in);

        // Ask the user for a string
        System.out.print("Input a string: ");

        // Convert the user's input to an array of characters
        char[] letters = reader.nextLine().toCharArray();

        // Iterate through the letters array in reverse
        for (int i = letters.length - 1; i >= 0; i--) {
            // Print the current character
            System.out.print(letters[i]);
        }

        // Print a new line after the loop is finished
        System.out.println();
    }
}
