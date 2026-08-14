package ex2_work;
import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        //입력: 5
        //5개짜리 배열을 받는다
        //A부터 순차적으로

        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        int n = sc.nextInt();

        // if(n + 'A' > 'Z'){
        //     System.out.println("범위오류");
        //     return;
        // }

        char[] ar1 = new char[n];
        char c = 'A';

        for(int i = 0; i < ar1.length; i++){
            ar1[i] = c;
            c++;
            System.out.print(ar1[i] + " ");
        }
        //----------------
        System.out.println();
        char[] ar2 = new char[n];
        for(int i = 0; i < n; i++){
            ar2[i] = (char)('A' + (i%26));
            System.out.print(ar2[i] + " ");
        }
    }
}
