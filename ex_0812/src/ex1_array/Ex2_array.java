package ex1_array;

public class Ex2_array {
    public static void main(String[] args) {
        //배열 선언 + 생성 + 초기화
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = new int[5];

        // 1 2 3 4 5
        for(int i = 0; i < ar1.length; i++){
            System.out.print(ar1[i] + " ");
            ar1[i] = 100 * (i+1);
        }

        System.out.println();
        System.out.println("//--------------");

        for(int n : ar1){
            System.out.print(n + " ");
        }
    }
}
