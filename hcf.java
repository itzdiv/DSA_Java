import java.util.*;
public class hcf {

        public static void largest_divisor(int a,int b){

            int temp = 0;
            if (a > b) {
                temp = b;
            } else if (a == b) {
                System.out.println("Greatest Hcf is:" + a);
                return; // Return from the method if a and b are equal
            } else {
                temp = a;
            }
        
            for (int i = temp; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    temp = i;
                    break;
                }
            }
        
            System.out.println("\n\nThe greatest divisor is:\n" + temp);


        }

        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            System.out.println("Please give Vaiable a:");
            int a = sc.nextInt();
            System.out.println("Please give variable b");
            int b = sc.nextInt();
            largest_divisor(a, b);
        }
    
}
