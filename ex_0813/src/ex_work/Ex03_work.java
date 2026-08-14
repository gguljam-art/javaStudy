package ex_work;
import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
        int[][] arr = {
            //키보드에서 입력받은 값보다 큰 첫번 째 요소를 찾아 출력
            //---------
            //입력: 8;
            //결과: 10;
            {1,3,4,7},
            {10,2,9,3,8},
            {7,4,1},
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int n = sc.nextInt();
        boolean b = false;
        out:for(int i =0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                if(arr[i][j] > n) {
                    System.out.printf("결과: %d", arr[i][j]);
                    b = true;
                    break out;
                }
            }
        }

        if(!b)System.out.println("값이 없습니다.");
    }
}
