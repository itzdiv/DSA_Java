public class mergesort {

    public static void conquer(int arr[],int start,int mid,int end){

        //end-start because what if our start is starting from other then 0 

        int merged[]= new int[end-start+1];
        

        int idx1= start;
        int idx2 = mid+1;
        int x=0;

        while(idx1 <=mid && idx2 <= end ){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }

        //handle the situation when one of the subarrays is fully traversed 

        while ( idx1<=mid){

            merged[x++]=arr[idx1++];

        }

        while ( idx2<=end){

            merged[x++]=arr[idx2++];

        }

        for (int i = 0,j = start; i < merged.length; i++,j++) {

            arr[j]=merged[i];
            
        }




    }

    public static void merge(int arr[],int start,int end){

        if(start>=end){
            return;
        }
        //Why start + (end - start) / 2 instead of (start + end) / 2? This is to prevent potential integer overflow when start and end are large values.
        int mid = start + (end-start)/2;
        //Recursive Calls to merge
        merge(arr,start,mid);
        merge(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }
    

    public static void main(String[] args) {
        int arr[]= {10,5,3,7,2,0};
        int n = arr.length;
        merge(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
            
        }
    }
}
