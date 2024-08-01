import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener {
  @Override
  public void keyTyped(KeyEvent e) {}

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == 87) {
      SnakeGame.isUp = true;
    }
    if (e.getKeyCode() == 83) {
      SnakeGame.isDown = true;
    }
    if (e.getKeyCode() == 68) {
      SnakeGame.isRight = true;
    }
    if (e.getKeyCode() == 65) {
      SnakeGame.isLeft = true;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == 87) {
      SnakeGame.isUp = false;
    }
    if (e.getKeyCode() == 83) {
      SnakeGame.isDown = false;
    }
    if (e.getKeyCode() == 68) {
      SnakeGame.isRight = false;
    }
    if (e.getKeyCode() == 65) {
      SnakeGame.isLeft = false;
    }
    if (e.getKeyCode() == 113) {
      SnakeGame.restart();
    }
  }
}
