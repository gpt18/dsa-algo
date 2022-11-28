import java.io.Console;

/*
 * Sort an array of 0s, 1s and 2s | Dutch National Flag problem
 */

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println("Before sorted:");
        printArray(arr);
        sort(arr);
        System.out.println("After sorted:");
        printArray(arr);

    }

    private static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    private static void sort(int[] arr) {
        int low = 0, high = arr.length-1, mid = 0, temp;
        while(mid <= high){
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                
                case 1:
                    mid++;
                    break;

                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            
                default:
                    break;
            }
        }
    }
}
