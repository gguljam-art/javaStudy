package ex10_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        while(map.size() < 6){
            int ran = (int)(Math.random()*6)+1;
            int ran2 = (int)(Math.random()*6)+1;
            map.put(ran,ran2);
        }

        for(Map.Entry<Integer,Integer>Ent : map.entrySet()){
            System.out.println(Ent.getKey()+":"+Ent.getValue());
        }
    }
}
