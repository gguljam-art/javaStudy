package ex2_while;

public class Ex4_doWhile {
    public static void main(String[] args) {
        //do-while문:
        //선 처리 후 비교:

        int i = 11;
        do{
            System.out.println(i++);
        }while(i <= 10);
        System.out.println(i);
    }
}
