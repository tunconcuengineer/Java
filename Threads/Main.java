package Threads;

public class Main implements Runnable{
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
    }

    @Override
    public void run() {
        
        try {
            
            for(int i=1;i<=10;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
