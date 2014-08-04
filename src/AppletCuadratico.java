
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletCuadratico extends Applet implements ActionListener {

    private static final long serialVersionUID = 1L;
    private TextField field_a, field_b, field_c;
    private Label label_x1, label_x2;
    private Button button;

    @Override
    public void init() {
        field_a = new TextField();
        field_b = new TextField();
        field_c = new TextField();
        label_x1 = new Label();
        label_x2 = new Label();
        button = new Button("Procesar");
        setLayout(new BorderLayout());
        Panel panel, subpanel;
        panel = new Panel(new BorderLayout());
        subpanel = new Panel(new GridLayout(3, 1));
        subpanel.add(new Label("   a:"));
        subpanel.add(new Label("   b:"));
        subpanel.add(new Label("   c:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new Panel(new GridLayout(3, 1));
        subpanel.add(field_a);
        subpanel.add(field_b);
        subpanel.add(field_c);
        panel.add(subpanel);
        add(panel, BorderLayout.NORTH);
        panel = new Panel(new FlowLayout());
        panel.add(button);
        add(panel);
        panel = new Panel(new BorderLayout());
        subpanel = new Panel(new GridLayout(2, 1));
        subpanel.add(new Label("Valor de x1:"));
        subpanel.add(new Label("Valor de x2:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new Panel(new GridLayout(2, 1));
        subpanel.add(label_x1);
        subpanel.add(label_x2);
        panel.add(subpanel);
        add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double a, b, c, x1, x2;
        try {
            a = Double.parseDouble(field_a.getText());
            b = Double.parseDouble(field_b.getText());
            c = Double.parseDouble(field_c.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        x1=(-b+Math.sqrt(b*b-4.0*a*c))/2.0/a;
        x2=(-b-Math.sqrt(b*b-4.0*a*c))/2.0/a;
        label_x1.setText(String.valueOf(x1));
        label_x2.setText(String.valueOf(x2));
    }

}