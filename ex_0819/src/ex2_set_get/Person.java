package ex2_set_get;

public class Person {
    private String gender;
    public void setGender(String s){
        gender = s;
    }
    public String getGender(){
        return gender;
    }

    private String name;
    public void setName(String s){
        name = s;
    }
    public String getName(){
        return name;
    }
    
    private int age;
    public void setAge(int inAge){
        age = inAge;
    }
    public int getAge(){
        return age;
    }
}
