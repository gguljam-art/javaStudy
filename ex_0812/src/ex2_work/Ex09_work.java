package ex2_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {
        
        // 1 ~ 45사이의 중복되지 않는 난수 6개를 출력하는
        // 로또번호 생성기 만들기
        //--------------------
        // 00 00 00 00 00 00
        int[] lotto = new int[6];

        for(int i = 0; i < lotto.length; i ++){
            int n = 0;
            boolean b = true;
            while(b){
                n = (int)(Math.random() * 45 + 1);
                for(int j = 0; j < lotto.length; j++){
                    if(n == lotto[j]){
                        b = true;
                        break;
                    }
                    b = false;
                }
            }
            lotto[i] = n;
            System.out.print(n + " ");
        }
        System.out.println();
        
        //선생님 풀이 ----------------------------
        System.out.println("-----------------");

        int[] lotto2 = new int[6];

        outer : for(int i = 0; i < lotto2.length;){
            lotto2[i]= new Random().nextInt(6)+1;
            //중복값 비교
            for(int j = 0; j < i; j++){
                if(lotto2[i] == lotto2[j]) {
                    continue outer;
                }
            }
            System.out.print(lotto[i] + " ");
            i++;
        }

        
    }
}
