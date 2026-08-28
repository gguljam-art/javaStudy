package src.ex07_work;

public class PrintGraph {
    public void print(int[] arr){
        int sum = 0;
        StringBuffer graph = new StringBuffer();
        for(int i =0; i<arr.length; i++){
            graph.setLength(0);
            for(int j = 0; j < arr[i]; j++){
                graph.append('#');
            }
            System.out.printf(
                "%d의 갯수: %s %d\n"
                    , i
                    , graph.toString()
                    , arr[i]
                );
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
