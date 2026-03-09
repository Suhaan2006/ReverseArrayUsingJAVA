import java.util.Arrays;

class ReverseArray {

    //creating function to reverseArray
    static void reverseArray(int[] arr) {
        int n = arr.length;

        /*
        Create a temporary array called "temp
        to store all elements of array "arr"
        in reverse order
         */
        int[] temp = new int[n];

        /*
        Copy elements from original array
        to temp in reverse order
         */
        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];
        
        /*
        Copy reversed elements from temp
        back to original array arr
        */
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];

    }

    public static void main(String[] args) {
        
        //declare array arr
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        //call reverseArray function
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");

    }

}