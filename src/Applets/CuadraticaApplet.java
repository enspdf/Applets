

package Applets;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CuadraticaApplet extends Applet implements ActionListener {
    Label a,b,c,raiz1,raiz2;
    TextField t1,t2,t3,t4,t5;
    Button bt;
    
    
    @Override
    public void paint(Graphics g){
        a=new Label("a");
        b=new Label ("b");
        c=new Label ("c");
        raiz1=new Label ("Raiz 1");
        raiz2=new Label ("Raiz 2");
        bt=new Button ("Calcular");
        add(a);
        add(b);
        add(c);
        add(bt);
        add(raiz1);
        add(raiz2);
        bt.addActionListener(this);
        g.drawString("Soluciones de ecuaciones cuadraticas",40,20);
        
                
    }
    

    
    @Override
    public void init() {
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
