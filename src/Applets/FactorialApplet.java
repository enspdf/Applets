package Applets;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class FactorialApplet extends Applet implements ActionListener{
    Label l1,l2;
    TextField numero,factorial;
    Button b;
    
    
    public FactorialApplet(){
        l1=new Label("Numero");
        numero=new TextField(4);
        l2=new Label("Factorial");
        factorial=new TextField(5);
        b=new Button("Calcular");
        
        add(l1);
        add(numero);
        add(b);
        add(l2);
        add(factorial);
        
        b.addActionListener(this);
    }

    
   
    @Override
    public void init() {
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int num=Integer.parseInt(numero.getText());
        int resultado=1;
        
        for(int i=num; i>0; i--){
            resultado *=i;
        }
        factorial.setText(""+resultado);
    }

    
}
