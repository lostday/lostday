package look.music2;

import look.music.Note;

/**
 * Created by s5761 on 2016/7/19.
 */

class Instrument {
  void play(Note n){
    System.out.println("Instrumet.play() " + n);
  }
  String what(){  return "Instrument";}
  void adjust(){
    System.out.println("Adjusting Instrument");
  }
}
class wind extends Instrument{
  void play(Note n){
    System.out.println("wind.play() " + n);
  }
  String what(){  return "wind";}
  void adjust(){
    System.out.println("Adjusting wind");
  }
}
class Percussion extends Instrument {
  void play(Note n) {
    System.out.println("Percussion.play() " + n);
  }

  String what() {
    return "Percussion";
  }

  void adjust() {
    System.out.println("Adjusting Percussion");
  }
}
class Stringed extends Instrument{
  void play(Note n) {
    System.out.println("Stringed.play() " + n);
  }

  String what() {
    return "Stringed";
  }

  void adjust() {
    System.out.println("Adjusting Stringed");
  }
}
class Brass extends wind{
  void play(Note n){
    System.out.println("Brass.play() " + n);
  }
  void adjust() {
    System.out.println("Adjusting Brass");
  }
}
class Woodwind extends wind{
  void play(Note n){
    System.out.println("Woodwind.play() " + n);
  }
  void adjust() {
    System.out.println("Adjusting Woodwind");
  }
}
public class music2 {
  public static void tune(Instrument I){
    I.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] I){
    for (Instrument i:I ) {
      tune(i);
    }
  }
  public static void main(String[] args) {
    Instrument[] orchestra={new wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()};
    tuneAll(orchestra);
  }
}
