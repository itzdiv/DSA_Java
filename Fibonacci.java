import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        
        System.out.println("Fibonacci series up to " + limit + " terms:");
        int prev = 0;
        int curr = 1;
        int next;

        for (int i = 0; i < limit; i++) {
            System.out.print(prev + " ");
            next = prev + curr;
            prev = curr;
            curr = next;
        }
    }
}
