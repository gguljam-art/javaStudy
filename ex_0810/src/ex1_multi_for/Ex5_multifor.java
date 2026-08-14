public class Ex5_multifor {
    public static void main(String[] args) {
        //01 02 03 04 05
        //02 04 06 08 10
        //03 06 09 12 15
        //... ~ 5

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.printf("%02d ", i*j);
            }
            System.out.println();
        }
    }
}
