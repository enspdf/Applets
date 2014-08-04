

package Ejercicios;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CuadraticaOperacion extends Applet implements ActionListener {

    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Button b;
    
    public CuadraticaOperacion(){
        l1=new Label("a");
        t1=new TextField("",1);
        l2=new Label("b");
        t2=new TextField("",1);
        l3=new Label("c");
        t3=new TextField("",1);
        b=new Button("Calcular");
        l4=new Label("Raiz 1");
        t4=new TextField("",2);
        l5=new Label("Raiz 2");
        t5=new TextField("",2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
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
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent ae) {
        double a1,b1,c1,r1,r2,valor;
        
        a1=Double.parseDouble(t1.getText());
        b1=Double.parseDouble(t2.getText());
        c1=Double.parseDouble(t3.getText());
        valor=((b1*b1)-(4*a1*c1));
        
        if(valor>0){
            r1=(-b1+Math.sqrt(valor))/(2*a1);
            r2=(-b1-Math.sqrt(valor))/(2*a1);
            t4.setText(String.valueOf(r1));
            t5.setText(String.valueOf(r2));
        }
        
        if(valor<0){
            t4.setText(String.valueOf("Error"));
            t5.setText(String.valueOf("Error"));
            JOptionPane.showMessageDialog(t4,"Solucion Imaginaria");
        }
        
        
        
        
            
    }

    
}
