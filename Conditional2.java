import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {

        int m1, m2, m3;
        int total;
        float avg;

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter mark 1");
        m1 = sc.nextInt();
        System.out.println("Enter mark 2");
        m2= sc.nextInt();
        System.out.println("Enter mark 3");
        m3 = sc.nextInt();

        total = m1 + m2 +m3;
        avg = total/3;

        if(avg >= 70) {
            System.out.println("A");
        }
        else if (avg >=60 && avg <70) {
            System.out.println("B");
        }
         else if (avg >=50 && avg <60) {
            System.out.println("C");
        }
        else if (avg >=40 && avg <50) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

    }
}
