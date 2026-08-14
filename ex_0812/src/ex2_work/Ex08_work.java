package ex2_work;

public class Ex08_work {
    public static void main(String[] args) {
        
        //변수 money에 10원에서 5000원 사이의 난수를 발생시킨다.
        //단, 발생한 난수 money는 1의 자리가 반드시 0이 되도록 한다.
        //money를 최소한의 동전으로 몇 개씩 거슬러지는지 출력

        int money = (int)(Math.random() * 5000 + 1) * 10;
        System.out.printf("머니: %d원 \n",money);
        //-----------------
        //금액: 2590
        //500원: 5개
        //100원: 0 -> 출력 안함
        //50원: 1개
        //10원: 4개
        int[] coin = {500, 100, 50, 10};
        int n = money;
        for(int i = 0; i < coin.length; i++){
            int n1 = n/coin[i];
            n = n%coin[i];
            if(n1 != 0)System.out.printf("%d원: %d\n", coin[i], n1);
        }
    }
}
