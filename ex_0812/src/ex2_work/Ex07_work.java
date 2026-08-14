package ex2_work;

public class Ex07_work {
    public static void main(String[] args) {
        //배열 arr을 오름차순으로 출력
        int[] arr = {11,7,9,20,15,3};
        System.out.println("---------------");
        //원래 값 출력
        System.out.print("원본값: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //오름차순 출력
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

            System.out.print(arr[i] + " ");
        }

        System.out.println();
        //내림차순 출력
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

            System.out.print(arr[i] + " ");
        }


    }
}
