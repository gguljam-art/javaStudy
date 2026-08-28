package src.ex3_constructor;

public class Pen {
    
    private String name;
    private int price;
    private String color;
    private boolean limited;
    
    public Pen(){
        name    = "monami153";
        price   = 500;
        color   = "white";
        limited = false;
    }
    
    public void info(){
        System.out.println("이름: " + name);
        System.out.println("가격: " + name);
        System.out.println("일반판");
        System.out.println("---------");
    }
}
