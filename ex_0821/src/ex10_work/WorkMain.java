package src.ex10_work;

public class WorkMain {
    public static void main(String[] args) {
        //키보드에서 받은 홀수값에 대응하는
        //마방진 만들기
        
        int n = 3;
        int[][]arr = new WorkSub().resurt(n);
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%02d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
