import java.util.Scanner;

public class Array1 {

    /**
     * Reverse an array or string
     */

    public static void main(String[] args){
        //input array values
        int[] arr = {1,2,3,4,5,6,7,8,9};

        //printing the input values
        printArray(arr, arr.length);

        //reversing the arry
        reverseArray(arr, 0, arr.length-1);

        //printing the reversed array
        System.out.println("Reversed array is");
        printArray(arr, arr.length);
    }

    static void printArray(int[] array, int length){
       
        //printing the array elements using for loop
        for(int i = 0; i < length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");

    }
 
    private static void reverseArray(int[] array, int start, int end) {

        //creating temp space
        int temp;

        //using while loop iterating the array
        while(start < end){

            //inserting the start element into temp space
            temp = array[start];

            //inserting the end element into start place
            array[start] = array[end];

            //inserting temp value into end place
            array[end] = temp;

            //increase the start value by one 
            start++;

            //decrease the end value by one
            end--;
        }

        
    }
    
}
