public class SCString {

    public static void main(String[] args) {


        String str = "programmer@gmail.com";

        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        String domain = str.substring(i + 1, str.length());

        System.out.println("Username : " +uname);
        System.out.println("Domain: " +domain);
        //System.out.println(domain.startsWith("gmail"));

        int j = domain.indexOf(".");
        System.out.println(j);
        String name = domain.substring(0,j);
        System.out.println(name);
        System.out.println(name.equals("gmail"));
    }

}
