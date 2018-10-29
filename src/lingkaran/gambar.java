/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lingkaran;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author CHhannZ
 */
public class gambar extends JPanel {
    private int xp,yp,r;

    public int getxp() {
        return xp;
    }

    public int getyp() {
        return yp;
    }

    public int getr() {
        return r;
    }

    public void setxp(int xa) {
        xp = xa;
    }

    public void setyp(int ya) {
        yp = ya;
    }

    
    public void setr(int jari2) {
        r = jari2;
    }

    public void paint(Graphics g) {     
        int p = 1-r;
        int x = 0;
        int y = r;

        super.paint(g);
        this.setBackground(Color.pink);
        
        g.setColor(Color.blue);

        while(x<=y) {           //ketika x=0 kecil dari y=r
            x++;                //maka x + 1
            if (p<0) {          //jika p kecil dari 0 (y nya tetap)
               p+=2*x+1;        //maka p = p+2*x + 1
            } else {            //jika tidak, p sama dengan 0 / p lebih dari 0
                y--;            //y dikurang 1
                p+=2*(x-y)+1;   //p = p+2*(x-y)+1
            }                   // berheni jika x>y
            
            g.drawRect(xp+x, yp+y, 1, 1);
            g.drawRect(xp-x, yp+y, 1, 1);
            g.drawRect(xp+x, yp-y, 1, 1);
            g.drawRect(xp-x, yp-y, 1, 1);
            g.drawRect(xp+y, yp+x, 1, 1);
            g.drawRect(xp-y, yp+x, 1, 1);
            g.drawRect(xp+y, yp-x, 1, 1);
            g.drawRect(xp-y, yp-x, 1, 1);
        }
    }
}
