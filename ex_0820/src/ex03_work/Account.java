package src.ex03_work;

public class Account {
    public static void main(String[] args) {
        /*
        1.  입   금: 
        2.  출   금:
        3.  잔액확인:
        ect.종   료:
        
        >> 1
        --입  금--
        입금액: 1000
        최종 잔액: 11000
        입금성공
        //메인화면으로 돌아감.

        >> 3
        --잔액확인--
        11000원
        //메인화면으로 돌아감.
        //종료가 되기 전까지 처리
        //atm을 종료합니다.
        */

        int index = 0;
        Atm atm = new Atm();
        boolean b = true;

        outer : while(b){
            if(atm.getcnt() == 0){
                System.out.println("atm에 오신걸 환영합니다.");
                atm.setcnt();
            }
            switch (index) {
                case 0:
                    index = atm.mainScrren();
                    continue;
                case 1:
                    index = atm.Deposit();
                    continue;
                case 2:
                    index = atm.Withdrawal();
                    continue;
                case 3:
                    index = atm.BalanceCheck();
                    continue;
            
                default:
                    System.out.println("atm을 종료합니다.");
                    b = false;
                    break outer;
            }
            
        }

    }
}
