public class queue_arr {

    public static class Queue {

        static int size;
        static int rear=-1;
        static int arr[];

        Queue(int n){
            this.size=n;
            arr = new int[size];
        }

        //empty check!

        public boolean isEmpty(){
            return rear==-1;
        }

        //enqueue

        public void add(int data){
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]= data;
        }

        //dequeue

        public int remove(){

            if(isEmpty()){
                System.out.println("No queue was found!");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {

                arr[i]=arr[i+1];
                
            }
            //decreasing size
            rear--;

            return front;

        }
           //peek
        public void peek(){
            if(isEmpty()){
             System.out.println("Queue is empty");
            }
            int front = arr[0];
            System.out.println(front);
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
