/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6_herencia.IUclases;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;
import practica6_herencia.Television;

public class TelevisionIU extends Canvas{
    private final Television television;
    private BufferedImage image;
    private Canvas canvas;
    private ImageObserver screen;
    private final String filePath;
    private final int xPos;
    private final int yPos;
    private final int height;
    private final int width;
            
    public TelevisionIU(String filePath, Television television) {
        this.television = television;
        this.filePath=filePath;
        xPos=10;
        yPos=10;
        height=500;
        width=500;
        try {
            image = ImageIO.read(new File(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void imprimirDatos() {
        if(xPos>=10 && xPos<=510 && yPos>=10 && yPos<=510){
        System.out.println(television.toString());
        }
    }

    public void paint(Graphics g) {
        g.drawImage(image, xPos, yPos, width, height, this);
      
    }

    public void imprimirDevice(Canvas canvas) {
        this.canvas=canvas;
        MiMouseAdapter mouse=new MiMouseAdapter(canvas, television,height,width,xPos,yPos);
        canvas.addMouseListener(mouse);
        
        Frame frame = new Frame();
        frame.setSize(1000, 1000);
        frame.add(canvas);
        frame.setVisible(true);
    }
    
    
}