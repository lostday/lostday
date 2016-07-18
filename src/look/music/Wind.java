package look.music;

/**
 * Created by s5761 on 2016/7/18.
 */
public class Wind extends Instrument {
  @Override
  public void play(Note note) {
    System.out.println("Wind.play() " + note);
  }
}
