import java.util.*;
public class strung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This SHould take first input ");
        String lul = sc.nextLine() ;
        System.out.println(lul);
        System.out.println("This SHould take input again");
        String lol = sc.nextLine();
        System.out.println(lol);
        System.out.println("Now we will see the magic:");
        String c=lul+lol;
        System.out.println("This is c: " + c + "And this is sout combined:" + lul+lol);
        if(c.equals("an"+"an c")){
            System.out.println("HUrray!");
        }
        else{
            System.out.println("Used too much brain icic");
        }


        System.out.println("Now Now leaving all that aside we start new shit");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Mr Please give input in new line :");

        String namo= sc.nextLine();
        for(int i=0;i<namo.length();i++){
            System.out.println(namo.charAt(i));
        }


        
    }
    
}
