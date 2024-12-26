import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n;
        int remainder;
        int sumNumber = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        int num = n;

        while(n >0){
            remainder = n % 10;
            n = n / 10;
            //System.out.println(remainder);
             int cubNumber = (int)Math.pow(remainder,3); //n^3
             sumNumber = sumNumber + cubNumber;

            System.out.println(cubNumber);

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
