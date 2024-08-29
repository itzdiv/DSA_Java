class God{

    String man;
    void GodSpeaks(){
        System.out.println("You are honest!");
    }

    God(){

        System.out.println("God is watching!");

    }

}

class DemiGod extends God{

    DemiGod(){
        man="nima";
        System.out.println("This is the constructor od demigod in which their is single inheritance so the name of man in god is "+man);
    }

}

abstract class nono{
    nono(){
        System.out.println("This is abstract class constructor that will be called if even the function is created of it in extended classes");
    }
}

class abstract_trial extends nono{

    


}

public class oops {
    public static void main(String[] args) {
        God g1 = new God();
        g1.GodSpeaks();
        g1.man="Human";
        System.out.println(g1.man);

        System.out.println("This is example of construcot of abstract class being called as it is a parent :");
        System.out.println("");
        abstract_trial n1 = new abstract_trial();
        System.out.println("");


    }
    
}
