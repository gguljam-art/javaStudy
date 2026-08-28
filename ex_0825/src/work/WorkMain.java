package work;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        //1 ~ 100사이의 난수 두개를 더하는 문제
        //키보드에서 답을 입력하여 다섯문제가 정답처리 될 때까지 로직을 반복
        //5문제를 모두 맞힐떄까지 몇 초가 걸렸는지를 출력하며 종료
        //1) 사용자가 문제의 정답으로 정수 이외의 값을 입력했다면
        //-> 정답은 정수로 입력하세요, 라는 오류 메시지 출력
        //2) 데몬스레드는 사용하지 않는다
        //-------------------------
        //23 + 48 = (정답을 받는다)
        //정답입니다.
        //22 + 100 = 
        //오답입니다.

        //50+15 == 정답입니다.
        //결과 : 24초

        int n1 = (int)(Math.random()*100)+1;
        int n2 = (int)(Math.random()*100)+1;

        boolean b = true;
        int cnt = 0;
        int chanscnt = 1;

        Scanner sc = new Scanner(System.in);
        ThreadSub ts = new ThreadSub();
        ts.start();

        while(cnt < 5){
            int answer = n1 + n2;
            System.out.printf("%d + %d = ", n1, n2);
            int inAnswer;
            try {
                inAnswer = sc.nextInt();
            } catch (Exception e) {
                System.out.println("정수로 입력하세요.");
                sc.nextLine();
                continue;
            }

            //정답일 때
            if(inAnswer == answer){
                cnt ++;
                if(cnt >= 5){
                    System.out.println(chanscnt + "회, " + "시간: " + ts.getTime() + "초");
                    ts.endThread();
                }

                System.out.println("정답입니다.");
                n1 = (int)(Math.random()*100)+1;
                n2 = (int)(Math.random()*100)+1;
                
            }else{
                System.out.println("오답입니다.");
            }
            chanscnt ++;
        }
    }
}
