import java.util.*;
public class stringtoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Lets do string to int:");
        System.out.println("Please enter string in for of integer to see th magivc 🥹");
        String s= sc.nextLine();
        int conversion=Integer.parseInt(s);
        System.out.println("This is now converted to integer  : "+conversion);
        System.out.println("Now to verify this , Whatever Number you gave shall be multiplied by 2  : "+ conversion*2);

    }
    
}
