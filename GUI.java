import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUI extends JFrame{
  private ImageIcon icon1 = new ImageIcon ("C:\\Users\\lucas\\Downloads\\kugle-1-removebg-previewSkaliertNummero1.png");
  private ImageIcon icon2 = new ImageIcon ("C:\\Users\\lucas\\Downloads\\Kugelllllllll (1) (2).png");
  private ImageIcon spielBrett = new ImageIcon("C:\\Users\\lucas\\Downloads\\spielfeld04.jpg");
  private boolean verschiebenNach[]= new boolean[25];//stellen die Buttons dar
  private int buttonGedrueckt=0;
  JButton buttons[]= new JButton[25];
  private JLabel spielsteineP1[]= new JLabel[12];//Spieler 1 Spielsteine
  private JLabel spielsteineP2[]=new JLabel[12];//Spieler 2 Spielsteine
  private JLabel spielBrettLabel=new JLabel();
  private static int modusNummer; // zeigt an ob 1 oder 2 Spieler-Modus
  private int werIstDran;
  Steuerung dieSteuerungen;
  Spielbrett brett;
  JLabel [] spielerNamen=new JLabel[2];
  int SteineAufFeldSpeichernP1[]=new int[25];
  int SteineAufFeldSpeichernP2[]=new int[25];
  
  //Knöpfe mit gegnerischen Spielfigur disabeln-->wenn Knopf gedrückt wurde, dann Knöpfe mit eigenen Spielfiguren disabeln.
  //Wenn ein zug gemacht wurde, andere Spieler ist dran
  
  public GUI(Steuerung pSteuerung,Spielbrett pBrett) {
	  brett=pBrett;
    dieSteuerungen = pSteuerung;
    for(int j=0;j<25;j++) {
        buttons[j]=new JButton();
        buttons[j].setEnabled(false);
      }
    
    for(int z=0;z<12;z++) {
    	SteineAufFeldSpeichernP1[z]=z;
    	SteineAufFeldSpeichernP2[z]=z;
    }
    
    
  
  }
  
  public void getPNamen(String [] namen) {
	  spielerNamen[0]=new JLabel(namen[0]);
	  spielerNamen[1]= new JLabel(namen[1]);
	  }
  
  
  public void guiWerDranIst(int werIsssstDran) {
	  werIstDran=werIsssstDran;
	  System.out.println("GUI "+werIstDran);
	  
  }
 
    
    
    
  
  public static void setModusNummer(int modiNr) {
    modusNummer=modiNr;
    
  }
  
  public void zeichneGUI() {
    setVisible(true);
    setSize(900,945);
    setTitle("");
   setLocationRelativeTo(null);
    getContentPane().setLayout(null);
      if(modusNummer==2) {
        zweiSpielerModus();
        
      }
      
      if(modusNummer==1) {
        einzelSpielerModus();
        
      }
      validate();
      repaint();
  }
  
  public void einzelSpielerModus() {
    
  }
  
  public void zweiSpielerModus() {
    for(int j=0;j<12;j++) {
        spielsteineP1[j]=new JLabel(icon1);
        
      }
      
      for(int j=0;j<12;j++) {
        spielsteineP2[j]= new JLabel(icon2);

      }
      
      
      Font nameFont = new Font("serif", Font.BOLD + Font.ITALIC,31);
      
      spielerNamen[0].setBounds(500, -20, 180, 100);

      spielerNamen[0].setFont(nameFont);

      getContentPane().add(spielerNamen[0]);

      

      spielerNamen[1].setBounds(520, 820, 180, 100);

      spielerNamen[1].setFont(nameFont);

      getContentPane().add(spielerNamen[1]);

      
      buttons[0].setBounds(90, 90, 60, 60);
      getContentPane().add(buttons[0]);
      buttons[0].setContentAreaFilled(true);
      buttons[0].setBorder(null);
      
      buttons[1].setBounds(256, 94, 60, 60);
      getContentPane().add(buttons[1]);
      buttons[1].setContentAreaFilled(true);
      buttons[1].setBorder(null);
      
      buttons[2].setBounds(420, 94, 60, 60);
      getContentPane().add(buttons[2]);
      buttons[2].setContentAreaFilled(true);
      buttons[2].setBorder(null);
      
      
      buttons[3].setBounds(587, 90, 60, 60);
      getContentPane().add(buttons[3]);
      buttons[3].setContentAreaFilled(true);
      buttons[3].setBorder(null);
      
      buttons[4].setBounds(760, 90, 60, 60);
      getContentPane().add(buttons[4]);
      buttons[4].setContentAreaFilled(true);
      buttons[4].setBorder(null);
      
      buttons[5].setBounds(90, 250, 60, 60);
      getContentPane().add(buttons[5]);
      buttons[5].setContentAreaFilled(true);
      buttons[5].setBorder(null);
      
      buttons[6].setBounds(257,260, 60, 60);
      getContentPane().add(buttons[6]);
      buttons[6].setContentAreaFilled(true);
      buttons[6].setBorder(null);
      
      buttons[7].setBounds(420, 260, 60, 60);
      getContentPane().add(buttons[7]);
      buttons[7].setContentAreaFilled(true);
      buttons[7].setBorder(null);
      
      buttons[8].setBounds(587, 260, 60, 60);
      getContentPane().add(buttons[8]);
      buttons[8].setContentAreaFilled(true);
      buttons[8].setBorder(null);
      
      buttons[9].setBounds(760, 260, 60, 60);
      getContentPane().add(buttons[9]);
      buttons[9].setContentAreaFilled(true);
      buttons[9].setBorder(null);
      
      buttons[10].setBounds(90, 418, 60, 60);
      getContentPane().add(buttons[10]);
      buttons[10].setContentAreaFilled(true);
      buttons[10].setBorder(null);
      
      buttons[11].setBounds(255, 425, 60, 60);
      getContentPane().add(buttons[11]);
      buttons[11].setContentAreaFilled(true);
      buttons[11].setBorder(null);
      
      buttons[12].setBounds(425, 425, 60, 60);
      getContentPane().add(buttons[12]);
      buttons[12].setContentAreaFilled(true);
      buttons[12].setBorder(null);
      
      buttons[13].setBounds(590,425, 60, 60);
      getContentPane().add(buttons[13]);
      buttons[13].setContentAreaFilled(true);
      buttons[13].setBorder(null);
      
      buttons[14].setBounds(755,425, 60, 60);
      getContentPane().add(buttons[14]);
      buttons[14].setContentAreaFilled(true);
      buttons[14].setBorder(null);
      
      buttons[15].setBounds(90, 580, 60, 60);
      getContentPane().add(buttons[15]);
      buttons[15].setContentAreaFilled(true);
      buttons[15].setBorder(null);
      
      buttons[16].setBounds(255, 585, 60, 60);
      getContentPane().add(buttons[16]);
      buttons[16].setContentAreaFilled(true);
      buttons[16].setBorder(null);
      
      buttons[17].setBounds(422, 588, 60, 60);
      getContentPane().add(buttons[17]);
      buttons[17].setContentAreaFilled(true);
      buttons[17].setBorder(null);
      
      buttons[18].setBounds(588, 588, 60, 60);
      getContentPane().add(buttons[18]);
      buttons[18].setContentAreaFilled(true);
      buttons[18].setBorder(null);
      
      buttons[19].setBounds(755, 588, 60, 60);
      getContentPane().add(buttons[19]);
      buttons[19].setContentAreaFilled(true);
      buttons[19].setBorder(null);
      
      buttons[20].setBounds(93, 734, 60, 60);
      getContentPane().add(buttons[20]);
      buttons[20].setContentAreaFilled(true);
      buttons[20].setBorder(null);
      
      buttons[21].setBounds(255, 745, 60, 60);
      getContentPane().add(buttons[21]);
      buttons[21].setContentAreaFilled(true);
      buttons[21].setBorder(null);
      
      buttons[22].setBounds(422, 745, 60, 60);
      getContentPane().add(buttons[22]);
      buttons[22].setContentAreaFilled(true);
      buttons[22].setBorder(null);
      
      buttons[23].setBounds(588, 745, 60, 60);
      getContentPane().add(buttons[23]);
      buttons[23].setContentAreaFilled(true);
      buttons[23].setBorder(null);
      
      buttons[24].setBounds(750, 745, 60, 60);
      getContentPane().add(buttons[24]);
      buttons[24].setContentAreaFilled(true);
      buttons[24].setBorder(null);

      
      spielsteineP1[0].setBounds(47, 54, 200, 200);
      getContentPane().add(spielsteineP1[0]);
      
      
      spielsteineP1[1].setBounds(215, 60, 200, 200);
      getContentPane().add(spielsteineP1[1]);
      
      spielsteineP1[2].setBounds(380, 60, 200, 200);
      getContentPane().add(spielsteineP1[2]);

      spielsteineP1[3].setBounds(547, 60, 200, 200);
      getContentPane().add(spielsteineP1[3]);
      
      spielsteineP1[4].setBounds(715, 60, 200, 200);
      getContentPane().add(spielsteineP1[4]);
      
      spielsteineP1[5].setBounds(49, 220, 200, 200);
      getContentPane().add(spielsteineP1[5]);
      
      spielsteineP1[6].setBounds(215, 227, 200, 200);
      getContentPane().add(spielsteineP1[6]);
      
      
      spielsteineP1[7].setBounds(380, 230, 200, 200);
      getContentPane().add(spielsteineP1[7]);
      
      spielsteineP1[8].setBounds(547, 230, 200, 200);
      getContentPane().add(spielsteineP1[8]);

      spielsteineP1[9].setBounds(715, 230, 200, 200);
      getContentPane().add(spielsteineP1[9]);
      
      spielsteineP1[10].setBounds(49, 385, 200, 200);
      getContentPane().add(spielsteineP1[10]);
      
      spielsteineP1[11].setBounds(215, 390, 200, 200);
      getContentPane().add(spielsteineP1[11]);
      
      
      spielsteineP2[0].setBounds(520, 357, 200, 200);
      getContentPane().add(spielsteineP2[0]);
      
      
      spielsteineP2[1].setBounds(682, 357, 200, 200);
      getContentPane().add(spielsteineP2[1]);

      spielsteineP2[2].setBounds(23, 512, 200, 200);
      getContentPane().add(spielsteineP2[2]);
      
      spielsteineP2[3].setBounds(188, 520, 200, 200);
      getContentPane().add(spielsteineP2[3]);
      
      spielsteineP2[4].setBounds(352, 520, 200, 200);
      getContentPane().add(spielsteineP2[4]);
      
      
      spielsteineP2[5].setBounds(517, 520, 200, 200);
      getContentPane().add(spielsteineP2[5]);

      spielsteineP2[6].setBounds(686, 520, 200, 200);
      getContentPane().add(spielsteineP2[6]);
      
      spielsteineP2[7].setBounds(25, 665, 200, 200);
      getContentPane().add(spielsteineP2[7]);
      
      spielsteineP2[8].setBounds(188, 677, 200, 200);
      getContentPane().add(spielsteineP2[8]);
      
      
      spielsteineP2[9].setBounds(352, 675, 200, 200);
      getContentPane().add(spielsteineP2[9]);

      spielsteineP2[10].setBounds(517, 675, 200, 200);
      getContentPane().add(spielsteineP2[10]);
      
      spielsteineP2[11].setBounds(680, 675, 200, 200);
      getContentPane().add(spielsteineP2[11]);
      
      spielBrettLabel = new JLabel(spielBrett);       
      spielBrettLabel.setBounds(-50, -48, 1000, 1000);
      getContentPane().add(spielBrettLabel);
      
      switch(werIstDran) {
      
      	case 1: turn1player();
      			break;
      
      	case 0: turn2player();
      			break;
      }
      
      
  }
  
  public void turn1player() {
	  System.out.println("Player 1 Turn aus GUI");
	  
	  buttons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(buttonGedrueckt==0) {
					verschiebenNach[0]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP1(0);
			
			
			
				}
		
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							
							spielsteineP1[j].setBounds(47, 54, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn2player();
				}
				buttonGedrueckt++;
		
		
			}

		});

		buttons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(buttonGedrueckt==0) {
					verschiebenNach[1]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP1(1);
				
				
				
				}
			
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP1[j].setBounds(215, 60, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn2player();
				}
				buttonGedrueckt++;
			
			
			}

		});

		buttons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(buttonGedrueckt==0) {
					verschiebenNach[2]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP1(2);
				
			
			
				}
		
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP1[j].setBounds(380, 60, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn2player();
				}
				buttonGedrueckt++;
		
		
			}

		});

		buttons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(buttonGedrueckt==0) {
					verschiebenNach[3]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP1(3);
			
			
			
				}
		
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP1[j].setBounds(547, 60, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn2player();
				}
				buttonGedrueckt++;
			
		
			}

		});

		buttons[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(buttonGedrueckt==0) {
					verschiebenNach[4]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP1(4);
			
			
			
				}
		
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP1[j].setBounds(715, 60, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn2player();
				}
				buttonGedrueckt++;
		
		
			}

		});
		
		buttons[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(buttonGedrueckt==0) {
					verschiebenNach[5]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP1(5);
			
			
			
				}
		
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP1[j].setBounds(49, 220, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn2player();
				}
				buttonGedrueckt++;
		
		
			}

		});

		buttons[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(buttonGedrueckt==0) {
					verschiebenNach[6]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP1(6);
			
			
			
				}
		
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP1[j].setBounds(215, 227, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn2player();
				}
				buttonGedrueckt++;
		
		
			}

		});

