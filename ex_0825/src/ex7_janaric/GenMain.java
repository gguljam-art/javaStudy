package ex7_janaric;

public class GenMain {
    public static void main(String[] args) {
        GenTest<String> g1 = new GenTest<>();
        g1.setValue("asdf");
        String res = g1.getValue();
        System.out.println(res);

        
    }
}
