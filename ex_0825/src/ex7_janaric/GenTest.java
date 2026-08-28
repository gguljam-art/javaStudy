package ex7_janaric;

public class GenTest<T> {
    //일반적인 형태의 코드를 작성하고 이코드를 다양한 타입에 객체에 대해서
    //재사용이 가능한 구조로 만들어둔 객체지향 기법
    
    T value;
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}
