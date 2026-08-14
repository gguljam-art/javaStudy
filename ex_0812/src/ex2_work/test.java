package ex2_work;

public class test {
    public static void main(String[] args) {
        int n = facto(3);
        System.out.println(n);
    }
    public static int facto(int in){
        int result = 1;
        for(int i = 2; i <= in; i++){
            result *= i;
        }
        return result;
    }
}
