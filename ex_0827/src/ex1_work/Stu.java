package ex1_work;

import java.util.HashMap;
import java.util.Map;

public class Stu {
    String name;
    Map<String, Integer> subject;
    int sum = 0;
    float ev = 0;

    Stu(String name){
        this.name = name;
        subject = new HashMap<>();
        subject.put("국어", 0);
        subject.put("영어", 0);
    }

    public void setSubject(String subName, int point){
        subject.put(subName, point);
        sum = 0;
        for(Map.Entry<String, Integer> ent : subject.entrySet()){
            sum += ent.getValue();
        }
        ev = (float)sum / subject.size();
    }

    public void getInfo(){
        System.out.println(name);

        for(Map.Entry<String, Integer> item : subject.entrySet()){
            System.out.print(item.getKey() + ": ");
            System.out.println(item.getValue());
        }
        System.out.println("총점: " + sum);
    }

    public int getSum(){
        return sum;
    }
}
