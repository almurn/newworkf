import java.util.Scanner;

public class SwitchDemo4 {

    public static void main(String[] args) {

        int a,b;
        String option;

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words");
        option = sc.nextLine();

        switch(option){
            case "ADD":
                System.out.println(a+b);
                break;
            case "SUB":
                System.out.println(a-b);
                break;
            case "MUL":
                System.out.println(a*b);
                break;
            case "DIV":
                System.out.println(a/b);
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
