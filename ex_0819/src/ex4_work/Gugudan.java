package ex4_work;

public class Gugudan {
    //구구단을 출력하는 메서드 생성
    public void gugu(int n){
        System.out.println(n+"단");
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }
}
