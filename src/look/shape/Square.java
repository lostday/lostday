package look.shape;

/**
 * Created by s5761 on 2016/7/18.
 */
public class Square extends Shape{
  @Override
  public void draw() {
    System.out.println("Square.draw()");
  }
  public void erase(){
    System.out.println("Square.erase()");
  }
}
