package ex5_work;

import java.util.ArrayList;
import java.util.Scanner;

public class Work5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inNum = 1;
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.print("입력종료: 0\n");
        while(inNum != 0){
            System.out.print("입력: ");
            inNum = sc.nextInt();
            if(inNum != 0)ar.add(inNum);
            //ar.add((int)(Math.random()*100)+1);
            //cnt++;
        }

        System.out.println(ar);
        
        System.out.println("숫자 범위를 입력하세요");
        System.out.print("시작: ");
        int start = sc.nextInt();
        System.out.print("끝: ");
        int end = sc.nextInt();

        int t = start;
        start = start < end ? start : end;
        end = end < t ? t : end;

        ArrayList<Integer>ar2 = new ArrayList<>();
        for(int i = 0; i < ar.size(); i++){
            if(start <= ar.get(i) && end >= ar.get(i)){
                ar2.add(ar.get(i));
            }
        }

        System.out.println(ar2);
        
        //-----------
        //숫자범위를 입력하세요
        //시작:
        //끝:

    }
}
