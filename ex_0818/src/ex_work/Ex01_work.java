import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 값이 회문인지 판단
        //--------------------------------
        //입력: abcba
        //abcba은(는) 회문입니다.
        //입력: abc
        //abc은(는) 회문이 아닙니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        String str = sc.next();
        boolean b = true;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                b = false;
                break;
            }
        }

        if(b)
            System.out.println(str + "은(는) 회문입니다.");
        else
            System.out.println(str + "은(는) 회문이 아닙니다.");

        //선생님 풀이
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }

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