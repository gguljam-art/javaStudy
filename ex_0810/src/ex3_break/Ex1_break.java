package ex3_break;

public class Ex1_break {
    public static void main(String[] args) {
        for(int i = 1; i <= 11; i++){
            for(int j = 1; j <= 10; j++){
                if(j%i == 0){
                    break;
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
