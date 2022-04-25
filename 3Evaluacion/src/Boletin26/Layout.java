package Boletin26;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Layout {
    private  JFrame marco;
    private  JPanel panel;
    private  JButton premer,Limpiar;
    private JTextField nome, password;
    private JLabel nome1,password1;
    private JTextArea area;

    public void ejercicio(){
        //Creamos los objetos
        marco= new JFrame("FlowLayout");
        panel = new JPanel();
        marco.setSize(600, 600);
        premer = new JButton("PREMER");
        Limpiar = new JButton("LIMPIAR");
        nome1= new JLabel("NOME");
        nome = new JTextField ();
        password1 = new JLabel("PASSWORD");
        password = new JTextField ();
        area = new JTextArea("Area de texto");

        //Le damos tamaño al arco , al panel y a los botones
        nome1.setBounds(50,50,100,50);
        nome.setBounds(200,50 , 100, 50);
        password1.setBounds(50,150 , 100, 50);
        password.setBounds(200,150 , 100, 50);
        area.setBounds(200, 250, 200, 100);
        premer.setBounds(100,400,100,50);
        Limpiar.setBounds(300,400,100,50);



        //indicamos el Layout que vamos a utilizar
        panel.setLayout(null);
        panel.add(nome1);
        panel.add(nome);
        panel.add(password1);
        panel.add(password);
        panel.add(area);
        panel.add(premer);
        panel.add(Limpiar);
        marco.add(panel);

        premer.addActionListener((ActionListener) this);
        Limpiar.addActionListener((ActionListener) this);

        marco.setLocationRelativeTo(marco); //lo pone en el medio
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra la aplicacion cuando pulsamos la x
        marco.setVisible(true); //Se fai visible las caracteristicas


    }

    public void actionPerformed(ActionEvent e){
        Object ob= e.getSource();

        if (ob==premer){
            area.setText("Hola" + nome.getText());
        }
        else{
            area.setText( "" );
        }
    }

}