import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {
        //검색: 조인성
        //[조인성]
        //모가디슈
        //호프
        
        //검색: aaa
        //해당 배우의 정보가 없습니다.
        
        String[][] actor = {
            {"[송강호]","박쥐","괴물","관상"},
            {"[조인성]","모가디슈","호프"},
            {"[이병헌]","레드","광해","놈놈놈"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("검색: ");
        String str = sc.next();

        int find = -1;
        for(int i = 0; i < actor.length; i++){
            if(actor[i][0].indexOf(str) != -1){
                find = i;
                break;
            }
        }

        if(find != -1){
            for(int i = 0; i < actor[find].length; i++){
            System.out.println(actor[find][i]);
        }}
        else
            System.out.println("해당 배우 정보가없습니다.");

        //선생님 풀이
        new Ex2_sub().findactor(actor, str);
    }
}
