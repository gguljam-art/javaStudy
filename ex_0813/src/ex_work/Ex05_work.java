package ex_work;
import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        //찾을 값: 10
        //10보다 큰 첫번째 요소: 11
        //해당 행의 모든 요소
        //9 10 11 12
        
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값:");
        int n = sc.nextInt();

        out: for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(n < arr[i][j]){
                    System.out.printf("%d보다 큰 첫번째 요소: %d\n", n, arr[i][j]);
                    System.out.println("해당 행의 모든 요소");
                    for(int k = 0; k < arr.length; k++){
                        System.out.print(arr[i][k] + " ");
                    }
                    break out;
                }
            }
        }
    }
}
