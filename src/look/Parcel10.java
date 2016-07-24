package look;

/**
 * Created by s5761 on 2016/7/24.
*/
abstract class Content {
  abstract public int value();
}
interface Destination {
  String readLabel();
}
public class Parcel10 {
  private static class PContents
          extends Content {
    private int i = 11;
    public int value() { return i; }
  }
  protected static class PDestination
          implements Destination {
    private String label;
    private PDestination(String whereTo) {
      label = whereTo;
    }
    public String readLabel() { return label; }
  }
  public static Destination dest(String s) {
    return new PDestination(s);
  }
  public static Content cont() {
    return new PContents();
  }
  public static void main(String[] args) {
    Content c = cont();
    Destination d = dest("Tanzania");
  }
}