import java.util.Scanner;

public class DisplayDigits {

    public static void main(String[] args) {

        int n;
        int remainder = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();

        while(n>0){
            remainder=n%10;
            n=n/10;
            //System.out.println(n);
            System.out.println(remainder);
        }


    }

}
