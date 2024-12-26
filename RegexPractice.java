public class RegexPractice {

    public static void main(String[] args) {

        String str = "almurn@gmail.com";

        System.out.println(str.matches("\\w+gmail(.*)"));
    }
}
