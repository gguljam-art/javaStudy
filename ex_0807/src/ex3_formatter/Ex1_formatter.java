package ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {
        //저의 나이는 20살 입니다.
        int age = 20;
        String s = "저의";
        float f = 1.1f;
        System.out.printf("%s 나이는 %d살 입니다.%f\n",s,age,f);

        //저는 20살이고 층에살아요.
        int age2 = 20;
        int value = 3;
        System.out.printf("저는 %d살이고 %d층에 살아요.",age2,value);

        //나는 박씨야
        System.out.printf("\n나는 %c씨야",'박');

        //나는 a형이야
        System.out.printf("\n나는 %C형이야", 'a');

        //원주율은 3.141592
        System.out.printf("\n원주율: %.2f",3.141592);

        //저는 홍길동 입니다.
        System.out.printf("\n저는 %s 입니다.", "홍길동");

        System.out.printf("\n%s\t %d\t %d", "김윤",100, 95);
        System.out.printf("\n%s\t %d\t %d", "김길동",100, 7);

        //오늘 강수량은 15%입니다.
        System.out.printf("\n오늘 강수량은 %d%%입니다.",15);
    }

    /*
    formatter의 문법
    \n: 강제개행
    %d: 정수타입
    %s: String
    %f: 실수타입
    %c: char
    %C: 대문자로 변환해 출력
    %%: %특수문자
    */
}
