package cobra;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Barra extends JPanel {

    public Barra(int x, int y){
        setBounds(x, y, 10, 10);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 10, 10);
    }
    
}
