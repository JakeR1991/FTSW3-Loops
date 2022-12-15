import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        // create the scanner object
        Scanner reader = new Scanner(System.in);

        // ask the user to input integer number, place it in timesTable variable
        System.out.print ("What times table would you like? : ");
        int timesTable = reader.nextInt();

        // use for loop to display the timesTable x 1 until timesTable x 12
        for (int i=1; i<= 12; i++) {
            // display times table
            System.out.println(timesTable + "x" + i + "=" + (timesTable * i));
        }
    }
}
