public class Ex01_work {
    public static void main(String[] args) {
        
        //과수원 배사과 오랜지가 하루에 5,7,5개씩 증가
        //하루 생산되는 과일 총 갯수
        //시간 당 전체 평균 생산 갯수
        //과일의 갯수 int, 평균 float

        int app = 5;
        int bea = 7;
        int org = 5;

        int sum = app + bea + org;
        float avg = (float)sum /24;

        System.out.println("-------- 과일 생산 현황 --------");
        System.out.printf("1.사과: %d, 2.배: %d, 3.오렌지: %d\n", app,bea,org);
        System.out.println("--------------------------------");
        System.out.printf("하루 총 생산 과일: %d \n",sum);
        System.out.printf("시간 당 생산 평균: %.2f \n",avg);
    }
}
