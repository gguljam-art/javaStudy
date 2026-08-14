package ex2_work;

public class Ex02_work {
    public static void main(String[] args) {
        
        //배열 arr에 담긴 모든 값의 합
        int[] arr = {10,11,37,61,2};
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("결과: " + sum);
    }
}
