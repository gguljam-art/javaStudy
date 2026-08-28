package ex1_copyarray;

public class ArrMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        new ArrSub().param(arr);
        System.out.println(arr[0]);
    }
}
