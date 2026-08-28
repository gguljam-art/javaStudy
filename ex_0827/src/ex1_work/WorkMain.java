package ex1_work;

import java.util.ArrayList;

public class WorkMain {
    public static void main(String[] args) {
        
        ArrayList<Stu>stuList = new ArrayList<>();

        Stu st = new Stu("홍길동");
        st.setSubject("국어", 99);
        st.setSubject("영어", 87);
        stuList.add(st);

        Stu st2 = new Stu("임길동");
        st2.setSubject("국어", 75);
        st2.setSubject("영어", 80);
        stuList.add(st2);

        int sum = 0;
        for(int i = 0; i < stuList.size(); i++){
            System.out.println("-------------");
            stuList.get(i).getInfo();
            sum += stuList.get(i).getSum();
            System.out.println("평균: " + stuList.get(i).ev);
        }

        float ev = (float)sum / stuList.get(0).subject.size() / stuList.size();
        System.out.println("\n반 평균: " + ev);
    }
}
