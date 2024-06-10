import java.util.*;
public class recursion {
    public static void printno(int n){
        if (n>100)
        return ;

        System.out.println(n);

        printno(n*n);

        


    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give number to be squared till 100: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("This is your number squared as closest to hundred:");
        printno(n);

    }
    
}
