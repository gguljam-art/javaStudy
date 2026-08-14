public class Ex04_work {
    public static void main(String[] args) {
        // 100이하 5의 배수
        // ver1:
        for(int i = 5; i <= 100; i+=5){
            System.out.printf("%03d ",i);
            if(i % 50 == 0) System.out.println();
        }
        System.out.println();
        // ver2:
        for(int i = 1; i <= 100; i++){
            if(i%5==0)System.out.printf("%03d ",i);
            if(i % 50 == 0) System.out.println();
        }
    }
}
