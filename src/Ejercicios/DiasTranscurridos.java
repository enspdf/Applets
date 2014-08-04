package Ejercicios;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

// <applet width="100" height="190" code="DiasTranscurridos"> </applet>


public class DiasTranscurridos extends Applet implements ActionListener {

    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b;
    
    public DiasTranscurridos(){
        l1=new Label("Año");
        t1=new TextField("",2);
        l2=new Label("Dias");
        t2=new TextField("",2);
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
        
        //Comprobacion de posibles espacios vacios.
        if(t1.getText().trim().length()==0 && t2.getText().trim().length()==0 || t1.getText().trim().length()==0 || t2.getText().trim().length()==0){ 
            JOptionPane.showMessageDialog(this,"ERROR.\nNo se permite enspacios en blanco, \nDebe llenar todos los campos.","Error",JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            int year=Integer.parseInt(t1.getText());
            int day=Integer.parseInt(t2.getText());
            
            //Comprobando si el año es bisiesto.            
            if (year%4==0 && year%100 != 0 || year%400==0){ 
                if(day>0&&day<=31){
                    t4.setText("1");
                    t5.setText(""+day);
                }
                else if(day>31&&day<=60){
                    t4.setText("2");
                    t5.setText(""+(day-31));
                }
                else if(day>60&&day<=91){
                    t4.setText("3");
                    t5.setText(""+(day-60));
                }
                else if(day>91&&day<=121){
                    t4.setText("4");
                    t5.setText(""+(day-91));
                }
                else if(day>121&&day<=152){
                    t4.setText("5");
                    t5.setText(""+(day-121));
                }
                else if(day>152&&day<=182){
                    t4.setText("6");
                    t5.setText(""+(day-152));
                }
                else if(day>182&&day<=213){
                    t4.setText("7");
                    t5.setText(""+(day-182));
                }
                else if(day>213&&day<=244){
                    t4.setText("8");
                    t5.setText(""+(day-213));
                }
                else if(day>244&&day<=274){
                    t4.setText("9");
                    t5.setText(""+(day-244));
                }
                else if(day>274&&day<=305){
                    t4.setText("10");
                    t5.setText(""+(day-274));
                }
                else if(day>305&&day<=335){
                    t4.setText("11");
                    t5.setText(""+(day-305));
                }
                else if(day>335&&day<=366){
                    t4.setText("12");
                    t5.setText(""+(day-335));
                }
                t3.setText(""+year);
                
                if(day>366){
                    JOptionPane.showMessageDialog(null,"Los "+day+" dias sobrepasan los 366 dias posibles ","Error",JOptionPane.ERROR_MESSAGE);
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    
                }
                JOptionPane.showMessageDialog(null,"El año "+year+ " es Bisiesto \n Acepte para continuar","AÑO",JOptionPane.INFORMATION_MESSAGE);
            
            }
            //Comprueba que el año no es bisiesto
            else{
                if(day>0&&day<=31){
                    t4.setText("1");
                    t5.setText(""+day);
                }
                else if(day>31&&day<=59){
                    t4.setText("2");
                    t5.setText(""+(day-31));
                }
                else if(day>59&&day<=90){
                    t4.setText("3");
                    t5.setText(""+(day-59));
                }
                else if(day>90&&day<=120){
                    t4.setText("4");
                    t5.setText(""+(day-90));
                }
                else if(day>120&&day<=151){
                    t4.setText("5");
                    t5.setText(""+(day-120));
                }
                else if(day>151&&day<=181){
                    t4.setText("6");
                    t5.setText(""+(day-151));
                }
                else if(day>181&&day<=212){
                    t4.setText("7");
                    t5.setText(""+(day-181));
                }
                else if(day>212&&day<=243){
                    t4.setText("8");
                    t5.setText(""+(day-212));
                }
                else if(day>243&&day<=273){
                    t4.setText("9");
                    t5.setText(""+(day-243));
                }
                else if(day>273&&day<=304){
                    t4.setText("10");
                    t5.setText(""+(day-273));
                }
                else if(day>304&&day<=334){
                    t4.setText("11");
                    t5.setText(""+(day-304));
                }
                else if(day>334&&day<=365){
                    t4.setText("12");
                    t5.setText(""+(day-334));
                }                
                t3.setText(""+year);
                
                if(day>365){
                    JOptionPane.showMessageDialog(null,"Los "+day+" dias sobrepasan los 365 dias posibles ","Error",JOptionPane.ERROR_MESSAGE);
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");                    
                }              
                JOptionPane.showMessageDialog(null,"El año "+year+ " no es Bisiesto \n Acepte para continuar","AÑO",JOptionPane.INFORMATION_MESSAGE);
            
            }
        
        
        
        }
        
        
    }

    
}

