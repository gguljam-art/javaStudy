package ex2_statement;

public class Ex1_swich {
    public static void main(String[] args) {
        //switch-case문

        int n = 2;

        switch (n) {
            case 1+1:
                System.out.println("게임시작");
                break;
            case 2+1:
                System.out.println("설정");
                break;
            case 3+1:
                System.out.println("종료");
                break;
            default:
                break;
        }
    }
}
