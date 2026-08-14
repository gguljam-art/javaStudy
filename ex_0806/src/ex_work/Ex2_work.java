package ex_work;
import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        //비교값으로 1 ~ 12월 사이의 값을 준비
        //준비된 비교값에 해당하는 달이 몇일 까지 있는지
        //-----------
        //3월은 31일까지 있습니다.

        //ver 1:
        // int n = (int)(Math.random() * 11) + 1;
        // System.out.println(n + "월 입니다.");
        // switch(n){
        //     case 1: System.out.println("1월은 31까지"); break;
        //     case 2: System.out.println("2월은 28까지");break;
        //     case 3: System.out.println("3월은 31까지");break;
        //     case 4: System.out.println("4월은 30까지");break;
        //     case 5: System.out.println("5월은 31까지");break;
        //     case 6: System.out.println("6월은 30까지");break;
        //     case 7: System.out.println("7월은 31까지");break;
        //     case 8: System.out.println("8월은 30까지");break;
        //     case 9: System.out.println("9월은 31까지");break;
        //     case 10: System.out.println("10월은 30까지");break;
        //     case 11: System.out.println("11월은 31까지");break;
        //     case 12: System.out.println("12월은 30까지");break;
        //     default: System.out.println("날짜를 잘못입력하였습니다.");break;
        // }
        
        //ver 2:
        int n = (int)(Math.random() * 11) + 1;
        System.out.println(n + "월 입니다.");
        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 날짜:");
        n = sc.nextInt();

        if(n > 12) n = (n%12)+1;
        System.out.println("입력:" + n);

        if(n == 2) System.out.println("2월은 28까지");
        else{
            int i = n % 2 == 0 ? 1:2;
            switch(i){
                case 1 : System.out.println(n + "월은" + "30까지"); break;
                case 2 : System.out.println(n + "월은" + "31까지"); break;
                default: System.out.println("날짜를 잘못입력하였습니다.");break;
            }
        }

        //ver3:
        // n = (int)(Math.random() * 11) + 1;
        // System.out.println(n + "월 입니다.");

        // switch(n){
        //     case 1 : case 3: case 5: case 7: case 9: case 11: System.out.println(n + "월은" + "31까지"); break;
        //     case 2 : System.out.println(n + "월은" + "28일 까지"); break;
        //     case 4: case 6: case 8: case 10: case 12: System.out.println(n + "월은" + "30까지"); break;
        //     default: System.out.println("날짜를 잘못입력하였습니다.");break;
        // }
    }
}
