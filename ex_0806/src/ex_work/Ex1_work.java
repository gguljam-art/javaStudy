package ex_work;

public class Ex1_work {
    public static void main(String[] args) {

        //나이가15세 이상이거나, 키가 150cm이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력

        int age = 15;
        int cm =160;
        String res ="";
        
        if (age>= 15 || cm >150) {
            res= "탑승가능";

            
        }else{
            res="탑승불가";

        }
        
        System.out.println(res);


        //품질이 90이상 그리고 물량이 1500이상 이면 재고입고
        //그렇지 않으면 재고반품을 출력

        int n = 150;
        int n1= 15000;
        String str ="";
        
        if (n >= 100 && n1 >= 1500) {
            str= "재고입고";

        }else{
            str= "재고반품";
        }
        System.out.println(str);


        //품질이 100이면 1등급
        //90이상이면 2등급
        //70이상이면 3등급
        //70미만은 하품 
        //
        int p=100;
        String str1="";
        if (p == 100) {
            str1="1등급";
        }else if (p >= 90) {
            str1 ="2등급";
        }else if (p >= 70) {
            str1 = "3등급";
            
        }else{
            str1= "하품";
        }
        System.out.println(str1);

    }
    
}
