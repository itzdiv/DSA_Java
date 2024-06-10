import java.util.*;
public class strREv_reduced_complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give you string that is to be reversed");
        String s= sc.nextLine();
        sc.close();
        StringBuilder sb= new StringBuilder(s);
        for (int i = 0; i < s.length()/2; i++) {
            int j = s.length()-1-i;
            int front =i;
            int back =j;
            char frontc= sb.charAt(i); 
            char backc= sb.charAt(j);
            sb.setCharAt(front, backc);
            sb.setCharAt(back, frontc);
            
        }
        System.out.print("This is your reveresed string: ");
        System.out.print(sb);
        
    }
    
}
