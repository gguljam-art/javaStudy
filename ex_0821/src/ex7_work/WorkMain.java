package src.ex7_work;

public class WorkMain {
    public static void main(String[] args) {
        //가장 큰 값
        int[] arr = {1,11,7,20,13,15};

        int Max = -99999999;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > Max)
                Max = arr[i];
        }

        System.out.println(Max);
    }
}
