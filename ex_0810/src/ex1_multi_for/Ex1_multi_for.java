public class Ex1_multi_for {
    public static void main(String[] args) {
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        for(int i = 0; i < 3; i++){ //일반적으로 세로줄 관리
            for(int j = 1; j <= 5; j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

        System.out.println("---------------------");

        //5 4 3 2 1 
        //5 4 3 2 1 
        //5 4 3 2 1 

        for(int i = 1; i <=3;i++){
            for(int j = 5; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
