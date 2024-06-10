import java.util.*;

public class fctrl {

    public static void factr(int n, int fact){
        if(n <= 0){
            System.out.println(fact);
            return;
        }

        factr(n - 1, fact * n);
    }

    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number for factorial:");
        int n = sc.nextInt();
        sc.close();
        factr(n, fact);
    }
}
