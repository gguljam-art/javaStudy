package ex6_work;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Work02_Main {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> strList = new ArrayList<>();
    public static String[] data = {"apple", "banana", "Orange", "grape", "strawberry", "pineapple"};
    public static StringBuffer inStr = new StringBuffer();
    
    public static void main(String[] args) {
        //n초마다 배열에 문장이 추가.
        //타자를 치면 배열안에 해당 문장 삭제
        //배열이 0이 되면 클리어
        boolean b = true;
        int gameLevel = 1;

        while(b){
            System.out.println("1. 게임시작");
            System.out.println("2. 난이도조절");
            System.out.println("3. 게임종료");

            System.out.printf(">> ");
            inStr.append(sc.next());
            if(inStr.toString().equals("1")){
                while(!inStr.toString().equals("-1")){
                    System.out.println("레벨 " + gameLevel);
                    strList.add(data[new Random().nextInt(data.length)]);
                    startGame(gameLevel);
                    gameLevel++;
                }
            }
            if(inStr.toString().equals("2")){

            }
            if(inStr.toString().equals("3")){
                b = false;
                System.out.println("게임을 종료합니다.");
            }

            inStr.setLength(0);
        }
    }

    public static void startGame(int gameLevel){

        Work02_Thread wt2 = new Work02_Thread(strList, data,inStr);
        wt2.setDaemon(true);
        wt2.start();
        Thread tr = new Thread();

        String loadingbar = "";
        for(int i = 5; i >= 0; i--){
            try {
                tr.sleep(1000);
                loadingbar += "■";
                System.out.print("\r"+loadingbar);
            } catch (Exception e) {
            }
        }
        System.out.println();
        System.out.println("게임시작!!!");
        wt2.setStart = true;
        
        System.out.println("게임종료: -1");
        while(strList.size() != 0){
            System.out.println(strList);

            System.out.print(">>");
            inStr.append(sc.next());

            int findindex = strList.indexOf(inStr.toString());

            if(findindex != -1){
                strList.remove(findindex);
            }

            if(inStr.toString().equals("-1")){
                return;
            }

            inStr.setLength(0);
            if(strList.size() == 0){
                System.out.println("클리어!");
                System.out.println("--------------");
            }
        }
        inStr.setLength(0);
        wt2.setStart = false;
    }
}
