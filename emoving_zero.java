public class emoving_zero {

    
    public static int[] lastZero(int arr[]) {
        int n = arr.length;
        int j = 0; 
        
        //shiftin eliments
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        
        
        while (j < n) {
            arr[j] = 0;
            j++;
        }

        return arr;
    }

    //ques2
    public static int max(int arr[]){
        int max=0;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {

            currSum += arr[i];
            if(currSum>max){
                max=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
            
        }
        return max;
    }

    public static void main(String[] args) {

        //quest 1................................................................................................
        int arr[] = {10, 20, 0, 0, 3, 0, 0};
        int zeroAtLast[] = lastZero(arr);

        
        System.out.print("[ ");
        for (int i = 0; i < zeroAtLast.length; i++) {
            System.out.print(zeroAtLast[i] + " ");
        }
        System.out.print("]");

        //ques 2.................................................................................................
  
    }
}
