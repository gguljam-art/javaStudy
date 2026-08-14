import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 2 ~ 9사이의 값에 해당하는 구구단을 출력
        //------------
        //단: 10
        //2 ~ 9사이의 값을 입력하세요
        //단: 5
        // 5 * 1 = 5
        // 5 * 2 = 10
        // .......
        // 5 * 9 = 45

        Scanner sc = new Scanner(System.in);
        System.out.print("단:");
        int value = sc.nextInt();

        if(value < 2 || value > 9)
            System.out.println("2 ~ 9사이의 값을 입력하세요");
        else{
            for(int i = 1; i < 10; i++){
                //System.out.println(value + "*" + i + "=" + (value*i));
                System.out.printf("%d x %d = %02d \n",value,i,value*i);
            }
        }
    }
}
