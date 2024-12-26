public class MaxElementInTable {


        public static void main(String[] args) {


            int[]A = {3,9,7,8,12,6,15,5,4,10} ;

            int max = A[0];

            for (int i = 0; i<A.length; i++) {
                if(A[i] > max){
                    max = A[i];
                }
            }

            System.out.println("Maximum element in the table is: " +max);

            int max1, max2;

            max1 = A[0];
            max2 = A[0];

            
            for (int i = 0; i<A.length; i++) {//The for loop iterates through each element of the array.
                if(A[i] > max1){ //If the current element A[i] is greater than max1, then:
                    max2 = max1;//max2 is updated to the value of max1.
                    max1= A[i]; //max1 is updated to the current element A[i].
                } else if (A[i]>max2) {  //If the current element A[i] is not greater
                    // than max1 but is greater than max2, then max2 is updated to the current element A[i].
                    max2=A[i];
                }

            }

            System.out.println("Second max element: " +max2);

            //In summary, the code iterates through the array to find the largest and second largest numbers. It keeps track
            // of
            // these two values and updates them as it finds larger numbers. Finally, it prints the second largest number.

        }
    }




