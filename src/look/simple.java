package look;

/**
 * Created by s5761 on 2016/5/18.
 */
public class simple extends Thread{
  public static void main(String[] args){
    Thread thread = new simple();
    System.out.println("The Priority of CurrentThread is" + thread.getPriority());
    thread.start();
    for (int i=1;i<=5;i++) {
      System.out.println("Main Thread:" + i);
      sleep(2000);

    }

  }

  public void run (){
    String name = null;
    for (int i=1;i<=5;i++) {
      if (isDaemon()) {
        name="Daemon Thread:";
      }else{
        name = "User Thread:";
        System.out.println(name + i);
        sleep(2000);
      }
    }
    System.out.println(name + "done");

  }
  public static void sleep (long msec) {
    try {
      Thread.currentThread().sleep(msec);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
