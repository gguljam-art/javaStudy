package Game;

public class GameBord {
    private int low ;
    private int cul ;
    private int boomInt;

    char[][] bord;

    public GameBord(int low, int cul){
        this.low = low;
        this.cul = cul;
    }

    public int[] getBordSiz(){
        int[]siz = new int[2];
        
        siz[0] = low;
        siz[1] = cul;

        return siz;
    }

    public void setBoard(){
        bord = new char[cul][low];
        for(int i = 0; i < cul; i++){
            for(int j = 0; j < cul; j++){
                bord[i][j] = '0';
            }
        }

        int offset = 0;
        boomInt = low * cul * 0.2;

        while(offset < low * cul * 0.2){
            int num = (int)(Math.random() * low * cul);
            int selcul = num/cul;
            int sellow = num%cul;
            if(bord[selcul][sellow] != '●'){
                bord[selcul][sellow] = '●';
                offset++;
            }
        }

        for(int i = 0; i < bord.length; i++){
            for(int j = 0; j < bord[i].length; j++){
                if(bord[i][j] == '●'){
                    setCount(i, j);
                }
            }
        }
    }

    public void setCount(int cul, int low){
        int culStart = cul - 1 < 0 ? 0 : cul - 1;
        int culEnd   = cul + 1 >= this.cul ? this.cul-1 : cul + 1;

        int lowStart = low - 1 < 0 ? 0 : low - 1;
        int lowEnd   = low + 1 >= this.low ? this.low-1 : low + 1;

        for(int i = culStart; i <= culEnd; i ++ ){
            for(int j = lowStart; j <= lowEnd; j++){
                if(bord[i][j] == '●') continue;
                bord[i][j] += 1;
            }
        }
    }

    public boolean lentCheck(int cnt, int low){
        boolean b = false;
        if(cnt >= 0 && cnt < 10 && low >= 0 && low < 10){
            b = true;
        }
        return b;
    }

    public char[][] getBord(){
        return bord;
    }
}
