package src.ex2_construct;

public class Pokemon {

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
        setHp(100);
    }

    private String name;
    private int hp;
    private String type;

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for hp
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void info(){
        System.out.println("이름: "+name);
        System.out.println("타입: "+type);
        System.out.println("HP: "+hp);
        System.out.println("-----------");
    }
}
