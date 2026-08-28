public class Kyochon {
    public static void main(String[] args) {
        //클레스의 다형성, 같은 클레스로 만들지만, 각각 다른 정보를 가진 서로 다른 객체로서 사용될 수 있다.
        Chicken ck1 = new Chicken();
        ck1.order();

        Chicken ck2 = new Chicken();
        ck2.name = "양념";
        ck2.price = 10000;
        ck2.order();
    }
}
