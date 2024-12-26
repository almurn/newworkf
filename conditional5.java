import java.util.Scanner;

public class conditional5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number");
        int day = sc.nextInt();

        if (day == 1) {

            System.out.println("Monday");
        }

        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("Wednesday");
        }
        else if(day == 4){
            System.out.println("Thurstday");
        }
        else if(day == 5){
            System.out.println("Friday");
        }

        else if(day == 6){
            System.out.println("Saturday");
        }
        else if(day == 7){
            System.out.println("Sunday");
        }

        else{
            System.out.println("Day dont exist");
        }
    }

}
