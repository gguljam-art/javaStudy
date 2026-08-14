package ex4_operator;

public class Ex3_oper {
    public static void main(String[] args) {

        //논리연산자
        //비교연산자를 통한 연산이 2개 이상일때 연결해주는 연산자
        int age = 30;
        int limit = 35;
        boolean res = ( limit - age ) > 5 && (age += 2) > 30;
         // &&(and)연산자 전항과 후항 모두 true여야함 
        // true&&true=true  
        // true&&false=false 
        // false&&true=false 
        // false&&false=false
        //전항이 false면 후항은 실행하지 않음 
        System.out.println("&&연산 : " + res);
        System.out.println("age : " + age);

        // ||(or)연산자 
        int i1 = 10;
        int i2 = 20;
        //or연산은 앞쪽 연산이 참이면 뒤쪽 연산을 수행하지 않는다
        //false ||false = false
        //false ||true = true
        //true ||false = true
        //true || true = true
    
        res = (i1 += 10) > 20 || i2 -10 ==11;
        System.out.println("||연산 : " + res); 

        //(not)연산자
        //참을 거짓으로 거짓을 참으로 변경하는 연산자
        System.out.println("!연산:"+!res);
        System.out.println(res);

        res = !res;
        System.out.println(res);


    }
    
}
