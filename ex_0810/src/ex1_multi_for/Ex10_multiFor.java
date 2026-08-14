public class Ex10_multiFor {
    public static void main(String[] args) {
        /*
        1 3 5 7 9
        3 5 7 9 1
        5 7 9 1 3
        7 9 1 3 5
        9 1 3 5 7
        */

        //ver1:
        // float st1 = System.nanoTime();
        // System.out.println("ver1:");
        // for(int i = 0; i < 10; i+=2){
        //     for(int j = 1; j < 10; j+=2){
        //         System.out.print((j+i)%10 +" ");
        //     }
        //     System.out.println();
        // }
        // float et1 = System.nanoTime();
        // float t1 = et1 - st1;
        // System.out.println(t1*1000_000);
        
        //ver2:
        // float st2 = System.nanoTime();
        // System.out.println("ver2:");
        // for(int i = 0; i < 10; i++){
        //     if(i%2==1)continue;
        //     for(int j = 1; j < 10; j++){
        //         System.out.print(j%2==0?" ":(j+i)%10);
        //     }
        //     System.out.println();
        // }
        // float et2 = System.nanoTime();
        // float t2 = et2 - st2;
        // System.out.println(t2*1000_000);
        
        //ver3:
        float st3 = System.nanoTime();
        System.out.println("ver3:");
        
        int n = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(j%2==0?" ":(j+n)%10);
            }
            System.out.println();
            n+=2;
        }
        float et3 = System.nanoTime();
        float t3 = et3 - st3;
        System.out.println(t3*1000_000);
    }
}
