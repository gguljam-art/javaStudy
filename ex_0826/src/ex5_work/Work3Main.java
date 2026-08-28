package ex5_work;

import java.util.ArrayList;
import java.util.Scanner;

public class Work3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();

        final int F_CNT = 5;
        int cnt = 0;

        while(cnt < F_CNT){
            System.out.print("입력: ");
            String inStr = sc.next();
            al.add(inStr);
            cnt++;
        }

        int crrIndex = -1;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < al.size(); i ++){
            int len = al.get(i).length();
            if(len > max){
                max = len;
                crrIndex = i;
            }else if(len == max){
                crrIndex =
                    Integer.parseInt(al.get(i)) > Integer.parseInt(al.get(crrIndex))?
                    i:crrIndex;
            }
        }

        System.out.println("가장 긴 문자열: " + al.get(crrIndex));
    }
}
