package ex5_work;

import java.util.ArrayList;
import java.util.Scanner;

public class Work6Main {
    public static void main(String[] args) {

        //내가 입력한 문장과동일한 값이
        //몇번째 인덱스에 있는지 찾아내기

        Scanner sc = new Scanner(System.in);
        String[] strArr = {"Red","Blue", "Green", "Yellow"};

        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            al.add(strArr[(int)(Math.random()*strArr.length)]);
        }

        System.out.print("찾을 색상:");
        String str = sc.next();
        
        System.out.println(al);

        ArrayList<Integer>inArr = new ArrayList<>();

        for(int i = 0; i < al.size(); i++){
            if(str.equals(al.get(i))){
                inArr.add(i);
            }
        }

        System.out.println(str + "의 모든 인덱스: " + inArr);
    }
}
