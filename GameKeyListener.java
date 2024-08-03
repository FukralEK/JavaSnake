import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener {
  @Override
  public void keyTyped(KeyEvent e) {}

  private static void resetKeys() {
    SnakeGame.isUp = false;
    SnakeGame.isDown = false;
    SnakeGame.isRight = false;
    SnakeGame.isLeft = false;
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == 87) {
      resetKeys();
      SnakeGame.isUp = true;
    }
    if (e.getKeyCode() == 83) {
      resetKeys();
      SnakeGame.isDown = true;
    }
    if (e.getKeyCode() == 68) {
      resetKeys();
      SnakeGame.isRight = true;
    }
    if (e.getKeyCode() == 65) {
      resetKeys();
      SnakeGame.isLeft = true;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {}
}
