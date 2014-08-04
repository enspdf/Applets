package Applets;

import java.applet.Applet;
import java.awt.Graphics;

public class ConversionApplet extends Applet {

    @Override
    public void paint(Graphics g){
        float a;
        float b;
        a=30;
        b=(float) ((9.0/5.0*a)+32);
        g.drawString("Centigrados ="+a+"Farenheit ="+b,20,20);
    }
    
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
