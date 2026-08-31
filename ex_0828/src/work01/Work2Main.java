package work01;

import java.util.Random;
import java.util.Scanner;

public class Work2Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("아이디를 새로 생성하세요.");
        String user = sc.next();

        Work2reader reader = new Work2reader();
        //리더를 통해 유저데이터를 읽어들여옴.
        Work2User player =reader.userRead(user);

        Random rd = new Random();

        while(true){
            System.out.println("가위(s) | 바위(r) | 보(p) ? :");
            char inPut = sc.next().charAt(0);
            System.out.println(inPut);

            int rand = rd.nextInt(3);
            char randc = rand == 0 ? 's' :
                        rand == 1 ? 'r': 'p';

            player.addCnt();
            if(inPut == randc){
                System.out.println("비겼습니다.");
                player.addDraw();
            }
            else if(inPut == 's'){
                if(randc == 'p'){
                    player.addWin();
                    System.out.println("이겼습니다.");
                }else{
                    player.addLoss();
                    System.out.println("졌습니다");
                }
            }else if(inPut == 'r'){
                if(randc == 's'){
                    player.addWin();
                    System.out.println("이겼습니다.");
                }else{
                    player.addLoss();
                    System.out.println("졌습니다");
                }
            }else if(inPut == 'p'){
                if(randc == 'r'){
                    player.addWin();
                    System.out.println("이겼습니다.");
                }else{
                    player.addLoss();
                    System.out.println("졌습니다");
                }
            }
            
            System.out.printf("%d승, %d패, %d무"
                                    , player.getWin()
                                    , player.getLoss()
                                    , player.getDraw()
                                );

            System.out.println("한판더? y | n :");
            char fChar = sc.next().charAt(0);

            if(fChar == 'n') break;
        }
        System.out.println("게임이 종료되었습니다.");
        System.out.println("기록저장");
        new Work2save().gameSave(player);
    }
}