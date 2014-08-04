
package Applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class SimulacionApplet extends Applet implements ActionListener {
    Label l1,l2,l3;
    TextField t1,t2;
    Button b;
    TextArea ta;
    
    public  SimulacionApplet(){
        l1=new Label("Poblacion Inicial");
        t1=new TextField(6);
        l2=new Label("% aumento diario");
        t2=new TextField(6);
        b=new Button("Simular");
        l3=new Label("Resultado de la simulacion");
        ta=new TextArea(20,30);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
        add(ta);
        b.addActionListener(this);              
       
    }

    @Override
    public void init() {
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double i=Double.parseDouble(t1.getText());
        double u=Double.parseDouble(t2.getText());
        ta.setText("");
        int dia=1;
        double poblacion=i;
        while(poblacion<2*i){
            poblacion=poblacion*(1+u/100);
            ta.append("dia "+dia+" poblacion = "+poblacion+"\n");
            dia=dia+1;
        }
        
        
    }

    
}
