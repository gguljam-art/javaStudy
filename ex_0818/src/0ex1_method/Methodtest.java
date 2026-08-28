public class Methodtest {
    public void test01(){
        System.out.println("test1 메서드 호출");
    }
    public int test02(int n){
        n += 100;
        System.out.println("결과: " + n);
        return n;
    }
}
