package look;

/**
 * Created by s5761 on 2016/7/15.
 */
public class SpaceShip extends SpaceShipControls {
  private String name;
  public SpaceShip(String name) {this.name = name;}
  public String toString(){return name;}
  public static void main(String[] args) {
    SpaceShip protector = new SpaceShip("NSEA Protector");
    protector.forward(100);
  }
}
