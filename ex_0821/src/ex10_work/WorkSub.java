package src.ex10_work;

public class WorkSub {
    public int[][] resurt(int n) {
        int[][]arr = new int[n][n];
        int x = (n-1)/2;
        int y = 0;
        for(int i = 1; i <= n*n; ){
            
            if(arr[y][x] == 0){
                arr[y][x] = i;
                i++;
            }
            else{
                y = (y+1 >= n) ? 0   : y+1;
                y = (y+1 >= n) ? 0   : y+1;
                x = (x-1 <  0) ? n-1 : x-1;    
                continue;
            }
            x = (x+1 >= n) ? 0   : x+1;
            y = (y-1 <  0) ? n-1 : y-1;
        }
        
        return arr;
    }
}
