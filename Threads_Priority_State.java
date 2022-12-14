class P1 extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(" Hello ");
        }
    }
}
class P2 extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(" World ");
        }
    }
}
public class Threads_Priority_State {
    public static void main(String[] args) {
        P1 p1 = new P1();
        P2 p2 = new P2();
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of P1 Thread is :"+p1.getPriority()+"\nThe sate of P1 thread before execution is :"+Thread.currentThread().getState());
        System.out.println("Priority of P2 Thread is :"+p2.getPriority()+"\nThe sate of P2 thread before execution is :"+p2.getState());
        p1.start();
        p2.start();
        System.out.println(Thread.currentThread().getState());
    }
}
