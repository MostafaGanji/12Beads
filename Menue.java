import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Menue extends JFrame{
  private JTextField Text1;
  private JTextField Text2;
  protected int nummer;
  Steuerung dieSteuerung;
  private JTextField Text3;
  
  public Menue(Steuerung pSteuerung) {
    dieSteuerung= pSteuerung;
    getContentPane().setLayout(null);
    setVisible(true);
    setSize(500,400);
    
    Text1 = new JTextField();
    Text1.setText("     1-Spieler-Modus");
    Text1.setBounds(317, 55, 115, 41);
    getContentPane().add(Text1);
    Text1.setColumns(10);
    
    Text2 = new JTextField();
    Text2.setText("   2-Spieler-Modus");
    Text2.setBounds(42, 55, 115, 41);
    getContentPane().add(Text2);
    Text2.setColumns(10);
    
    JButton Knopf1 = new JButton("");
    Knopf1.setBounds(343, 117, 72, 23);
    getContentPane().add(Knopf1);
    Knopf1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        nummer=1;
        
        
        
      }
    });
    
    
    JButton Knopf2 = new JButton("");
    Knopf2.setBounds(65, 117, 72, 23);
    getContentPane().add(Knopf2);
    Knopf2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
        
        nummer=2;
        
        
        
        
      }
    });
    
    
    JButton StartButton = new JButton("Start");
    StartButton.setBounds(199, 162, 89, 41);
    getContentPane().add(StartButton);
    
    Text3 = new JTextField();
    Text3.setText("W\u00E4hlen sie einen Spielmodus aus");
    Text3.setBounds(148, 24, 174, 20);
    getContentPane().add(Text3);
    Text3.setColumns(10);
    StartButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dieSteuerung.setModusNummer(nummer);
        
        this.dispose();
        
        

        
        
        
      }

      private void dispose() {
        // TODO Auto-generated method stub
        
      }
    });
    validate();
    repaint();
    
    
    
  }

}
