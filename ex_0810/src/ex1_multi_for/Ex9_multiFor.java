public class Ex9_multiFor {
    public static void main(String[] args) {
        /*
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
        */

        int max = 8;
        for(int i = 1; i <= max; i++){
            for(int j = 0; j < max - i; j++){
                System.out.print("  ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }
            for(int l = 0; l < i-1; l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //ver2:
        for(int i = 0; i < max*2; i++){
            if(i%2 == 1) continue;
            for(int j = 0; j < max*2-(i+2); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                if(i == 0)
                    System.out.print("^");
                else
                    System.out.print((j == 0)?"/ ": (j == i) ? "\\ ": ((i/2)%2 == 1)?"O ":(j%2 ==1)?"j ":"| ");
            }
            System.out.println();
        }

        // ver3:
        for(int i = 1; i < max * 2; i++){
            if(i % 2 == 0) continue;
            for(int j = 0; j < max * 2; j++){
                if(max * 2 - i <= j){
                    // if(i == 1)
                    //     System.out.print("^");
                    // else
                    //     System.out.print((max*2-i ==j)?"/ ":(max*2)-1 == j? "\\ ":(j%2==1)? "j ":"^ ");
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
