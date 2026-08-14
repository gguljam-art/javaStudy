package ex_work;

public class Ex01_work {
    //배열 arr에담긴 모든 값의 합과 평균 구하기
    //-------------------
    //총합: 119
    //평균: 7.43
    public static void main(String[] args) {
        int[][]arr = {  {7,8,11,6},
                        {20,13,9,2,5},
                        {7,7,10},
                        {2,3,4,5}};
        int sum=0;
        int offset = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
                offset++;
            }
        }

        System.out.printf("총합: %d\n",sum);
        System.out.printf("평균: %.2f\n",(float)sum / (float)offset);

    }
}
