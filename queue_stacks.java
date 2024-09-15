import java.util.*;
public class queue_stacks {

    public static class queue{

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean empty(){

            return s1.isEmpty();
            
        }

        public void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
            }
            else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(data);
                while(!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }
        }

        public int remove(){
            if(s1.isEmpty()){
                System.out.println("No data present!");
                return -1;

            }
            return s1.pop();
        }

        public void peek(){
            if(s1.isEmpty()){
                System.out.println("No data found!");
                
            }
            System.out.println(s1.peek());
            }

    }

    
    public static void main(String[] args) {
        queue q = new queue();
            q.add(1);
            q.add(2);
            q.add(3);
            while(!q.empty()){
                q.peek();
                q.remove();
            }
        
    }
}
