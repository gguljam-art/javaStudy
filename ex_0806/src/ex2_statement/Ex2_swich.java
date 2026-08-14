package ex2_statement;

public class Ex2_swich {
    public static void main(String[] args) {
        String str = "C";
        String res = "";

        switch (str) {
            case "A":
                res = "90 ~ 100";
                break;
            case "B":
                res = "80 ~ 90";
                break;
            case "C":
                res = "70 ~ 80";
                break;
            case "D":
                res = "60 ~ 70";
                break;
            case "F":
                res = "59점이하";
                break;
            default:
                res = "올바른 성적을 입력해라";
                break;
        }

        System.out.println(res);
    }
}
