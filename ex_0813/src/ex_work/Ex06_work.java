package ex_work;
import java.util.Scanner;

public class Ex06_work {
   public static void main(String[] args) {
    //등록할 인원: 2
    //이름: 홍길동
    //국어:
    //영어:
    //수학:
    //총 2명의 학생 정보가 등록됨
    //[학생등록정보]
    //홍길동 99 100 75
    //김길순 70 89 99
    //평균

    Scanner sc = new Scanner(System.in);
    System.out.print("등록할 인원:");
    int n = sc.nextInt();
    
    String[] info = {"이름: ","수학: ","영어: ","국어: "};
    String[][] str = new String[n][info.length];

    for(int i = 0; i < n; i++){
        for(int j = 0; j < str[i].length; j++){
                System.out.print(info[j]);
                str[i][j] = sc.next();
            }
    }

    System.out.printf("총 %d명의 학생 정보가 등록됨\n", n);
    System.out.println("[ 학생 등록정보 ]");

    for(int i = 0; i < str.length; i++){
        for(int j = 0; j < str[i].length; j++){
            System.out.print(str[i][j] + " ");
        }
        System.out.println();
    }
   } 
}
