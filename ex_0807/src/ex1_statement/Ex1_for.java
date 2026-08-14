public class Ex1_for {
    public static void main(String[] args) {
        //for문: 특정 코드를 원하는 만큼 밤복하고자 할 때
        //for(초기식; 저건식; 증감식){조건식이 참일 때 수행되는 영역}

        boolean b = true;

        for(int i = 0; b; i ++){
            System.out.println(i);
            b = i <= 50 ? true:false;
        }//for

        //ver1:
        System.out.println("-------------------------");
        System.out.print("ver1:");
        for(int i = 10; i > 0; i--) System.out.print(i + ",");

        System.out.println("");
        System.out.println("-------------------------");
        //ver2:
        int a = 10;
        System.out.print("ver2:");
        for(int i = 0; i < 10; i++){
            System.out.print(a + ",");
            a--;
        };

        //5의 배수
        //ver1:
        System.out.println("");
        System.out.println("-------------------------");
        System.out.print("ver1:");
        for(int i = 5; i <= 100; i +=5) System.out.print(i + ",");

        //ver2:
        System.out.println("");
        System.out.println("-------------------------");
        System.out.print("ver2:");
        for(int i = 1; i <= 100; i ++){
            if(i%5 != 0) continue;
            System.out.print(i + ",");
        }

        //ver3:
        System.out.println("");
        System.out.println("-------------------------");
        System.out.print("ver3:");
        int length = 100/5;
        int value = 5;
        for(int i = 0; i < length; i++ ){
            System.out.print(value + ",");
            value +=5;
        }
    }

}
