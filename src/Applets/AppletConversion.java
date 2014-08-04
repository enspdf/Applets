package Applets;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletConversion extends Applet implements ActionListener{
	Label l1, l2;
	TextField t1, t2;
	Button b;
	
	public AppletConversion(){
		l1=new Label("Centígrados");
		t1=new TextField();
		l2=new Label("Fahrenheit");
		t2= new TextField();
		b= new Button("Calcular");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}

        @Override
	public void actionPerformed(ActionEvent ae){
		double num = Double.parseDouble(t1.getText());
		t2.setText(""+((9.0/5.0*num)+32));
	}
}