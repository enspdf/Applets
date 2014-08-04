
package Applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// <applet width="100" height="190" code="DiasTranscurridos"> </applet>


public class DiasTranscurridosErroneo extends Applet implements ActionListener {

    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b;
    
    public DiasTranscurridosErroneo(){
        l1=new Label("Año");
        t1=new TextField("",1);
        l2=new Label("Dias");
        t2=new TextField("",1);
        b=new Button("CONVERSION");
        l3=new Label("Año");
        t3=new TextField("",2);
        l4=new Label("Mes");
        t4=new TextField("",2);
        l5=new Label("Dias");
        t5=new TextField("",2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        b.addActionListener(this);
    }
    

    
    
    @Override
    public void init() {
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int meses=0;
        int dias=0;
        int multiplicacion=0;
        int year=Integer.parseInt(t1.getText());
        int days=Integer.parseInt(t2.getText());
        meses=days/30;
        multiplicacion=meses*30;
        dias=days-multiplicacion;
        
        t3.setText(""+year);
        t4.setText(""+meses);
        t5.setText(""+dias);
    }

    
}
