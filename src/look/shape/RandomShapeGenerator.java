package look.shape;

import java.util.Random;

/**
 * Created by s5761 on 2016/7/18.
 */
public class RandomShapeGenerator {
  private Random random = new Random(47);
  public Shape next(){
    switch (random.nextInt(3)) {
      default:
      case 1:return new Circle();
      case 2:return new Square();
      case 3:return new Triangle();
    }
  }
}
