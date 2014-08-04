
package Applets;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class FechaApplet extends Applet implements ActionListener{

   Label l1,l2,l3;
   TextField t1,t2;
   TextArea ta;
   Button b;
   
   public FechaApplet(){
       l1=new Label("Dia");
       t1=new TextField(5);
       l2=new Label("Mes");
       t2=new TextField(5);
       l3=new Label("Fecha con Letras");
       ta=new TextArea(20,28);
       b=new Button("CAMBIAR");
       
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
        int dia=Integer.parseInt(t1.getText());
        int mes=Integer.parseInt(t2.getText());
        String meses;
        String dias;
        
        switch(dia){
            case 1:
                dias="Lunes";
                break;
            case 2:
                dias="Martes";
                break;
            case 3:
                dias="Miercoles";
                break;
            case 4:
                dias="Jueves";
                break;
            case 5:
                dias="Viernes";
                break;
            case 6:
                dias="Sábado";
                break;
            case 7:
                dias="Domingo";
                break;
            default:
                dias="Dia erroneo";
                
        }
        switch(mes){
            case 1:
                meses=("Enero");
                break;
            case 2:
                meses=("Febrero");
                break;
            case 3:
                meses=("Marzo");
                break;
            case 4:
                meses=("Abril");
                break;
            case 5:
                meses=("Mayo");
                break;
            case 6:
                meses=("Junio");
                break;
            case 7:
                meses=("Julio");
                break;
            case 8:
                meses=("Agosto");
                break;
            case 9:
                meses=("Septiembre");
                break;
            case 10:
                meses=("Octubre");
                break;
            case 11:
                meses=("Noviembre");
                break;
            case 12:
                meses=("Diciembre");
                break;
            default:
                meses=("Mes erroneo");                
        }
        ta.setText(dias+" de "+meses);
                
    }

    
}
