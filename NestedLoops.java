public class NestedLoops {

    public static void main(String[] args) {


        //Zunanja zanka (for (int i = 1; i <= 5; i++)) nadzoruje število vrstic.
        // Za vsako vrednost i notranja zanka (for (int j = i; j <= 5; j++)) izpiše vrednosti
        // j od i do 5. Ko se notranja zanka konča, se izvede System.out.println(),
        // ki premakne kazalec na novo vrstico.
        // Rezultat:
        //1 2 3 4 5
        //2 3 4 5
        //3 4 5
        //4 5
        //5
        for(int i = 1; i <= 5; i++ ){
            for(int j = 1; j <= 5; j++ ) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println("");
        }
    }
}


