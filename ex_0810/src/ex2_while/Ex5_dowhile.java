package ex2_while;
import java.util.Random;

public class Ex5_dowhile {
    public static void main(String[] args) {
        //자바, jsp, 안드로이드의 시험을 봤다.
        //각 과목별 점수는 렌덤하게 0 ~ 130점이 대입되도록
        //각 과목별 점수를 검사하여
        //100점을 넘어가는 점수가 하나도 없을 때
        //최종 결과를 화면에 출력
        //자바:
        //jsp:
        //안드:

        int jav = 0;
        int jsp = 0;
        int adr = 0;

        int offset = 0;
        do{
            jav = new Random().nextInt(131);
            jsp = new Random().nextInt(131);
            adr = new Random().nextInt(131);
            offset++;
        }while(jav>100 || jsp>100 || adr>100);
        System.out.println("offset:" + offset);
        System.out.printf("자바:%d", jav);
        System.out.printf("\njsp:%d",jsp);
        System.out.printf("\n안드:%d",adr);
    }
}
