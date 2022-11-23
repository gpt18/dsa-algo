

public class practice {
   public static void reverseArray(int start, int end, int[] arr){
      while (start < end){
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
      }
   }

   public static void printArray(int length, int[] arr){
      for(int i=0; i<length; i++){
         System.out.print(arr[i]+" ");
      }
      System.out.println("");
   }

   public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int length = arr.length; //5 >>last index 4
    printArray(length, arr);
    reverseArray(0, length-1, arr);
    printArray(length, arr);
   }
}
