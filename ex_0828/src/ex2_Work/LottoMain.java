package ex2_Work;

import java.util.Random;

public class LottoMain {
    public static void main(String[] args) {
        
        int[] list = new int[6];
        Random rnd = new Random();
        int offset = 0;

        while(offset < 6){
            int r = rnd.nextInt(45) + 1;
            
            boolean b = true;
            for(int i = 0; i <list.length; i ++){
                if(list[i] == r){
                    b = false;
                    break;
                }
            }

            if(b){
                list[offset++] = r;
            }
        }

        for(int i = 0; i < list.length; i ++){
            System.out.printf("%02d ",list[i]);
        }
    }
}
