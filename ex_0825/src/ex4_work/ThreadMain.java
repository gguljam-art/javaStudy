package ex4_work;

public class ThreadMain {
    public static void main(String[] args) {
        //키보드에서 정수를 입력받고
        //입력받은 숫자가 1초에 1씩 감소되면서 출력되다가
        //0이 되었을 때 프로그램을 종료
        //(sub클레스는 반드시 thread를 상속받도록 한다)
        //-------------------------
        //입력: 3

        int n = 9;
        ThreadSub ts = new ThreadSub();
        ts.fac(n);
    }
}
