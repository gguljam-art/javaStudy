package work01;

import java.io.Serializable;

public class Work2User implements Serializable{
    private String name;
    private int win;
    private int draw;
    private int loss;
    private int gameFCount;

    public int getWin() {
        return win;
    }

    public int getDraw() {
        return draw;
    }

    public int getLoss() {
        return loss;
    }

    public int getGameFCount() {
        return gameFCount;
    }

    public Work2User(String name){
        this.name = name;
        resetScore();
    }

    public void resetScore(){
        win = 0;
        draw = 0;
        loss = 0;
        gameFCount = 0;
    }

    public int addWin(){
        return ++win;
    }
    public int addLoss(){
        return ++loss;
    }
    public int addCnt(){
        return ++gameFCount;
    }
    public int addDraw(){
        return ++draw;
    }
    public String getName(){
        return name;
    }
    public void userinfo(){
        System.out.println("유저 이름:" + name);
        System.out.printf("전적 : %d승, %d패, %d무", win, loss, draw);
        System.out.println("게임 진행 횟수: " + gameFCount);
    }
}
