package src.ex11_work;

public class WorkSub {
    public String RandomString(String inStr){
        int[] rstr = new int[inStr.length()];

        int offset = 0;
        while(offset < rstr.length){
            rstr[offset] = (int)(Math.random()*rstr.length);
            boolean b= true;
            for(int i = 0 ; i < rstr.length; i++){
                if(i == offset) continue;
                if(rstr[i] == rstr[offset]) b = false;
            }

            if(b) offset ++;
        }

        //글자 뒤섞기
        // for(int i : rstr)
        //     System.out.print(i + " ");

        StringBuffer randS = new StringBuffer();
        for(int i = 0; i < rstr.length;i++ ){
            randS.append(inStr.charAt(rstr[i])) ;
        }
        return randS.toString();
    }
}
