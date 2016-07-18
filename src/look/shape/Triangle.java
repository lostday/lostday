package look.shape;

/**
 * Created by s5761 on 2016/7/18.
 */
public class Triangle extends Shape{
  @Override
  public void draw() {
    System.out.println("Triangle.draw()");
  }
  public void erase(){
    System.out.println("Triangle.erase()");
  }
}
