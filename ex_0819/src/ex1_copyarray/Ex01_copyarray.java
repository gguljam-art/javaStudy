package ex1_copyarray;

public class Ex01_copyarray {
    public static void main(String[] args) {
        int[]arr1= {1,2,3};
        int[]arr2 = arr1;

        arr2[0] = 5;

        int[]arr3 = {1,2,3};
        int[]arr4 = new int[arr3.length];
        for(int i = 0; i<arr3.length;i++){
            arr4[i] = arr3[i];
        }

        arr3[0] = 100;

        System.out.println(arr3[0]);
        System.out.println(arr4[0]);
    }
}