import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        int n = 0;
        int age = 0;
        boolean isEven = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        isEven = n % 2 == 0;

        if(isEven){
            System.out.println("The number is even!");
        }

        else {
            System.out.println("The number is odd");
        }


        System.out.println("Enter an age of a person");
        age = sc.nextInt();

        if(age >= 14 && age <= 55){
            System.out.println("Person is young");
        }

        else {
            System.out.println("Pesrson is old");
        }


    }
}
