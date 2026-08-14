package ex2_work;

public class Ex03_work {
    public static void main(String[] args) {
        //배열 arr에 담긴 값 중 가장 큰 값을 출력
        //-------------
        //가장 큰 값: 19
        int[] arr = {4, 13, 7, 19, 1, 15};

        int answer = 0;
        for(int i = 0; i < arr.length;i++){
            answer = answer < arr[i] ? arr[i] : answer;
        }

        System.out.println("정답: " + answer);
    }
}
