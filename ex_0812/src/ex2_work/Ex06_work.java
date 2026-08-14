package ex2_work;
import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        //키보드에서 정수 10개를 입력받아 배열을 담고
        //가장 많이 등장한 정수와 등장 횟수를 출력
        //---------------------------------
        //정수:
        // 1
        // 1
        // 2
        // 2
        // 2
        // 3
        // 4
        // 2
        // 5
        // 6
        // 가장 많이 등장한 숫자 : 2
        // 등장횟수 : 4

        Scanner sc = new Scanner(System.in);
        System.out.println("정수:");

        int[] ar = new int[10];

        for(int i = 0; i < 10; i ++){
            ar[i] = sc.nextInt();
        }

        System.out.println("------------");

        for(int i = 0; i < ar.length;i++){
            for(int j = 0; j < ar.length;j++){
                if(ar[i] < ar[j]){
                    int t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }

        int max = 0;
        int maxitem = 0;
        int item = 0;
        int corrnt = 0;

        for(int i = 0; i < ar.length; i++){
            if(ar[i] != item){
                if(corrnt > max){
                    max = corrnt;
                    maxitem = item;
                }
                corrnt = 1;
                item = ar[i];
            }
            else corrnt++;
        }

        System.out.printf("가장많이 등장한 숫자: %d, 등장횟수: %d",maxitem,max);

        //--------------
        //선생님 풀이
        int[] ar2 = new int[10];
        System.out.println("정수:");
        for(int i = 0; i < 10; i++){
            ar2[i] = sc.nextInt();
        }
        int cout2 = 0;
        int max2 = 0;

        for(int i = 0; i < 10; i++){
            int cnt = 0;

            for(int j = 0; j < 10; j++){
                if(ar2[i] == ar2[j]) cnt ++;
            }
            if(cnt > cout2){
                cout2 = cnt;
                max2 = ar2[i];
            }
        }
        System.out.printf("가장많이 등장한 숫자: %d, 등장횟수: %d",max2,cout2);

    }
}
