

public class MaxArray {
    
    public static void main(String[] args) {
        int[] arr = {0,1,1};
        int arr_size = arr.length;
        int min, max;
        int i; //for loop

        //even length of an array >> checking for 2 element
        if(arr_size%2 == 0){
            if(arr[0] > arr[1]){
                max = arr[0];
                min = arr[1];
            }else{
                max = arr[1];
                min = arr[0];
            }
            i = 2;
        }else{
            max = arr[0]; //for only one element
            min = arr[0];
            i = 1;
        }

        while(i<arr_size-1){
            if(arr[i] > arr[i+1]){
               if(arr[i] > max ){
                max = arr[i];
               }
               if(arr[i+1] < min ){
                min = arr[i+1];
               }
            }else{
                if(arr[i+1] > max ){
                    max = arr[i+1];
                   }
                   if(arr[i] < min ){
                    min = arr[i];
                   }
            }
            i = i + 2;
        }

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);

        
    }
}
