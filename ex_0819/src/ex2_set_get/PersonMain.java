package ex2_set_get;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setGender("남자");
        p1.setName("길동");
        p1.setAge(999);
        System.out.println("성별: "+p1.getGender());
        System.out.println("이름: "+p1.getName());
        System.out.println("나이: "+p1.getAge());
    }
}
