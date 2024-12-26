import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for multiplication");
        n = sc.nextInt();
        System.out.println("Multiplicaton table for number " +n);
        for(int i= 1; i<=10; i++){
            System.out.println( n +"x" + i + "="+ i*n );
        }

    }
}
