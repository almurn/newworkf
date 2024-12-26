import javax.management.StringValueExp;
import java.sql.SQLOutput;

public class SCString2 {

   public static void main(String[] args) {

        int b = 1000110;

        String str = String.valueOf(b); //int to string

        System.out.println(str.matches("[01]+"));

        String str2 = "1234AB";  //hexadecimal
        System.out.println(str2.matches("[0-9A-F]+"));

        String str3 = "01/12/2000";
        System.out.printf(str3, "[0-9]{2}/[0-9]{2}/[0-9]{4}");

        System.out.println();

        System.out.println(str3.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}+"));

    }
}
