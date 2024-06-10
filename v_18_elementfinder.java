import java.util.*;
public class v_18_elementfinder{
    public static int first =-1;
    public static int last =-1;

    public static void find(String str, int index , char c){
        int curr=str.charAt(index);
        if(curr==c){
            if(first==-1){
                first = index;
                System.out.println("The first index at Character appeared was : "+ first);
            }
            else{
                last = index;
            }
        
        }

        if(index==str.length()-1){
           System.out.println("The Last index at Character appeared was : "+last);
           return;
        }

        find(str,index+1,c);
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String in which Elements Are to Be founded:");
    String s = sc.nextLine();
    System.out.println("Enter the character that neede to be found:");
    char c= sc.next().charAt(0);
    sc.close();
    find(s, 0, c);
    
}

}