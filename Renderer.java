import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
    g.setColor(Color.WHITE);
    g.setFont(new Font("Arial", Font.BOLD, 32));
    g.drawString("Points: " + SnakeGame.getSnake().getSize(), 1280 / 2, 50);
  }
}
