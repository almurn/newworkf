import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {

        String domain;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter domain name");
        domain = sc.nextLine();
        String ext = domain.substring(domain.lastIndexOf(".")+1);

        switch (ext) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:
                System.out.println("Domain unknown");
        }

    }
}

