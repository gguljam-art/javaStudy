package ex5_work;

public class CalculSub {
    public String calcul(int n1, int n2, String s){
        switch (s) {
            case "+":return ""+ (n1 + n2);
            case "-":return ""+ (n1 - n2);
            case "/":return ""+ ((float)n1 / n2);
            case "*":return ""+ (n1 * n2);
            default:
                return "연산기호가 올바르지 않습니다.";
        }
    }
}
