public class InsertElementInArray {

    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;

        int n = 6;


        for (int i = 0; i<n; i++){
            System.out.print(A[i] + ",");
        }
        System.out.println();





        int x=20;
        int index=2;

        //A new element x with the value 20 is to be inserted at the position index which is 2.
        //
        //The loop shifts elements from the position index to the end of the array one position to the right
        // to make space for the new element.
        //
        //The new element 20 is inserted at the position index.

        for(int i=n;i>index;i--)
            A[i]=A[i-1];
        A[index]=x;

        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");


        //The code initializes an array and assigns values to the first six elements.
        //
        //It prints these elements.
        //
        //It then inserts a new element 20 at the specified index 2, shifting the subsequent elements to the right.
        //
        //Finally, it prints the modified array.
        //
        //I hope this helps! If you have any more questions or need further clarification, feel free to ask.
    }
}
