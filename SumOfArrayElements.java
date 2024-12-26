public class SumOfArrayElements {
    public static void main(String[] args) {


    int[]A = {3,9,7,8,12,6,15,5,4,10} ;
    int[]B = {3,9,7,8,12,6,23,5,4,10} ;
    int sum = 0;
    int sum1 = 0;

    int key = 6;



    for (int i = 0; i<A.length; i++) {
        sum += A[i];
      }

        System.out.println("Sum of elements in array is: " +sum);

        for (int x : B) {
            sum1 += x;
        }

        System.out.println("Sum of elements in array is: " +sum1);

        for (int i = 0; i<A.length; i++) {
            if (A[i] == key) {
                System.out.println("Element " + A[i] + " is found at index " +i);
                System.exit(0);
            }

        }

        System.out.println("Element is not found");


        int max = 0;
        for (int i = 0; i<A.length; i++) {
             max = A[0];
            if(A[i] > max){
                max = A[i];
            }
        }

        System.out.println("Maximum element in the table is: " +max);
    }
}
