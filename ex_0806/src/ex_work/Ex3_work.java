package ex_work;
import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {
        
        //키보드에서 나이와 키를입력받는다
        //나이가 15세 이상이거나 키가 150이상이면 탑승가능
        //그렇지 않으면 탑승불가 출력

        //ver1:

        Scanner sc = new Scanner(System.in);
        System.out.print("나이:");
        int age = sc.nextInt();
        
        System.out.print("키:");
        int status = sc.nextInt();

        String s = "";
        s = (age >= 15 || status >= 150) ? "탑승가능" : "탑승불가능";
        System.out.println(s);

        //ver2:
        s = "";
        if(age >=15 || status >= 150) s = "탑승가능";
        else                          s = "탑승불가능";
        System.out.println(s);

        //ver3:
        if(age >=15 || status >= 150) System.out.println("탑승가능");
        else                          System.out.println("탑승불가능");

        //ver4:
        System.out.println((age >= 15 || status >= 150) ? "탑승가능" : "탑승불가능");
    }
}
