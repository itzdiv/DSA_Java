import java.util.*;


public class revstrn {

    public static void revstr(String s, int ind){
        if(ind==0){
            System.out.print(s.charAt(ind));
            return;
        }

        System.out.print(s.charAt(ind));

        revstr(s, ind-1);
        

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Print a string to be reversed: ");
        String s= sc.nextLine();
        int n = s.length()-1;
        sc.close();
        System.out.println("");
        revstr(s,n);

        
        
    }
    
}
