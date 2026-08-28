package src.ex03_work;

import java.util.Scanner;

public class Atm {
    Scanner sc = new Scanner(System.in);

    private int balance = 0;//잔액
    private int cnt = 0;
    public void setcnt(){
        cnt++;
    }
    public int getcnt(){
        return cnt;
    }

    public int mainScrren(){
        System.out.println("\n-- 처리할 업무를 선택하세요 --");
        System.out.println("1.  입   금:");
        System.out.println("2.  출   금:");
        System.out.println("3.  잔액확인:");
        System.out.println("ect.종   료:");
        System.out.print(">>");
        return sc.nextInt();
    }

    public int Deposit(){
        //입금
        System.out.println("\n--입   금--");
        System.out.print("입금액: " );
        int n = sc.nextInt();

        balance += n;
        System.out.println("입금 후 잔액: " + balance);

        System.out.println("첫 화면으로 돌아갑니다.");
        return 0;
    }

    public int Withdrawal(){
        //출금
        System.out.println("--출   금--");
        boolean b = true;

        while(b){
            System.out.print("출금액: " );
            int n = sc.nextInt();
            if(n > balance)
                System.out.println("출금할 수 없습니다.");

            else{
                balance -= n;
                System.out.println("출금 후 잔액: "+balance);
                b = false;
                break;
            }
        }

        System.out.println("첫 화면으로 돌아갑니다.");
        return 0;
    }

    public int BalanceCheck(){
        //잔액확인
        System.out.println("--잔액확인--");
        System.out.println("잔액: " + balance);

        System.out.println("아무키나 입력하세요.");
        System.out.print(">>");
        sc.nextInt();
        return 0;
    }
}
