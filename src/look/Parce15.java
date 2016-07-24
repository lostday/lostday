package look;

/**
 * Created by s5761 on 2016/7/24.
 */
public class Parce15 {
  private void internalTracking(boolean b){
    if (b) {
      class TrackingSlip{
        private String id;
        TrackingSlip(String s) {
          id=s;
        }
        String getSlip(){
          return id;
        }
      }
      TrackingSlip ts = new TrackingSlip("slip");
      String s = ts.getSlip();
    }
  }

  public void track(){internalTracking(true);}

  public static void main(String[] args) {
    Parce15 p=new Parce15();
    p.track();
  }
}
