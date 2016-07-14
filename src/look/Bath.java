package look;

/**
 * Created by s5761 on 2016/7/14.
 */
class Soap {
  private String s;

  Soap() {
    System.out.println("Soap()");
    s = "Constructed";
  }
  public String toString() {
    return  s;
  }
}


public class Bath {
  private String s1="Happy",s2="Happy",s3, s4;
  private Soap castille;
  private int i;
  private float toy;

  public Bath() {
    System.out.println("Inside Bath()");
    s3 = "joy";
    toy = 3.14f;
    castille = new Soap();
  }

  public String toString() {
    if (s4 == null) {
      s4 = "joy";
    }
    return "s1=" + s1 + "\n" + "s2=" + s2 + "\n" + "s3=" + s3 + "\n" + "s4=" + s4 + "\n" + "i=" + i + "\n" + "castille=" + castille;
  }

  public static void main(String[] args) {
    Bath b = new Bath();
    System.out.println(b);
  }
}