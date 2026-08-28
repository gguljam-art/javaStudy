package ex3_throws;

public class WorkMain {
    public static void main(String[] args) {
        WorkSub1 w1 = new WorkSub1();
        WorkSub2 w2 = new WorkSub2();

        try {
            w1.result();
            w2.result();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
