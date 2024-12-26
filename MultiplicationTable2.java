public class MultiplicationTable2 {


        public static void main(String[] args) {

            //Ta koda bo izpisala poštevanko do 10. Zunanja zanka (for (int i = 1; i <= n; i++)) nadzoruje vrstice,
            // notranja zanka (for (int j = 1; j <= n; j++)) pa stolpce. System.out.print(i * j + "\t") izpiše produkt i in j, \t
            // pa doda tabulator za lepši izpis. System.out.println() premakne kazalec na novo vrstico po vsaki vrstici poštevanke.

            int n = 10; // velikost poštevanke
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();

        }
    }
}
