public class xpnn {

    public static int pown(int n, int x)
    {
       
       if(n==0){
        return 1;
       }
       if (x==0)
       return 0;

      

       if (n%2==0){
       return pown(n/2,x) * pown(n/2,x);
       }
       else{
        return pown(n/2,x) * pown(n/2,x) * x;
       }
    }
    public static void main(String[] args) {
        int x=2;
        int n =6;
        int ans =pown(n, x);
        System.out.println(ans);

        
    }
    
}
