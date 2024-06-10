import java.util.*;
public class strnbldr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now we will try using stringbuilder ");
        String str= sc.nextLine();
        StringBuilder strb= new StringBuilder(str);
        System.out.println(strb.charAt(3));
        strb.insert(3, "9");
        System.out.println(strb);
        


    }
    
}
