package ex6_work;

import java.util.ArrayList;
import java.util.Random;

public class Work02_Thread extends Thread{
    ArrayList<String> strList;
    String[] strArr;
    boolean setStart = false;
    public StringBuffer InputBuffer;

    public Work02_Thread(ArrayList<String> strList, String[] strArr, StringBuffer InputBuffer){
        this.strList = strList;
        this.strArr = strArr;
        this.InputBuffer = InputBuffer;
    }
    @Override
    public void run() {
        Random rd = new Random();
        
        while(true){
            try {
                Thread.sleep(5000);
                strList.add(strArr[rd.nextInt(strArr.length)]);
                if(setStart){
                    System.out.println("");
                    System.out.println("\r"+strList);
                    System.out.print(">>" + InputBuffer.toString());
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

            
        }
    }
}
