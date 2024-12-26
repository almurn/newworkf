public class RotatingArray {
    public static void main(String[] args) {

        int [] A = {5,9,6,10,12,7,3,5,4,2};
        int temp = A[0];

        for(int x :A){
            System.out.print(x +", ");
        }
        System.out.println();

        //This loop starts from the second element (index 1)
        // and shifts each element one position to the left.
        // For example, A[0] becomes A[1], A[1] becomes A[2], and so on.
        for(int i = 1; i<A.length; i++){
            A[i-1] = A[i];
        }
        A[A.length-1]=temp;  //The last element of the array A is assigned the value stored in temp, which is 5.

        for(int x :A){
            System.out.print(x +", ");
        }
    }
}
