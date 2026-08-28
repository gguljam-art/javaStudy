package ex6_work;

public class GradeSub {
    public int grade(int n, String rat){
        if(rat.equals("vip")){
            return (int)(n * 0.1);
        }else if(rat.equals("gold")){
            return  (int)(n * 0.05);
        }else if(rat.equals("silver")){
            return  (int)(n * 0.03);
        }else{
            System.out.println("회원등급이 올바르지 않습니다.");
            return 0;
        }
    }
}
