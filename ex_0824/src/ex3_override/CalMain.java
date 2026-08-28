package ex3_override;

public class CalMain {
    public static void main(String[] args) {
        CalPlus cp = new CalPlus();
        int n1 = cp.getResult(10,20); // -> 30
        CalMinus cm = new CalMinus();
        int n2 = cm.getResult(10,20); // -> -10

        System.out.println(n1 + "," + n2);
    }
}
