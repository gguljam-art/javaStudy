public class Ex2_multifor {
    public static void main(String[] args) {
        // 01 02 03 04
        // 05 06 07 08
        // 09 10 11 12

        int n = 1;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%02d ",n);
                n++;
            }
            System.out.println();
        }

        //ver2:
        
        int colum = 4;
        int low = 3;
        int t;
        for(t = 1; t <= colum * low; t ++){
            if(t%colum == 1) System.out.println();
            System.out.printf("%02d ",t);
        }

    }
}
