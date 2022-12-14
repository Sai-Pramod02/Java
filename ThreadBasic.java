
class Hello extends Thread{
    Hello(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("I am Thread one");
        }
    }
}


class Hello1 implements Runnable{
  public  void run(){
     while(true){
          System.out.println("Thread 2");
      }
    }
}


class ThreadBasic{
    public static void main(String[] args) {
        Hello h = new Hello("Hello");

       // System.out.println("The name of the thread is : "+h.getName());
       // System.out.println("The id of the thread is : "+h.getId());

        Hello1 h1 = new Hello1();
        Thread t = new Thread(h1);

        h.setPriority(Thread.MIN_PRIORITY);
        t.setPriority(Thread.MAX_PRIORITY);

        h.start();
        t.start();
    }
}

