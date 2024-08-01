package src;
import java.awt.Color;
import java.util.ArrayList;

public class Snake {
  private Window window;
  private ArrayList<Vector> positions;
  private Vector direction;

  public Snake() {
    positions = new ArrayList<>();
    this.window = SnakeGame.getWindow();
    positions.add(new Vector(25, 12));
    direction = new Vector(0, 0);
  }

  public void update() {
    Vector lastPosition = new Vector(positions.get(0).x, positions.get(0).y);
    if (SnakeGame.isUp) {
      if (direction.y != 1) {
        direction = new Vector(0, -1);
      }
    }
    if (SnakeGame.isDown) {
      if (direction.y != -1) {
        direction = new Vector(0, 1);
      }
    }
    if (SnakeGame.isLeft) {
      if (direction.x != 1) {
        direction = new Vector(-1, 0);
      }
    }
    if (SnakeGame.isRight) {
      if (direction.x != -1) {
        direction = new Vector(1, 0);
      }
    }

    for (int i = positions.size() - 1; i > 0; i--) {
      positions.set(i,
                    new Vector(positions.get(i - 1).x, positions.get(i - 1).y));
    }

    positions.set(0, new Vector(positions.get(0).x + direction.x,
                                positions.get(0).y + direction.y));

    if (positions.get(0).x == SnakeGame.getFruit().getPosition().x &&
        positions.get(0).y == SnakeGame.getFruit().getPosition().y) {
      SnakeGame.repositionFruit();
      positions.add(new Vector(lastPosition.x, lastPosition.y));
    }

    for (int i = 1; i < positions.size(); i++) {
      if (positions.get(0).x == positions.get(i).x &&
          positions.get(0).y == positions.get(i).y) {
        SnakeGame.restart();
      }
    }
  }

  public void draw() {
    for (int i = 0; i < positions.size(); i++) {
      window.drawSomeShit(positions.get(i), new Vector(25, 25), Color.GREEN);
    }
  }
}
