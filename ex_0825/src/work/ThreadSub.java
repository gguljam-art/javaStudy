package work;

public class ThreadSub extends Thread{
    int time = 0;
    boolean b = true;

    @Override
    public void run() {
        while(b){
            try {
                Thread.sleep(1000);
                time++;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void endThread(){
        b = false;
    }

    public int getTime(){
        return time;
    }
}
