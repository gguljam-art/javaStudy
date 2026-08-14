package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {
        
        //제어문 프로그램의 흐름을 제어하는 문장
        //분기문과 반복문으로 나뉜다
        //분기문 : if switch
        //반복문 : for, while, db-while
        
        //if문 
        //if ( 조건식){
        // 조건식이 참일 때 실행되는 영역
        //}
        

        // 변수 n을 49로 초기화
        int n = 49;
    

        // String은 쌍따옴표 안에 여러 글자(문자열)를 저장하기 위한 자료형
        String str = "";

        // n이 50과 같으면 str에 "n은 50입니다"를 저장
        if (n == 50) {
            str = "n은 50입니다";
        }

        // n이 50과 다르면 str에 "n은 50이 아닙니다"를 저장
        if (n != 50) {
            str = "n은 50이 아닙니다";
        }

        // str 값을 출력
        System.out.println(str);
    
    }
    
}
