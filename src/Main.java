import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
  public static void main(String[] args) {
    try {
      doMain();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void doMain() throws Exception{
    Timer t=new Timer(true);
    t.schedule(new Ping("Fixed delay"), 0, 1000);
    Thread.currentThread().sleep(12000);

  }


}
class Ping extends TimerTask {
  private String name;
  public Ping(String name) {
    this.name=name;
  }

  @Override
  public void run() {
    System.out.println(name+"Ping at"+new Date());
  }
}