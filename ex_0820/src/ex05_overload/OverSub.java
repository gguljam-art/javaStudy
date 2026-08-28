package src.ex05_overload;

public class OverSub {
    //오버로딩은 메서드의 '중복정의'라고 한다.
    //하나의 클레스 내에서 같은 이름을 가진 메서드가 여러개 저의할 수 있도록 하는 것
    public void result(){
        System.out.println("인자가 없는 메서드");
    }

    public void result(int n) {
        System.out.println("정수를 인자로 받는 메서드");
    }

    public void result(char c){
        System.out.println("문자를 인자로 받는 메서드");
    }

    public void result(String s){
        System.out.println("문자열을 인자로 받는 메서드");
    }

    public void result(int n,String a){
        System.out.println("정수 문자열을 인자로 받는 메서드");
    }

    public void result(String s, int n){
        System.out.println("문자열을 먼저 받고 정수를 나중에 받는 메서드");
    }
}
