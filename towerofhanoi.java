import java.util.*;
public class towerofhanoi {

    public static void hanoi(int n,String s ,String h , String d){
        if(n==1){
            System.out.println("Transfer disk : "+n +" from "+ s +" to " +d);
            return;
        }
        hanoi(n-1,s,d,h);
        System.out.println("Transfer disk : "+ n +" from "+ s +"  to " +d);
        hanoi(n-1,h,s,d);
        
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the number of disk you are inserting:");
        int n=sc.nextInt();
        sc.close();
        hanoi(n,"Source","Helper","Destination");
        
    }
    
}
