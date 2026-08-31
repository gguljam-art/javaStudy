package Game;

public class Main {

    public static void main(String[] args) {
        //폭탄 추가
        //폭탄 주변타일 ++

        GameBord gb = new GameBord(10, 10);
        gb.setBoard();

        GameFram gf = new GameFram(300,300,gb.getBord());
        
        for(int i = 0; i < gb.bord.length; i++){
            for(int j = 0; j < gb.bord[i].length; j++){
                System.out.print(gb.bord[i][j] + " ");
            }
            System.out.println();
        }
    }
}
