package ex2_fileinput;

public class Ex03_infut {
    public static void main(String[] args) {
        byte[] console = new byte[100];    
        try{
            System.out.print("입력:");
            System.in.read(console);

            String res = new String(console);
            System.out.println(res);
        }catch(Exception e){

        }finally{
        }
    }
}
