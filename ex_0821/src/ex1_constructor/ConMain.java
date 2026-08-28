package src.ex1_constructor;

public class ConMain {
    
    public static void main(String[] args) {
        ConSub cs = ConSub.getinstanc();
        ConSub cs2 = ConSub.getinstanc();    

        if(cs == cs2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}