buttons[7].addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		if(buttonGedrueckt==0) {
			verschiebenNach[7]=true;
			dieSteuerungen.knopfGedruecktFuerBrettP1(7);
			
			
			
		}
		
		if(buttonGedrueckt==1){
			for(int j=0;j<25;j++) {
				if(verschiebenNach[j]==true) {
					spielsteineP1[j].setBounds(380, 230, 200, 200);
					verschiebenNach[j]=false;
				}
			}
			buttonGedrueckt=0;
			turn2player();
		}
		buttonGedrueckt++;
		
		
	}

});

buttons[8].addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		if(buttonGedrueckt==0) {
			verschiebenNach[8]=true;
			dieSteuerungen.knopfGedruecktFuerBrettP1(8);
			
			
			
		}
		
		if(buttonGedrueckt==1){
			for(int j=0;j<25;j++) {
				if(verschiebenNach[j]==true) {
					spielsteineP1[j].setBounds(547, 230, 200, 200);
					verschiebenNach[j]=false;
				}
			}
			buttonGedrueckt=0;
			turn2player();;
		}
		buttonGedrueckt++;
		
		
	}

});

buttons[9].addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		if(buttonGedrueckt==0) {
			verschiebenNach[9]=true;
			dieSteuerungen.knopfGedruecktFuerBrettP1(9);
			
			
		}
		
		if(buttonGedrueckt==1){
			for(int j=0;j<25;j++) {
				if(verschiebenNach[j]==true) {
					spielsteineP1[j].setBounds(715, 230, 200, 200);
					verschiebenNach[j]=false;
				}
			}
			buttonGedrueckt=0;
			turn2player();
		}
		buttonGedrueckt++;
		
		
	}

});

