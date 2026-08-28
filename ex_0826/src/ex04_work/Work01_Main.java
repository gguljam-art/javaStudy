package ex04_work;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Work01_Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("id: ");
            String s = sc.next();
            
            if(!list.contains(s)){
                list.add(s);
                System.out.println(list);
            }
            else{
                System.out.println(s + "회원은 이미 존재함");
            }
                
        }
    }
}
