import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        
    
   LinkedList<String> list= new LinkedList<String>(); 
   //print nth node from last;
   list.add("one");
   list.add("two");
   list.add("three");
   list.add("four");
   list.add("five");
   System.out.print("List Before : ");
   System.out.println(list);

   Scanner sc = new Scanner(System.in);
   System.out.print("Give the number n: ");
   int n = sc.nextInt();
   sc.close();
   int index = list.size()-1-n;
   System.out.print("Your element is:");
   System.out.println(list.get(index));

   list.remove(index);
   System.out.print("List after:");
   System.out.println(list);



}
}
