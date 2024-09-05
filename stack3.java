// stack using utility package
import java.util.Stack;
public class stack3 {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // 4 function 1.push 2. peek 3. pop 4.isEmpty() 
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {

            System.out.println(s.peek());
            s.pop();
            
        }
    }


    
}
