package src.ex02_work;

public class EncodeSub {
    char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^',
        '&', '*', '(', ')', '-', '_', '+', '=', '|',
        '[', ']', '{', '}', ';', ':', ',', '.', '/' };

    char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y',
        'u', 'i', 'o', 'p' };

    public String enc(String str){
        StringBuffer answer = new StringBuffer();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                int n = str.charAt(i) - 'a';
                answer.append(abcCode[n]);
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                int n = str.charAt(i) - '0';
                answer.append(numCode[n]);
            }
        }

        return answer.toString();
    }
}
