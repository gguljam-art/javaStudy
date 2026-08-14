package ex1_multiArr;

public class Ex1_multiArr {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        arr1[0][0]= 100;
        arr1[0][1]= 200;
        arr1[0][2]= 300;

        arr1[1][0]= 400;
        arr1[1][1]= 500;
        arr1[1][2]= 600;

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr = new int[2][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (i+1) * (j+1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
