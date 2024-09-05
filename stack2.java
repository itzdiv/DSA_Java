import java.util.ArrayList;
import java.util.Stack;
public class stack2 {
    static class stack{
        //implementing
        static ArrayList<Integer> list = new ArrayList<>();


        //pussh
        public static void push(int data){
            list.add(data);
        } 

        //is empty

        public static boolean isEmpty(){
            return list.size()==0;
        } 

        //pop

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        
        //peek

        public static int peek(){
            int top = list.get(list.size()-1);
            return top;
        } 
    }

    public static void main(String[] args) {
        Stack s = new Stack();
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
 

