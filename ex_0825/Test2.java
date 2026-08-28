import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        //1 ~ n개의 지점
        //출발지점 s
        //a지점
        //b지점
        
        findPoint fp = new findPoint();
        int[] points = fp.findP(s,a,fares);
        
        //출발지점, 도착지점까지의 경로와 예상금액 리턴 함수
        //a지점의 배열과, 예상금액
        //a지점의 이동경로 중 도착지점 b와 가장 가까운 값 return
        
        int[] arr = new int[n-1];
        
        return answer;
    }
}

class findPoint{
    int sum = 0;
    //배열과 값을 전달 해야 하기 때문에, 클레스로 업그레이드
    public int[] findP(int s, int e, int[][]fares){
        List<Integer> arr = new ArrayList<Integer>();//최단경로 저장
        int curPoin = s; //현재 지점
        while(curPoin != e){
            int min = 999999; //최저요금 찾기
            for(int i = 0; i < fares.length; i++){
                if(fares[i][0] == curPoin || fares[i][1] == curPoin){
                    if(fares[i][2]<min) min = fares[i][2];
                    curPoin = fares[i][0] == curPoin ?
                        fares[i][1] : fares[i][0];
                }
            }
            
            sum += min;
            arr.add(null);//Array로 변환해서 fush
        }
        
        int[] retArry = new int[arr.size()];
        int index = 0;
        for(int i : arr){
            retArry[index ++ ] = i;
        }
        
        //배열은 인자로 반환
        return retArry; //요금 반환
    }
    
    public int getSum(){
        return sum;
    }
}
