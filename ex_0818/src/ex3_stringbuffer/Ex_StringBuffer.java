package ex3_stringbuffer;

public class Ex_StringBuffer {
    public static void main(String[] args) {
        String str = "안녕";
        str = "반갑습니다.";
        str += "!";
        System.out.println(str);

        StringBuffer sb = new StringBuffer();
        sb.setLength(0);
        sb.append("반가워요");
        sb.append("!!");
        System.out.println(sb.toString());
    }
}
