import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        //1 ~ 45사이의 중복되지 않는 난수 6개를 출력하는
        //로또번호 생성기 만들기
        //-------------------
        //17 2 45 27 9 11

        int[] lotto = new int[6];
        int n = 0;

        while(n < 6){
            // int r = new Random().nextInt(45) + 1;
            int r = (int)(Math.random() * 45)+1;
            boolean b = true;
            for(int i = 0; i < lotto.length; i++){
                if(lotto[i] == r){
                    b = false;
                    break;
                }
            }
    
            if(b){
                lotto[n] = r;
                n ++;
            }
        }

        for(int i = 0; i < lotto.length; i++){
            System.out.printf("%02d ",lotto[i]);
        }

        //선생님 풀이

        int[] lotto2 = new int[6];
        outer: for(int i = 0; i < lotto2.length;){
            int r = new Random().nextInt(45) + 1;
            for(int j = 0; j < lotto2.length; j++){
                if(lotto2[j] == r)
                    continue outer;
            }

            lotto2[i] = r;
            i++;
        };

        System.out.println();

        for(int i = 0; i < lotto2.length; i++){
            System.out.printf("%02d ",lotto2[i]);
        }

    }
}
