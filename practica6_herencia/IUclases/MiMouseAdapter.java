package practica6_herencia.IUclases;

import java.awt.*;
import java.awt.event.*;
import practica6_herencia.DispositivoElectronico;

/**
 *
 * @author JRamR
 */
public class MiMouseAdapter extends MouseAdapter{
    Canvas canvas;
    private int xPos;
    private int yPos;
    private DispositivoElectronico device;
    private int x;
    private int y;
    private int height;
    private int width;
    
    public MiMouseAdapter(Canvas canvas){
    super();
    this.canvas=canvas;
    }
    
     public MiMouseAdapter(Canvas canvas,DispositivoElectronico device, int height, int width, int x, int y){
    super();
    this.canvas=canvas;
    this.device=device;
    this.height=height;
    this.width=width;
    this.x=x;
    this.y=y;
    
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        this.xPos = e.getX();
        this.yPos = e.getY();

        printDatos();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (device != null && isWithinBounds(e.getX(), e.getY())) {
            canvas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (device != null && isWithinBounds(e.getX(), e.getY())) {
            canvas.setCursor(Cursor.getDefaultCursor());
        }
    }

    private boolean isWithinBounds(int x, int y) {
        return x >= this.x && x <= this.x + this.width && y >= this.y && y <= this.y + this.height;
    }

    public void printDatos() {
        if (device != null && isWithinBounds(xPos, yPos)) {
            System.out.println(device.toString());
        }
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

}
