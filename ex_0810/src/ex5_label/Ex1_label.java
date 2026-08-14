package ex5_label;

public class Ex1_label {
    public static void main(String[] args) {
        //특정 반복문에 label을 붙여
        //한번에 두개 이쌍의 반복문을 제어할 수 잇다.
        out : for(int i = 1; i<=3; i++){
            for(int j = 1; j <= 1; j++){
                if(j%2==0)break out;
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
