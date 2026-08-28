public class Ex2_sub {
    public void findactor(String[][] actor, String str){
        for(int i = 0; i < actor.length; i++){
            if(actor[i][0].equals("["+str+"]")){
                System.out.println(str + "찾음");
                for(int j = 0; j < actor[i].length; j++){
                    System.out.println(actor[i][j]);
                }
                break;
            }else{
                if(i == actor.length-1){
                    System.out.println("배우정보가 없음");
                }
            }
        }
    }
}
