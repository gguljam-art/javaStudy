package ex_work;
import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {
        //키보드에서 홀수만 입력을 받는다.
        //홀수: 3
        // 8 1 6
        // 3 5 7
        // 4 9 2
        //맨 위의 가운데에 1이 들어온다.
        //한칸 위, 한칸 오른쪽으로 이동하며 1씩 증가한다.
        //맨위, 맨 오른쪽을 벗어나면, 맨 아래, 맨 왼쪽부터 시작한다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("크기: ");
        if(n%2==0) n++;

        int[][] arr = new int[n][n];

        int x = (n-1)/2;
        int y = 0;

        for(int i = 1; i <= n*n;i++){
            if(arr[y][x] == 0){
                arr[y][x] = i;
            }
            else{
                y = y + 1 == n ? 0 : y + 1;
                y = y + 1 == n ? 0 : y + 1;
                x = x - 1 < 0 ? n-1 : x - 1;
                arr[y][x] = i;
            }

            x = x + 1 == n ? 0 : x + 1;
            y = y - 1 < 0 ? n-1 : y - 1;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%02d  ",arr[i][j]);
            }
            System.out.println();
        }

        //while문
        System.out.println();

        int[][] arr2 = new int[n][n];
        int x2 = (n-1)/2;
        int y2 = 0;

        int step = 1;
        while(step <= n*n){
            arr2[y2][x2] = step;
            
            if(step % n == 0){
                y2++;
            }else{
                y2--;
                x2++;
            }
            if(y2 < 0)
                y2 = n - 1;
            if(x2 >= n)
                x2 = 0;
            step++;
        }

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.printf("%02d  ",arr2[i][j]);
            }
            System.out.println();
        }
    }
}
