package src.ex05_overload;

public class OverMain {
    public static void main(String[] args) {
        OverSub os = new OverSub();
        os.result();
        os.result(100);
        os.result('a');
        os.result("나나나");
        os.result(1,"aaa");
        os.result("aaa",1);
    }
}
