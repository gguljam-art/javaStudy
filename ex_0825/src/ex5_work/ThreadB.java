package ex5_work;

public class ThreadB extends Thread{
    int[] arr;
    int multi = 1;
    @Override
    public void run() {
        for(int i=0; i<arr.length; i++){
            multi *= arr[i];
        }
        System.out.println(multi);
    }

    /**
    *@param arr 배열의메서드는 곱셈을 하는 메서드입니다.
    *@retur multi 클레스의 맴버변수를 반환합니다.
    *@throws 스레드오작동 스레드가함수가 끝나기전에 반환합니다.
    *@version 0.1
    *@deprecated 개 구린 메서드입니다.
    */
    
    public int multif(int[]arr){
        this.arr = arr;
        this.start();
        return multi;
    }
}