buttons[10].addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		if(buttonGedrueckt==0) {
			verschiebenNach[10]=true;
			dieSteuerungen.knopfGedruecktFuerBrettP1(10);
			
			
		}
		
		if(buttonGedrueckt==1){
			for(int j=0;j<25;j++) {
				if(verschiebenNach[j]==true) {
					spielsteineP1[j].setBounds(49, 385, 200, 200);
					verschiebenNach[j]=false;
				}
			}
			buttonGedrueckt=0;
			turn2player();
		}
		buttonGedrueckt++;
		
		
	}

});

buttons[11].addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {

		if(buttonGedrueckt==0) {
			verschiebenNach[11]=true;
			dieSteuerungen.knopfGedruecktFuerBrettP1(11);
			
			
			
		}
		
		if(buttonGedrueckt==1){
			for(int j=0;j<25;j++) {
				if(verschiebenNach[j]==true) {
					spielsteineP1[j].setBounds(215, 390, 200, 200);
					verschiebenNach[j]=false;
				}
			}
			buttonGedrueckt=0;
			turn2player();
		}
		buttonGedrueckt++;
		
		
	}

});

buttons[12].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[12]=true;
				
				dieSteuerungen.knopfGedruecktFuerBrettP1(12);
				System.out.println("Knopf 12 wurde gedrüctk");
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(382, 392, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[13].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[13]=true;
				
				dieSteuerungen.knopfGedruecktFuerBrettP1(13);
				System.out.println("Knopf 13 wurde gedrüctk");
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(520, 357, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[14].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[14]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(14);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(682, 357, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[15].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[15]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(15);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(23, 512, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[16].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[16]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(16);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(188, 520, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[17].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[17]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(17);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(352, 520, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[18].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[18]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(18);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(517, 520, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[19].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[19]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(19);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(686, 520, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[20].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[20]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(20);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(25, 665, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[21].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[21]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(21);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(188, 677, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[22].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[22]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(22);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(352, 675, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
 buttons[23].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[23]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(23);
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(517, 675, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	       buttons[24].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[24]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP1(24);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP1[j].setBounds(680, 675, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn2player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
  }
  
  public void turn2player() {
	  System.out.println("Player 2 Turn aus GUI");
      buttons[0].addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[0]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(0);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(47, 54, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[1]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(1);
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(215, 60, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
	  
	  buttons[2].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[2]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(2);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(380, 60, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[3].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[3]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(3);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(547, 60, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[4].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[4]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(4);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(715, 60, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[5].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[5]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(5);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(49, 220, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[6].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[6]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(6);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(215, 227, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[7].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[7]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(7);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(380, 230, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[8].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[8]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(8);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(547, 230, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[9].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[9]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(9);
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(715, 230, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[10].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[10]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(10);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(49, 385, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[11].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if(buttonGedrueckt==0) {
				verschiebenNach[11]=true;
				dieSteuerungen.knopfGedruecktFuerBrettP2(11);
				
				
				
			}
			
			if(buttonGedrueckt==1){
				for(int j=0;j<25;j++) {
					if(verschiebenNach[j]==true) {
						spielsteineP2[j].setBounds(215, 390, 200, 200);
						verschiebenNach[j]=false;
					}
				}
				buttonGedrueckt=0;
				turn1player();
			}
			buttonGedrueckt++;
			
			
		}

	});
	  
	  buttons[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[12]=true;
					System.out.println("Knopf 12 wurde gedrueckt");
					dieSteuerungen.knopfGedruecktFuerBrettP2(12);
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(520, 357, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[13]=true;
					
					dieSteuerungen.knopfGedruecktFuerBrettP2(13);
					System.out.println("Knopf 12 wurde gedrüctk");
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(520, 357, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[14]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(14);
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(682, 357, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[15]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(15);
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(23, 512, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[16]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(16);
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(188, 520, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[17]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(17);
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(352, 520, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[18]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(18);
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(517, 520, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[19]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(19);
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(686, 520, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[20].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[20]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(20);
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(25, 665, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[21].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[21]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(21);
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(188, 677, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[22].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[22]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(22);
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(352, 675, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
     buttons[23].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[23]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(23);
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(517, 675, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
				}
				buttonGedrueckt++;
				
				
			}

		});
    	       buttons[24].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(buttonGedrueckt==0) {
					verschiebenNach[24]=true;
					dieSteuerungen.knopfGedruecktFuerBrettP2(24);
					
					
					
				}
				
				if(buttonGedrueckt==1){
					for(int j=0;j<25;j++) {
						if(verschiebenNach[j]==true) {
							spielsteineP2[j].setBounds(680, 675, 200, 200);
							verschiebenNach[j]=false;
						}
					}
					buttonGedrueckt=0;
					turn1player();
			
				}
				buttonGedrueckt++;
				
				
				
				
			}

		});	       
	  
  }
	  
      
      
      
     
      			
	       
         
      
      
      
      
  
}
