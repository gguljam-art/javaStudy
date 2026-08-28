package ex6_work;

import java.util.ArrayList;
import java.util.Random;

public class Work01_Main {
    public static void main(String[] args) {
        //1 ~ 5개 난수를 추가해둔다
        //두개의 리스트의 값을 비교하여 교집합 출력

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        Random rn = new Random();
        for(int i = 0; i < 5; i++){
            al1.add(rn.nextInt(10)+1);
            al2.add(rn.nextInt(10)+1);
        }

        System.out.println(al1);
        System.out.println(al2);

        ArrayList<Integer> crrN = new ArrayList<>();
        for(int i = 0; i < al1.size(); i++){
            if(al2.contains(al1.get(i)) && !crrN.contains(al1.get(i))){
                    crrN.add(al1.get(i));
            }
        }

        crrN.sort(null);
        System.out.println(crrN);
    }
}
