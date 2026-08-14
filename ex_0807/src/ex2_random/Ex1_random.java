package ex2_random;
import java.util.Random;

public class Ex1_random {
    public static void main(String[] args) {
        //new Random.nextInt(난수의 범위) + 시작수
        int n = new Random().nextInt(4) + 2;
        System.out.println(n);

        int min = 2;
        int max = 10;
        int rand = (int)(Math.random() * (max - min+1)) + min;
        System.out.println(rand);

        //2~9사이의 난수에 해당하는 구구단
        int n2 = new Random().nextInt(8)+2;
        for(int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d \n",n2,i,n2*i);
        }
    }
}
