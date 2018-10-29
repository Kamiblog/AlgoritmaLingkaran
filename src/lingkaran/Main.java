/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lingkaran;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author CHhannZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("algoritma pembuat lingkaran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);

        gambar gbr = new gambar();
        gbr.setxp(300);
        gbr.setyp(200);
        gbr.setr(100);
        frame.add(gbr);
    }
}
