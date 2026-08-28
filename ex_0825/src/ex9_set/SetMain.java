package ex9_set;

import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        while(ts.size() < 6){
            int rand = (int)(Math.random()*45)+1;
            ts.add(rand);
        }

        for(int i:ts){
            System.out.print(i + " ");
        }
        
    }
}
