// stack using utility package
import java.util.Stack;
public class stack3 {

     //question : push element at bottom of stack
     public void reverseStack(int data,Stack<Integer> s){
        int top;
        if(s.empty()){
            s.push(data);
            return;
        }

        top = s.pop();
        reverseStack(data, s);
        s.push(top);
        
    }

    public void printTillZero(int n){
        if(n==0){
            return ;
        }

        printTillZero(n-1);
        System.out.println(n);
    }

    public void everse(int n){
        
        if(n==0){
            return;
        }
        System.out.println(n--);
        everse(n);
        

        
    }



    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // 4 function 1.push 2. peek 3. pop 4.isEmpty() 

        stack3 obj = new stack3();
        s.push(1);
        s.push(2);
        s.push(3);
        obj.everse(10);
        obj.reverseStack(4,s);
        obj.printTillZero(10);

        while (!s.isEmpty()) {

            System.out.println(s.peek());
            s.pop();
            
        }
    }


    
}
