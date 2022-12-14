class t1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }


}
class t2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        t1 t1 = new t1();
        t2 t2 = new t2();
        try{
            Thread.sleep(200);
            t1.start();

            t2.start();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
