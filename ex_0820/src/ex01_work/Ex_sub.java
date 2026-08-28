package src.ex01_work;
public class Ex_sub {
    public boolean strcheack(String str){
        boolean b = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                continue;
            }
            else{
                b = false;
                break;
            }
        }
        return b;
    }
}
