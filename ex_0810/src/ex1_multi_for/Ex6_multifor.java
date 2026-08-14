public class Ex6_multifor {
    public static void main(String[] args) {
        int max = 5;
        
        for(int i = 0; i < max; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("@ ");
            }
            System.out.println();
        }

        //ver2:
        
        for(int i = 0; i < max; i++){
            for(int j = 0; j < max-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("+ ");
            }
            System.out.println();
        }

        //ver3:
        for(int i = 0; i < max; i++){
            for(int j = 0; j < max-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
