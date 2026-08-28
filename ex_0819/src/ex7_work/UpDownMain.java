package ex7_work;

import java.util.Scanner;

public class UpDownMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int r = (int)(Math.random()*100) + 1;
        System.out.println(r);

        while(true){
            System.out.print("값:");
            int n = sc.nextInt();
            
            if(n > r) System.out.println("Down");
            else if(n < r) System.out.println("UP");
            else{
                System.out.println(cnt +"회 차");
                System.out.println("정답입니다.");
                break;
            }
            cnt ++;
        }
    }
}
