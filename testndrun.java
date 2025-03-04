public class testndrun {

    public static void printnum(int n){
        if(n>0) {
             System.out.println("Recurssion Being called!");
            printnum(n-1);
            System.out.println(n);

            
        }
        
       
    }

    public static void main(String[] args) {
        printnum(5);
    }
    
}
