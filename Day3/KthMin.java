import java.util.Collections;
import java.util.PriorityQueue;

public class KthMin {

    private static int findKthSmallestElement(int[] arr, int k, int size) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < size; i++) {
          maxHeap.add(arr[i]);
          if (maxHeap.size() > k) {
            maxHeap.poll();
          }
        }
        return maxHeap.peek();

        
     }

     private static int findKthLargestElement(int[] arr, int k, int size){
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<k; i++){
          pq.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++){
          if(pq.peek() < arr[i]){
            pq.poll();
            pq.add(arr[i]);
          }
        }

        return pq.peek();
     }

    public static void main(String[] args) {
        int arr[] = {7,9,2,4,1,3};
        int k=5;
     
        //1 2 3 4 7 9 
        
       if(!(k>arr.length)){

        System.out.print("[ ");

       for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i]+" ");
       }

       System.out.print("]\n");
         
        int kthMin = findKthSmallestElement(arr, k, 4);
        System.out.println(k+"th min element: "+kthMin);

        int kthMax = findKthLargestElement(arr, k, 4);
        System.out.println(k+"th max element: "+kthMax);
       }else{
        System.out.println("K is max than length of array");
       }

    }
}
