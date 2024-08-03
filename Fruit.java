
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Fruit {
  private Vector position;
  private Window window;

  public Fruit() {
    this.window = SnakeGame.getWindow();
    Random random = new Random();

    position = new Vector(random.nextInt(45), random.nextInt(20));
  }

  public void draw(Graphics g) {
    window.drawSomeShit(position, new Vector(25, 25), Color.RED, g);
  }

  public Vector getPosition() { return position; }
}
