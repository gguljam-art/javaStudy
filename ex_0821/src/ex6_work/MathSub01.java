package src.ex6_work;

public class MathSub01 {
    public boolean primalityTest(int n){
        if(n == 1) return false;
        
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
