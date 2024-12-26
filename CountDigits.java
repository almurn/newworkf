import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        int n;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();

        while(n>0){
            n=n/10;
            counter++;
        }
        System.out.println(counter);
    }
}
