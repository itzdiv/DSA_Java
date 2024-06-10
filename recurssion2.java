import java.util.*;
public class recurssion2 {

    public static void sum(int i , int n , int summ ){

        if(n<=0){
            System.out.println(summ);
        return;
        }
        

        sum(i+1,--n,summ=summ+i);

       
        }

        


        
    
    public static void main(String[] args) {
        int i=1;
        int sum =0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Please give the times of nnumber you want the sum to be:");
        int n= sc.nextInt();
        sc.close();
        sum(i,n,sum);
        
    }
}
