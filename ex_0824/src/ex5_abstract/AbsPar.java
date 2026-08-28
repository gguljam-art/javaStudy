package ex5_abstract;

abstract class AbsPar {
    int value = 100;

    public int getvalue(){
        return value;
    }

    //메서드의 몸체가 없는
    //미완성 개념의 메서드
    //상속관계에서 자식이 받아서 완성 시키는 것을 조건
    abstract public void setValue(int n);
}
