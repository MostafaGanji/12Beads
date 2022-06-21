import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Menue extends JFrame{
	private JTextField Text1;
	private JTextField Text2;
	protected int nummer;
	Steuerung dieSteuerung;
	 ImageIcon menueDesign = new ImageIcon ("T:\\Klasse tgi12\\IT\\Mostafa\\SkalierteBilder\\Start Seite.jpg");
	private JLabel menueLabel=new JLabel();
	
	public Menue(Steuerung pSteuerung) {
		
		dieSteuerung= pSteuerung;
		getContentPane().setLayout(null);
		setVisible(true);
		setSize(850,870);
		setTitle("12 Beads Menü");
		
		
		JButton Knopf1 = new JButton("");
		Knopf1.setBounds(310, 350, 280, 117);
		getContentPane().add(Knopf1);
		Knopf1.setContentAreaFilled(false);
	    Knopf1.setBorder(null);
		
		JButton Knopf2 = new JButton("");
		Knopf2.setBounds(310, 525, 280, 117);
		getContentPane().add(Knopf2);
		Knopf2.setContentAreaFilled(false);
	    Knopf2.setBorder(null);
		
		JButton exitButton = new JButton("");
		exitButton.setBounds(337, 720, 225, 100);
		getContentPane().add(exitButton);
		exitButton.setContentAreaFilled(false);
	    exitButton.setBorder(null);
		
		JLabel menueLabel= new JLabel(menueDesign);
		menueLabel.setBounds(0, 0, 900, 900);
	    getContentPane().add(menueLabel);
	    menueLabel.setVisible(true);
		
		
		
		Knopf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nummer=1;
				this.dispose();
				dieSteuerung.setModusNummer(nummer);
				
				
				
				
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		
		Knopf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nummer=2;
				this.dispose();
				dieSteuerung.setModusNummer(nummer);
				dieSteuerung.init();
				
				
				
				
				
				
				
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				System.exit(0);
				
			}

		});
		
		
		validate();
		repaint();
		
		
		
	}

}
