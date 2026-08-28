package src.ex06_overload;

public class Bread {
    //메서드 1
    public void makeBread(){
        System.out.println("빵을 만들었습니다.");
    }
    //메서드 2
    public void makeBread(int n){
        for(int i = 0; i <n; i++){
            System.out.println("빵을 만들었습니다.");
        }
        System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",n);
    }
    //메서드 3
    public void makeBread(int n, String s){
        for(int i = 0; i <n; i++){
            System.out.printf("%s빵을 만들었습니다.\n",s);
        }
        System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n",n,s);
    }
}
