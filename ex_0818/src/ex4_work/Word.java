package ex4_work;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        String str = sc.next();
        
        String rev = new CheckWorld().revers(str);

        if(str.equals(rev))
            System.out.println(str + "은(는) 회문입니다.");
        else
            System.out.println(str + "은(는) 회문이 아닙니다.");

        //ver3:
        StringBuffer sb = new StringBuffer(str);
        rev = sb.reverse().toString();

        if(str.equals(rev))
            System.out.println(str + "은(는) 회문입니다.");
        else
            System.out.println(str + "은(는) 회문이 아닙니다.");
    }
}
