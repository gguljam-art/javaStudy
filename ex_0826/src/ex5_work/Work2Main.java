package ex5_work;

import java.util.ArrayList;

public class Work2Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5;){
            int r = (int)(Math.random()*30)+1;
            if(list.contains(r)) continue;
            list.add(r);
            i++;
        }

        System.out.println(list);

        int max = -999999;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }

        System.out.println("가장 큰 수: " + max);
    }
}
