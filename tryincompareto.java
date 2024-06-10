public class tryincompareto {
    
    public static void main(String[] args) {
        String c1="tany";
        String c2="tony";
        int c= c1.compareTo(c2);
        System.out.println(c);

        System.out.println("Here Comes the fun part");
        int d= (new String("lul")).compareTo(new String("lol"));
        System.out.println(d);
    }
}
