package src.ex04_work;

public class Vending {
    private Can[] cans = new Can[5];
    private int money;
    //자판기에서 관리할 음료수를 준비

    // public void init(){
    //     for(int i = 0; i < cans.length; i++){
    //         cans[i] = new Can();
    //     }

    //     cans[0].setName("환타");
    //     cans[0].setPrice(1000);
    //     cans[1].setName("사이다");
    //     cans[1].setPrice(1200);
    //     cans[2].setName("콜라");
    //     cans[2].setPrice(1500);
    //     cans[3].setName("핫씩스");
    //     cans[3].setPrice(2000);
    //     cans[4].setName("암바싸");
    //     cans[4].setPrice(1300);
    // }//init

    public Vending(){
        cans[0]= new Can("환타"     ,1000);
        cans[1]= new Can("사이다"   ,1200);
        cans[2]= new Can("콜라"     ,1500);
        cans[3]= new Can("핫씩스"   ,2000);
        cans[4]= new Can("암바싸"   ,1300);
    }

    //사용자의 돈을 받는다
    //이 돈으로 먹을 수 있는 음료 목록만 보여주기
    public void sowDringk(int inMoney){
        for(int i = 0; i < cans.length; i++){
            if(cans[i].getPrice() <= inMoney){
                System.out.printf(
                    "%s, %d원\n"
                    ,cans[i].getName()
                    ,cans[i].getPrice()
                );
            }
        }//for

        this.money = inMoney;

        System.out.print(">> ");

    }//sowDtingk

    //사용자가 음료수를 선택하면
    //해당 음료수를 제공하고 잔돈을 돌려준다.
    //잔돈뱉어내기
    public void dispense(String name){
        for(int i = 0; i < cans.length; i++){
            if(cans[i].getName().equals(name)){
                System.out.println(name+"을(를) 선택함");
                this.money -= cans[i].getPrice();

                System.out.println("잔액: " + this.money);
                return;
            }
        }
    }//dispense

}
