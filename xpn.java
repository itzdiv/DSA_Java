public class xpn {

    public static void pow(int n, int x){

        if(n==1){
            System.out.println(x);
            return;
            
        }

        

        pow(--n,x*x);


    }

    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        pow(n, x);
    }
    
}
