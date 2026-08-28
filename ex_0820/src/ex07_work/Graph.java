package src.ex07_work;

public class Graph {
    public static void main(String[] args) {
        //0 ~ 9사이의 난수를 100개 발생시키고
        //각 숫자가 몇개씩 만들어졌는지를 그래프화 하시오
        //----------------------------------
        //0의 갯수: ############ 12
        //1의 갯수: ####### 7
        //...
        //9의 갯수: ############### 14

        int[] arr = new int[10];
        for(int i = 0; i < 100; i++){
            int r = (int)(Math.random() * 10);
            arr[r] ++;
        }

        new PrintGraph().print(arr);
    }//main
}
