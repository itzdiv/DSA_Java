public class circularqueue_arr {

    public static class Queue {

        static int size;
        static int rear=-1;
        static int front=-1;
        static int arr[];

        Queue(int n){
            this.size=n;
            arr = new int[size];
        }

        //empty check!

        public boolean isEmpty(){
            return front==-1 && rear==-1;
        }

        //enqueue

        public void add(int data){
            if ((rear+1)%size == front) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {

                rear=front=0;
                
            }else{
                rear=(rear+1)%size;
            }
           
            arr[rear]= data;
        }

        //dequeue

        public int remove(){

            if(isEmpty()){
                System.out.println("No queue was found!");
                return -1;
            }

            
            int eleiment=arr[front];

            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            
            

            return eleiment;

        }
           //peek
        public void peek(){
            if(isEmpty()){
             System.out.println("Queue is empty");
            }
            
            System.out.println(arr[front]);
        }

        public static void main(String[] args) {
            Queue q = new Queue(3);
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
