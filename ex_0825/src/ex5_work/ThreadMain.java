package ex5_work;

public class ThreadMain {
    public static void main(String[] args) {
        //arr에 담긴 값의 합을 A스레드가 계산
        //arr에 담긴 값의 곱을 B스레드가 계산해서 출력
        //-----------------
        //합:29
        //곱:3960

        int[] arr = {3,5,11,6,4};

        new ThreadA(arr).start();
        int multi = new ThreadB().multif(arr);
        
        System.out.println(multi);
    }
}
