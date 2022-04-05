
package Boletin27;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Boletin27_1 {
   private JFrame marco;
   private JPanel panel1, panel2;
   private JButton botonP, botonL, botonB;
   private JTextField nome , password;
   private JLabel nome1, password1;
   private JTextArea area,elemento;
   
   public void ejercicio(){
         marco= new JFrame("FlowLayout");
          marco.setSize(600, 600);
       panel1 = new JPanel();
       panel2 = new JPanel();
       botonP = new JButton("PREMER");
       botonL = new JButton("LIMPIAR");
       botonB = new JButton ("BOTON");
       nome1= new JLabel("NOME");
       nome = new JTextField ();
       password1 = new JLabel("PASSWORD");
       password = new JTextField ();
       area = new JTextArea("Area de texto");
       elemento = new JTextArea ("ElementoLista1 \n ElementoLista2 \n Elementoista3");
       
        nome1.setBounds(50,50,100,50);
       nome.setBounds(200,50 , 100, 50);
       password1.setBounds(50,150 , 100, 50);
       password.setBounds(200,150 , 100, 50);
       botonP.setBounds(100,400,100,50);
       botonL.setBounds(400,400,100,50);
       botonB.setBounds(300,500,100,50);
       area.setBounds(400,500,150,100);
       elemento.setBounds(100,500,150,100);
       
     panel1.setLayout(null);
     panel1.add(nome1);
     panel1.add(nome);
     panel1.add(password);
     panel1.add(password1);
     panel1.add(botonP);
     panel1.add(botonL);
     
     panel2.setLayout(null);
     panel2.add(elemento);
     panel2.add(botonB);
     panel2.add(area);
     
     marco.add(panel1);
     marco.add(panel2);
       
        marco.setLocationRelativeTo(marco); //lo pone en el medio
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra la aplicacion cuando pulsamos la x
        marco.setVisible(true); //Se fai visible las caracteristicas  
   }
   
       
   
   
}



 

 
  
       
     
      
       
       
     
              