
package paquete;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author Pablo
 */
public class Lienzo extends JPanel{
    
    // Atributos para manejar la paleta de colores
    private final Color[] coloresPincel = {Color.BLACK, Color.RED, Color.BLUE};
    private final Color[] coloresLienzo = {Color.WHITE, Color.CYAN, Color.PINK};
    private int colorPincel = 0;
    private int colorLienzo = 0;
    
    // Atributos para controlar donde se pintan los círculos
    private Integer x[] = {null, null, null, null, null};
    private Integer y[] = {null, null, null, null, null};
    private int index = 0;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(coloresLienzo[colorLienzo]);
        this.setForeground(coloresPincel[colorPincel]);
        
        for(int i = 0; i < 5; i++) {
            if(x[i] != null && y[i] != null) {
                g.fillOval(x[i], y[i], 10, 10);
            }            
        }
        
    }
    
    public void setCoordinates(int x, int y) {
        this.x[this.index] = x;
        this.y[this.index] = y;
        index++;
        if(index > 4) index = 0;
        repaint();
    }
    
    public void paintLienzo(int index) {
        colorLienzo = index;
        repaint();
    }
    
    public void paintPincel(int index) {
        colorPincel = index;
        repaint();
    }
}
