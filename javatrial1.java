import java.util.*;

public class javatrial1 {

    public static int funcFactorial(int n){
        if(n==1){
            return 1;
        }
        
        return n * funcFactorial(n-1);
    }

    public static void funcOpr(int a , int b , String operation) {

        switch (operation.toLowerCase()) {
            case "add":
            System.out.println (a+b);
                break;

            case "subtract":
            System.out.println (a-b);
                break;
            
            case "multiply":
            System.out.println (a*b);
                break;

            case "divide":
            System.out.println (a/b);
                break;
        
            default:
            System.out.println("error wrong input...");
            funcOpr(a, b, operation);

                break;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Hey, is this working? [yes/no] ");
        Scanner sc = new Scanner(System.in);
        String work = sc.nextLine();
        
        if (work.toLowerCase().equals("yes")) {
            System.out.println("Hey thank you for answering!\n");
            
            try{
                Thread.sleep(2000);
            System.out.println("Whats your name: ");
            String userName= sc.nextLine();
            System.out.println("Processing...");
            Thread.sleep(4000);
            System.out.println("Welcome "+userName+ " to the program first we shall try swich case functionality:\n");
            Thread.sleep(3000);
            System.out.println("Lets try the calculator function:\n");
            Thread.sleep(3000);
            System.out.println("Enter numbers and operations, for e.g: \nnumber1 number2 \nOperation[add,subtract,multiply,divide]");
            Thread.sleep(3000);
            System.out.println("Enter the numbers:");
            int arr1[] = new int[2];
            for(int i=0;i<2;i++){arr1[i]=sc.nextInt();}

            sc.nextLine();
            
            System.out.println("\nEnter operation to be performed: ");
            String operation= sc.nextLine();

            
            
            System.out.println("\nProcessing...");
            Thread.sleep(2000);

            System.out.println("Your solution is: ");

            funcOpr(arr1[0],arr1[1],operation);

            
            Thread.sleep(3000);
            System.out.println("Now "+ userName+ " we shall try recussion homie!");
            Thread.sleep(2000);
            System.out.println("We shall print factorial of a number: ");
            Thread.sleep(2000);
            System.out.println("Please enter the number for factorial:");
            int factorialNumber = sc.nextInt();
            System.out.println("Processing...");
            Thread.sleep(3000);
            int printFactorial= funcFactorial(factorialNumber);
            System.out.println("The factorial for your number is : "+printFactorial);
            Thread.sleep(2000);
            System.out.println("Thanks for trying our prdouct!");




            }catch(InterruptedException e)
            {e.printStackTrace();}finally{sc.close();}



        }

        else{
            System.out.println("It appears the program is not working ,we are working on the issue!" );
            sc.close();
        }
        
        
    }
}
