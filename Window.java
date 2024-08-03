import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
  private JFrame frame;
  private JPanel panel;
  private GameKeyListener gameKeyListener;
  private int width;
  private int height;

  public Window(int width, int height) {
    gameKeyListener = new GameKeyListener();
    frame = new JFrame("Snake Game in Java");
    panel = new Renderer(60, width, height);

    this.width = width;
    this.height = height;

    frame.addKeyListener(gameKeyListener);

    panel.setBackground(Color.BLACK);

    frame.setResizable(false);
    frame.add(panel);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public void drawSomeShit(Vector position, Vector size, Color color,
                           Graphics g) {
    g.setColor(color);
    g.fillRect(position.x * 25, position.y * 25, size.x, size.y);
  }

  public void clearScreen(Graphics g) {
    panel.setBackground(Color.BLACK);
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, width, height);
  }

  public JPanel getPanel() { return panel; }
  public JFrame getFrame() { return frame; }
}
