package src.ex1_constructor;

public class ConSub {
    
    //생성자:
    //객체가 생성될 때 메모리 할당을 위해 딱 한번 반드시 호출되는 것
    private static ConSub instance = new ConSub();
    public static ConSub getinstanc(){
        return instance;
    }
    
    private ConSub(){
        //생성자는 반드시클레스 명과 일치해야하며 반환형이 없다.
        System.out.println("ConSub생성완료");
    }
}
