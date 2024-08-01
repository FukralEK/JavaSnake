
public class SnakeGame {

  private static final int width = 1280;
  private static final int height = 720;
  private static boolean running = true;
  private static Window window = new Window(width, height);
  private static Snake snake = new Snake();
  private static Fruit fruit = new Fruit();

  public static boolean isUp = false;
  public static boolean isDown = false;
  public static boolean isLeft = false;
  public static boolean isRight = false;

  public static void main(String[] args) {
    long NOW = System.currentTimeMillis();
    long LAST = System.currentTimeMillis();
    while (running) {
      NOW = System.currentTimeMillis();
      if (NOW - LAST < 100) {
        continue;
      }
      window.clearScreen();
      LAST = System.currentTimeMillis();
      snake.update();
      snake.draw();
      fruit.draw();
    }
  }

  public static Window getWindow() { return window; }

  public static Fruit getFruit() { return fruit; }

  public static void restart() {
    snake = new Snake();
    fruit = new Fruit();
  }

  public static void repositionFruit() { fruit = new Fruit(); }
}