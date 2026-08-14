import java.util.Random;
public class Ex3_work {
    public static void main(String[] args) {
        //A~Z값중 하나를 렌덤하게 출력
        //ver1:
        int min = 'A';
        int max = 'Z';
        int r = new Random().nextInt(max-min+1) + min;
        System.out.println((char)r);
        
        //ver2:
        int r2 = new Random().nextInt('Z'-'A'+1) + 'A';
        System.out.println((char)r2);
        
        //ver3:
        int r3 = (int)(Math.random() * ('Z' - 'A' + 1)) + 'A';
        System.out.println((char)r3);
    }
}
