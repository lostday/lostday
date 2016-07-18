package look.music;

/**
 * Created by s5761 on 2016/7/18.
 */
public class Music {
  public static void tune(Instrument instrument) {
    instrument.play(Note.MIDDLE_C);
  }

  public static void main(String[] args) {
    Wind flute = new Wind();
    tune(flute);
  }
}
