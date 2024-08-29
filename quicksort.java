public class quicksort {

    //we are taking pivot as arr of high

    public static int partition (int arr[],int low, int high ) {
        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                //swap 
                // we doin swapping as in if we have an array with j smoll then pivot se swap with i , suppose it wast smooll j will 
                //move on but i will remain same  so the last element i was on i+1 will be now value of the big element in j and the i 
                //one will be the smoller value
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }

            
            
        }

        i++; // i ++ beacuse i was -1
        //this will basically bring pivot element to the position of i+1 that means the position after all the elementst smoller then the pivot
        // it switches pivot location with the element bigger then the pivot to last
        int temp = arr[i];
        arr[i]= pivot;
        arr[high]=temp;
        
        // we return pivot position
        return i;
        
    }

    public static void qwiksort(int arr[],int low, int high) 
    {
        if(low<high){

            int pidx = partition(arr,low,high);

            qwiksort(arr,low,pidx-1);
            qwiksort(arr,pidx+1,high);
            
        }
        
    }

    public static void main(String[] args) {
        int arr[]= {5,345,234,21,32,43,300};
        qwiksort(arr,0,arr.length-1);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.print("]");
    }
    
}

