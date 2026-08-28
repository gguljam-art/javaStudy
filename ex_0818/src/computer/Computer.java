//package computer;

public class Computer {
    private String brand = "samsung";
    int ssd = 512;
    int ram = 256;
    float cpu = 1.8f;
    String color = "white";
    
    //메서드(함수)
    //메서드: 어떤 작업을 수행하기 위한 명령문들의 집합
    //메서드를 사용하면 반복적인 코들의 재활용이 편해진다.
    public void info(){
        System.out.println("브랜드: "+ brand);
        System.out.println("ssd: " + ssd);
        System.out.println("ram: "+ram);
        System.out.println("cpu: " + cpu);
        System.out.println("color: " + color);
        System.out.println("------------------");
    }

    //public void info()
    //구성
    //접근제한자 반환형  메서드명 ()
    //public    void    info( 파라미터(인자) ){ 실행 영역 } 모든 메서드명은 소문자로 작성

    //접근제한자
    //1. public     같은 프로젝트 내의 모든 객체에게 사용을 허가
    //2. protected  상속관계의 클레스에게 사용을 허가
    //3. private    현제 클레스에서만 사용을 허가
    //4. default    같은 패키지의 객체에게 사용을 허가
}
