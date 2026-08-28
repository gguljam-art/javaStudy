package ex8_set;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        //중복된 값을 추가하지 않는다.
        set.add(150);
        set.add(100);
        set.add(50);
        set.add(170);
        
        //set의 모든 내용을 비운다.
        set.clear();

        System.out.println("------------");

        Set<Integer> set2 = new HashSet<>();
        while(set2.size() < 6){
            int rand = (int)(Math.random() * 45) +1;
            set2.add(rand);
        }

        System.out.println(set2);

        int[] narr = new int[set2.size()];
        int index = 0;
        for(int i : set2){
            narr[index]=i;
            System.out.print(narr[index] + " ");
            index++;
            System.out.print(i + " ");
        }

    }
}
