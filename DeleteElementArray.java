
import java.util.Arrays;

public class DeleteElementArray {
    public static void main(String[] args) {

        //An array arr is initialized with the values {1, 2, 3, 4, 5}.
        //
        //A new array arr_new is created with a size one less than the original array.
        //
        //The variable j is set to 3, indicating the index of the element to be deleted.
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr_new = new int[arr.length - 1];
        int j = 3;

        //This loop iterates through the original array arr.
        //
        //If the current index i is not equal to j, the element at arr[i] is copied to arr_new[k], and k is incremented.
        //
        //This effectively skips the element at index j and copies all other elements to the new array.

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != j) {
                arr_new[k] = arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));
    }
}