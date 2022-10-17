

package calculock;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class Dibujo2D {
    private JPanel p;
    private int w;
    private int h;
    private int escala=30;
    
public Dibujo2D (JPanel p){
    this.p=p;
    w=p.getWidth();
    h=p.getHeight();
}

public void dibujar(){
        Graphics2D g=(Graphics2D)p.getGraphics();
        
        int x2=w/2;
        for(int x=w/2; x<w; x+=escala){
            g.setColor(Color.gray);
            g.drawLine(x, 0, x,h);
            g.drawLine(x2, 0, x2,h);
            x2=x2-escala;
        }
        int y2=h/2;
        for(int y=h/2; y<h; y+=escala){
            g.setColor(Color.gray);
            g.drawLine(0, y, w,y);
            g.drawLine(0, y2, w,y2);
            y2=y2-escala;
        }
        g.setColor(Color.blue);
        g.drawLine(w/2, 0, w/2,h);
        g.drawLine(0, h/2, w,h/2);
        dibujarPuntoC(0, 1);
        dibujarPuntoC(0, 3);
        dibujarPuntoC(3, 2);
        dibujarPuntoP(-4, 1);
        dibujarPuntoP(-4, 4);
        dibujarPuntoP(-2, 2);
        dibujarPuntoP(0, 2);
        dibujarPuntoP(0, 4);
        dibujarPuntoP(1, 1);
        dibujarPuntoP(1, 2);
        dibujarPuntoP(2, 2);
        dibujarPuntoP(3, 3);
        dibujarPuntoP(4, 4);
}
    public void dibujarPuntoP(int x, int y){
        Graphics2D g=(Graphics2D)p.getGraphics();
        int xDigital=w/2+x*escala;
        int yDigital=h/2-y*escala;
        g.setColor(Color.red);
        g.fillOval(xDigital-7, yDigital-7, 14, 14);
    }
    public void dibujarPuntoC(int x, int y){
        Graphics2D g=(Graphics2D)p.getGraphics();
        int xDigital=w/2+x*escala;
        int yDigital=h/2-y*escala;
        g.setColor(Color.blue);
        g.fillOval(xDigital-7, yDigital-7, 14, 14);
    }
}
