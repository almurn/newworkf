import java.util.Scanner;

public class AritmeticalProgression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print AP Series");
        System.out.println("Enter a");
        int a  = sc.nextInt();
        System.out.println("Enter d");
        int d = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();

        int term = a;
        for(int i = 0; i<n; i++){
            System.out.print(term + ",");
            term= term+d;
        }
    }
}
