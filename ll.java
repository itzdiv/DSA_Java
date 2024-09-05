public class ll {
    private int size;
    ll(){
        this.size=0;
    }
    Node head;
    class Node{
        Node next;
        String data;
        Node (String data){
            this.data= data;
            size++;
            this.next = null;
        }
    }

    public int size(){
        return size;
    }

    public void deleteFirst(){
        if (head==null){
            
            System.out.println("List is empty!");
            return;
        }

        head=head.next;
    }

    public void deleteLast(){

        if (head==null){
            System.out.println("List is empty!");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node currNode = head;
        while(currNode.next.next !=null){
           currNode=currNode.next;
        }
        currNode.next=null;


    }

    public void addFirst(String data){
        Node newNode = new Node(data); 
        if (head==null){
            head = newNode;
            return;
        }

        newNode.next=head;
        head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data); 
        if (head==null){
            head = newNode;
            return;
        }

        Node currNode=head;

        while(currNode.next !=null){
            currNode=currNode.next;
        }

        currNode.next = newNode;


    }
    

    public void printList(){
        
        if (head==null){
            System.out.println("List is empty!");
            return;
        }

        Node currNode=head;

        while(currNode !=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }

        System.out.print("Null");
        

    }

   

    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst("first");
        list.addLast("second");
        list.addLast("third");
        list.addLast("fourth");
        list.addLast("fifth");
        list.printList();

        

    }
    
}
