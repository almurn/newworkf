public class CopyArray {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6};
        int B [] = new int [6];

        for (int i = 0; i<A.length; i++){
             B[i] = A[i];
        }

        for (int i = 0; i<B.length; i++) {
            System.out.print(B[i] +", ");
        }
    }
}
