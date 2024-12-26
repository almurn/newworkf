public class SCString3 {
    public static void main(String[] args) {

        String str = "a!B@c#l$2%3";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]","")); //remove special caracters

        String str2 =  "   abc      de     fgh    ijk   ";

        System.out.println(str2.replaceAll("\\s+"," ").trim());

        String str3 = "java   python  javascript  csharp";

        str3 = str3.replaceAll("\\s+"," ").trim();

       String words[] = str3.split("\\s");

        System.out.println(words.length);
    }
}
