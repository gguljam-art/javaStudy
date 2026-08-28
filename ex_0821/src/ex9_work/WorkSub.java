package src.ex9_work;

public class WorkSub {
    //렌덤 난수 생성기
    public void randNum(int[]lotto){
        int cnt = 0;
        while(cnt < 6){
            int r = (int)(Math.random()*45+1);

            boolean b = true;
            for(int i = 0; i < lotto.length; i++){
                if(r == lotto[i]){
                    b = false;
                    break;
                }
            }

            lotto[cnt] = r;
            if(b) cnt++;
        }
    }
}
