public class Ex2_for {
    public static void main(String[] args) {
        // 1 ~ 10까지 정수들 중에서 홀수의 합만을 계산하여 출력
        //ver1:
        int n2 = 111;
        
        int sum = 0;
        for(int i = 1; i <= n2; i ++) {
            if(i%2==1){
                sum +=i;
            }
        }
            
        System.out.println("ver1:" + sum);

        //ver2:
        
        int sum2 = (n2 * (n2 + 1)/2) - (n2/2 * (n2/2 + 1));
        System.out.println("ver2:" + sum2);

        //ver3:
        int sum3 = 0;
        
        for(int i = 1; i <= n2; i+=2)
            sum3 += i;

        System.out.println("ver2:" + sum3);
    }
}
