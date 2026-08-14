package ex2_work;
import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        //학생 수를 입력하세요: 3
        //학생 1의 성적: 90
        //학생 2의 성적: 73
        //학생 3의 성적 84
        //------------------
        //평균 성적: 82.333...
        //-- 평균 이상의 성적 --
        //=> 학생1: 90
        //=> 학생3: 84
        //평균 이상인 학생 수 : 2

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력 하세요:");
        int len = sc.nextInt();
        int[] ar = new int[len];
        int sum = 0;
        for(int i = 0; i < len; i++){
            System.out.print("학생" + (i+1) + ":");
            ar[i] = sc.nextInt();
            sum += ar[i];
        }
        System.out.println("---------------------");
        float ev = (float)sum / (float)len;
        System.out.printf("평균성적:%.2f\n",ev);
        System.out.println("-- 평균 이상의 성적 --");
        for(int i = 0; i < len; i++){
            if(ar[i] >= ev)
            System.out.printf("학생%d: %d \n",(i+1),ar[i]);
        }
    }
}
