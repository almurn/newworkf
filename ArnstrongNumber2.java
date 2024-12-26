import java.util.Scanner;

public class ArnstrongNumber2 {
    public static void main(String[] args) {

        int n;
        int remainder;
        int sumNumber = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        int num = n;

        while (n > 0){
          remainder = n % 10;
          sumNumber = sumNumber + remainder * remainder *remainder;
          n = n / 10;

        }

        System.out.println(sumNumber);

        if (num == sumNumber){
            System.out.println("The number is Armstrong Number");
        }

        else {
            System.out.println("The number is not Armstrong Number");
        }

    }
}