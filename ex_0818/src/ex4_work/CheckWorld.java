package ex4_work;

public class CheckWorld {
    public String revers(String instr){
        String rev = "";
        for(int i = instr.length()-1; i >= 0; i--){
            rev += instr.charAt(i);
        }

        return rev;
    }
}
