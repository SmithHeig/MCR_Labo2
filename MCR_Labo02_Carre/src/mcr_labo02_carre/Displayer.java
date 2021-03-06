/**
 * @author James Smith et Jérémie
 */

package mcr_labo02_carre;

import java.awt.Graphics2D;

public interface Displayer
{
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String s);
}
