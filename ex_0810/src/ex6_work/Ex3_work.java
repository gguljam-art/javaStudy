package ex6_work;
import java.util.Arrays;

public class Ex3_work {
    public static void main(String[] args) {
        //주사위 두개를 던졌을 때
        //합이 5,6,7이 되는 경우의 수를 찾아 출력
        //----------------
        //5: 1 4  2 3  3 2  4 1
        //6: 1 5  2 4  3 3  4 2  5 1

        String s1 = "";
        String s2 = "";
        String s3 = "";

        for(int i = 1; i<=6; i++){
            for(int j = 1; j<=6; j++){
                if(i + j == 5){
                    s1 += i + " " + j + "  ";
                }
                if(i + j == 6){
                    s2 += i + " " + j + "  ";
                }
                if(i + j == 7){
                    s3 += i + " " + j + "  ";
                }
            }
        }

        System.out.println("5: " + s1);
        System.out.println("6: " + s2);
        System.out.println("7: " + s3);

        int[] aa = new int[10];
        Arrays.fill(aa,0,10, Integer.MAX_VALUE);
        for(int a : aa){
            System.out.print(a + " ");
        }

    }
}
