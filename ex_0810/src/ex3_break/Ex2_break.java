package ex3_break;

public class Ex2_break {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            switch(i){
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.print("case 2: ");
                    break;
                case 3:
                    System.out.print("case 3: ");
                    break;
            }
            System.out.println("i의 값:" + i);
        }
    }
}
