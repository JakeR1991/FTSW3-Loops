public class ThreeDigitCodes {
    public static void main(String[] args) {
        // Initialize count to 0
        int count = 0;

        // Outer loop: Iterate through each digit from 1 to 4
        for (int i = 1; i <= 4; i++) {
            // Middle loop: Iterate through each digit from 1 to 4
            for (int j = 1; j <= 4; j++) {
                // Inner loop: Iterate through each digit from 1 to 4
                for (int k = 1; k <= 4; k++) {
                    // If none of the digits are the same, print the number and increment count
                    if (i != j && i != k && j != k) {
                        System.out.println(i + "" + j + "" + k);
                        count++;
                    }
                }
            }
        }
        // Print out the total count of unique three-digit numbers
        System.out.println("Total number of the three-digit-numbers: " + count);
    }
}
