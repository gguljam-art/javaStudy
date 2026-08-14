public class Ex8_multiFor {
    public static void main(String[] args) {
        /*
        1 2 3 4 5 6 7 8 9 10
        2 3 4 5 6 7 8 9 10 1
        3 4 5 6 7 8 9 10 1 2
        ...
        10 1 2 3 4 5 6 7 8 9
        */

        for(int i = 1; i <= 10; i++){
            int k = 0;
            for(int j = 1; j <= 10; j++){
                System.out.print(((k+i) % 10 == 0)?10+ " ":(k+i) % 10 + " ");
                k++;
            }
            System.out.println();
        }
    }
}
