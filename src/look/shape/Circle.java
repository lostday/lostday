package look.shape;

/**
 * Created by s5761 on 2016/7/18.
 */
public class Circle extends Shape{
  @Override
  public void draw() {
    System.out.println("Circle.draw()");
  }
  public void erase(){
    System.out.println("Circle.erase()");
  }
}
