public class dequeue_ll {
    public static class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static class Queue {
        public static Node head;
        public static Node tail;

       

        

        //empty check!

        public boolean isEmpty(){
            return head==null && tail==null;
        }

        //enqueue

        public void add(int data){

            Node newNode = new Node(data);
            
            if (isEmpty()) {

                head=tail=newNode;
                
            }else{
           
            tail.next=newNode;
            tail=newNode;}
        }

        //dequeue

        public int remove(){

            if(isEmpty()){
                System.out.println("No queue was found!");
                return -1;
            }

            
            int eliment=head.data;
            head=head.next;

            if (head == null) {
                tail = null;
            }

            

            return eliment;

        }
           //peek
        public void peek(){
            if(isEmpty()){
             System.out.println("Queue is empty");
            }
            
            System.out.println(head.data);
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            while(!q.isEmpty()){
                q.peek();
                q.remove();
            }

        }
    
        
    }
    
}

