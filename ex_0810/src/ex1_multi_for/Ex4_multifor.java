public class Ex4_multifor {
    public static void main(String[] args) {

        //ver1:

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print((i%2 == 1)? "* " : j+1 + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
        //ver2:

        for(int i = 0; i < 5; i++){
            if(i%2==1)
                for(int j = 0; j < 5; j++){
                    System.out.print("* ");
                }
            else
                for(int j = 0; j < 5; j++){
                    System.out.print(j+1 +" ");
                }
            System.out.println();
        }
    }
}
