import java.util.Scanner;

public class RevNumIsPalindrom {

    public static void main(String[] args) {

        int n;
        int remainder;
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();

        int m = n;

        while (n > 0){
            remainder = n % 10;
            //System.out.print(remainder);
            reverse = reverse * 10 + remainder;
            n = n/10;
        }

        System.out.println(reverse);

        if(reverse == m){
            System.out.println("Number is palindrom");
        }

        else{
            System.out.println("Number is not a palindrom");
        }
    }
}
