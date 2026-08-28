package src.ex8_work;

public class WorkSub {
    public int[] myCoin(int[]coin, int r){
        int[] cnt = new int[coin.length];

        for(int i = 0; i < coin.length; i++){
            cnt[i] = r/coin[i];
            r %= coin[i];
        }

        return cnt;
    }
}
