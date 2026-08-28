public class MethodMain {
    public static void main(String[] args) {
        Methodtest m1 = new Methodtest();
        m1.test01();
        int su = 100;
        su = m1.test02(su);

        System.out.println("su: " + su);
        System.out.println(su);
    }
}
