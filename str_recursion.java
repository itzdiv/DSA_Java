import java.util.*;


public class str_recursion {

    public static void revstr(String s, int ind){
        if(ind==0){
            System.out.println("First element is: "+ s.charAt(ind));
            System.out.println("Last  elemrnt is : "+ s.charAt(s.length()-1));
            return;
        }

        

        

        revstr(s,ind-1);

        
        

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

