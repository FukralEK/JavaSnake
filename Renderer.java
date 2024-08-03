import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Renderer extends JPanel {
  public Renderer(int FPS, int width, int height) {
    this.setPreferredSize(new Dimension(width, height));
    Timer timer = new Timer(1000 / FPS, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        repaint(); // Schedule a repaint
      }
    });
    timer.start();
  }

  public void paint(Graphics g) {
    SnakeGame.getWindow().clearScreen(g);
    SnakeGame.getSnake().draw(g);
    SnakeGame.getFruit().draw(g);
  }
}
