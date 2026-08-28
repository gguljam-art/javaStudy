package src.ex6_work;

import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        //정수 : 9
        //9는(은) 소수가 아닙니다.
        //정수 : 7
        //7은(은) 소수가 입니다.

        Scanner sc = new Scanner(System.in);
        boolean ing = true;
        while(true){
            System.out.print("정수: ");
            int n = sc.nextInt();

            boolean b = new MathSub01().primalityTest(n);
            if(b) //&& n != 1)
                System.out.printf("%d은(은) 소수입니다.\n",n);
            else
                System.out.printf("%d은(은) 소수가 아닙다.\n",n);

            if(n == -1){
                ing = false;
                break;
            } 
        }
    }
}