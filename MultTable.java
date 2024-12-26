  import java.util.Scanner;

    public class MultTable {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a number for multiplication table: ");
            int number = scan.nextInt(); // Read user input

            for (int i = 1; i <= 10; i++) { // Loop from 1 to 10
                System.out.println(number + " * " + i + " = " + (number * i)); // Print the multiplication
            }

            scan.close(); // Close the scanner
        }
    }

