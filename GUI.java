import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUI extends JFrame{
  private ImageIcon icon1 = new ImageIcon ("T:\\Klasse tgi12\\IT\\Mostafa\\SkalierteBilder\\Eine Kugel.png");
  private ImageIcon icon2 = new ImageIcon ("T:\\Klasse tgi12\\IT\\Mostafa\\VonZuhause\\imago0134598197w.jpg");
  private ImageIcon spielBrett = new ImageIcon("T:\\Klasse tgi12\\IT\\Mostafa\\SkalierteBilder\\spielfeld.jpg");
  private boolean verschiebenNach[]= new boolean[25];
  protected int buttonGedrueckt=0;
  public JButton buttons[]= new JButton[25];
  private JLabel spielsteineP1[]= new JLabel[12];
  private JLabel spielsteineP2[]=new JLabel[12];
  private int spielFeldP1[]= new int[25];
  private int spielFeldP2[]= new int[25];
  static int werIstDran;
  private int modusNummer;
  
  //Knöpfe mit gegnerischen Spielfigur disabeln-->wenn Knopf gedrückt wurde, dann Knöpfe mit eigenen Spielfiguren disabeln.
  //Wenn ein zug gemacht wurde, andere Spieler ist dran
  
  public GUI() {
    //werIstDran=werDranIst;
    //getWerIstDran();//kann die Operation nicht aufrufen
    
    for(int j=0;j<4;j++) {
      spielsteineP1[j]=new JLabel(icon1);
      spielFeldP1[j]=j+1;
      System.out.println(spielFeldP1[j]+" 1");
      
    }
    
    for(int j=0;j<4;j++) {
      spielsteineP2[j]= new JLabel(icon2);
      spielFeldP2[j]=j+5;
      System.out.println(spielFeldP2[j]+" 2");
    }
    
    for(int j=0;j<25;j++) {
      buttons[j]=new JButton();
    }
    
    //spielsteineP1[1].setVisible(false);
    //spielsteineP1[4].setVisible(false);
    //spielsteineP1[6].setVisible(false);
      
    
    
    setVisible(true);
    setSize(600,600);
    getContentPane().setLayout(null);
    
    spielsteineP1[0].setBounds(83, 1, 50, 50);
    getContentPane().add(spielsteineP1[0]);
    
    
    
    spielsteineP1[2].setBounds(450, 1, 50, 50);
    getContentPane().add(spielsteineP1[1]);


    
    spielsteineP1[1].setBounds(270, 1, 50, 50);
    getContentPane().add(spielsteineP1[2]);

    spielsteineP1[3].setBounds(83, 125, 50, 50);
    getContentPane().add(spielsteineP1[3]);
    
    
    spielsteineP2[0].setBounds(170, 125, 50, 50);
    getContentPane().add(spielsteineP2[0]);
    
    spielsteineP2[1].setBounds(270, 125, 80, 80);
    getContentPane().add(spielsteineP2[1]);

    spielsteineP2[2].setBounds(365, 125, 80, 80);
    getContentPane().add(spielsteineP2[2]);
    
    spielsteineP2[3].setBounds(450, 130, 80, 80);
    getContentPane().add(spielsteineP2[3]);
    
    
    
    if(werIstDran==1) {
      System.out.println("-----------");
      for(int j=0;j<8;j++) {
        
        if(spielFeldP2[j]>0) { //spielFeldP2[0]=1-->Button an [0] wird deaktiviert
          buttons[spielFeldP1[j]].setEnabled(false);
          
          
        }
        
      }
      
      buttons[1].setBounds(90, 11, 39, 23);
      getContentPane().add(buttons[1]);
      buttons[1].setContentAreaFilled(false);
      buttons[1].setBorder(null);
      buttons[1].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          
          
          if(buttonGedrueckt==0) {
            verschiebenNach[spielFeldP1[0]]= true;    
          }
          
          
          
          if(buttonGedrueckt==1) {
            for(int j=0;j<25;j++) {
              if(verschiebenNach[j]==true) {
                spielsteineP1[j].setBounds(90,11,50,50);
                verschiebenNach[j]=false;
                spielFeldP1[0]=j;
                
                
              }
            }
            buttonGedrueckt=-1;

            
          }
          buttonGedrueckt++;
          System.out.println(buttonGedrueckt);
            
        
              
          
        }
      });
      
      
      buttons[2].setBounds(276, 11, 39, 23);
      getContentPane().add(buttons[2]);
      buttons[2].setContentAreaFilled(false);
      buttons[2].setBorder(null);
      buttons[2].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("2");
           
          if(buttonGedrueckt==0) {
            verschiebenNach[spielFeldP1[1]]= true;
                      
          }
          
          if(buttonGedrueckt==1) {
            for(int j=0;j<25;j++) {
              if(verschiebenNach[j]==true) {
                spielsteineP1[j].setBounds(276,11,50,50);
                verschiebenNach[j]=false;
                spielFeldP1[1]=j;
                
                
                
              }
            }
            buttonGedrueckt=-1;
          }
          buttonGedrueckt++;
          System.out.println(buttonGedrueckt);

          
          
          
          
          
          
        }
      });
      
      
      buttons[3].setBounds(460, 11, 39, 23);
      getContentPane().add(buttons[3]);
      buttons[3].setContentAreaFilled(false);
      buttons[3].setBorder(null);
      buttons[3].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("3");
        
          if(buttonGedrueckt==0) {
            verschiebenNach[spielFeldP1[2]]= true;
                      
          }
          
          if(buttonGedrueckt==1) {
            for(int j=0;j<25;j++) {
              if(verschiebenNach[j]==true) {
                spielsteineP1[j].setBounds(460,11,50,50);
                verschiebenNach[j]=false;
                spielFeldP1[2]=j;
                
                
              }
            }
            buttonGedrueckt=-1;
          }
          buttonGedrueckt++;
          System.out.println(buttonGedrueckt);

          
          
          
          
          
          
        }
      });
      
      buttons[4].setBounds(90, 148, 39, 23);
      getContentPane().add(buttons[4]);
      buttons[4].setContentAreaFilled(false);
      buttons[4].setBorder(null);
      buttons[4].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("4");
          
          if(buttonGedrueckt==0) {
            verschiebenNach[spielFeldP1[3]]= true;
                      
          }
          
          if(buttonGedrueckt==1) {
            for(int j=0;j<25;j++) {
              if(verschiebenNach[j]==true) {
                spielsteineP1[j].setBounds(90,148,50,50);
                verschiebenNach[j]=false;
                spielFeldP1[3]=j;
                
                
              }
            }
            buttonGedrueckt=-1;
          }
          buttonGedrueckt++;
          System.out.println(buttonGedrueckt);

          
          
          
          
          
          
        }
      });
      
      buttons[5].setBounds(178, 148, 39, 23);
      getContentPane().add(buttons[5]);
      buttons[5].setContentAreaFilled(false);
      buttons[5].setBorder(null);
      buttons[5].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("5");
          
          if(buttonGedrueckt==0) {
            verschiebenNach[spielFeldP1[4]]= true;
                      
          }
          
          if(buttonGedrueckt==1) {
            for(int j=0;j<25;j++) {
              if(verschiebenNach[j]==true) {// der j Stein wird verschoben
                spielsteineP1[j].setBounds(178,148,50,50);
                verschiebenNach[j]=false;
                spielFeldP1[4]=j;//spielFeldP1[x] gibt den button an, j gibt die Figur an
                
                
              }
            }
            buttonGedrueckt=-1;
          }
          buttonGedrueckt++;
          System.out.println(buttonGedrueckt);
          for(int j=0;j<8;j++) {
            
          }

          
          
          
          
          
          
        }
      });
      
      
      
      
      
      
      
      buttons[6].setBounds(276, 148, 39, 23);
      getContentPane().add(buttons[6]);
      buttons[6].setContentAreaFilled(false);
      buttons[6].setBorder(null);
      buttons[6].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("6");
          
          if(buttonGedrueckt==0) {
            verschiebenNach[spielFeldP1[5]]= true;
                      
          }
          
          if(buttonGedrueckt==1) {
            for(int j=0;j<25;j++) {
              if(verschiebenNach[j]==true) {
                spielsteineP1[j].setBounds(276,148,50,50);
                verschiebenNach[j]=false;
                spielFeldP1[5]=j;
                
                
              }
            }
            buttonGedrueckt=-1;
          }
          buttonGedrueckt++;
          System.out.println(buttonGedrueckt);

          
          
          
          
          
          
        }
      });
      
      buttons[7].setBounds(370, 148, 39, 23);
      getContentPane().add(buttons[7]);
      buttons[7].setContentAreaFilled(false);
      buttons[7].setBorder(null);
      buttons[7].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("7");
          
          if(buttonGedrueckt==0) {
            verschiebenNach[spielFeldP1[6]]= true;
                      
          }
          
          if(buttonGedrueckt==1) {
            for(int j=0;j<25;j++) {
              if(verschiebenNach[j]==true) {
                spielsteineP1[j].setBounds(370,148,50,50);
                verschiebenNach[j]=false;
                spielFeldP1[6]=j;
                
                
              }
            }
            buttonGedrueckt=-1;
          }
          buttonGedrueckt++;
          System.out.println(buttonGedrueckt);

          
          
          
          
          
          
        }
      });
      
      
      
      
      
      buttons[8].setBounds(460, 148, 39, 23);
      getContentPane().add(buttons[8]);
      buttons[8].setContentAreaFilled(false);
      buttons[8].setBorder(null);
      buttons[8].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.out.println("8");
          
          if(buttonGedrueckt==0) {
            verschiebenNach[spielFeldP1[7]]= true;
                      
          }
          
          if(buttonGedrueckt==1) {
            for(int j=0;j<25;j++) {
              if(verschiebenNach[j]==true) {
                spielsteineP1[j].setBounds(460,148,50,50);
                verschiebenNach[j]=false;
                spielFeldP1[7]=j;
                
                
              }
            }
            buttonGedrueckt=-1;
          }
          buttonGedrueckt++;
          System.out.println(buttonGedrueckt);

          
          
          
          
          
          
        }
      });
      
      
      
      
      
      JLabel lblNewLabel = new JLabel(spielBrett);
      lblNewLabel.setBounds(0, 0, 584, 561);
      getContentPane().add(lblNewLabel);
      repaint();
      
      for(int j=0;j<8;j++) {
        
        System.out.println(spielFeldP2[j]);
        if(spielFeldP2[j]>0) { //spielFeldP2[0]=1-->Button an [0] wird deaktiviert
          buttons[spielFeldP1[j]].setEnabled(true);
          
          
        }
        
      }
      
    }
    
  
  if(werIstDran==2) {
    System.out.println("-----------");
    
    for(int j=0;j<8;j++) {
      System.out.println(spielFeldP2[j]+"  2");
      if(spielFeldP1[j]>0) {
        buttons[spielFeldP1[j]].setEnabled(false);
      }
    }
    
    
    buttons[1].setBounds(90, 11, 39, 23);
    getContentPane().add(buttons[1]);
    buttons[1].setContentAreaFilled(false);
    buttons[1].setBorder(null);
    buttons[1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("1");
         
        
        if(buttonGedrueckt==0) {
          verschiebenNach[spielFeldP2[0]]= true;    
        }
        
        
        
        if(buttonGedrueckt==1) {
          for(int j=0;j<25;j++) {
            if(verschiebenNach[j]==true) {
              spielsteineP2[j].setBounds(90,11,50,50);
              verschiebenNach[j]=false;
              spielFeldP2[0]=j;
              
              
            }
          }
          buttonGedrueckt=-1;

          
        }
        buttonGedrueckt++;
        System.out.println(buttonGedrueckt);
          
      
            
        
      }
    });
    
    buttons[2].setBounds(276, 11, 39, 23);
    getContentPane().add(buttons[2]);
    buttons[2].setContentAreaFilled(false);
    buttons[2].setBorder(null);
    buttons[2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("2");
         
        if(buttonGedrueckt==0) {
          verschiebenNach[spielFeldP2[1]]= true;
                    
        }
        
        if(buttonGedrueckt==1) {
          for(int j=0;j<25;j++) {
            if(verschiebenNach[j]==true) {
              spielsteineP2[j].setBounds(276,11,50,50);
              verschiebenNach[j]=false;
              spielFeldP2[1]=j;
              
              
              
            }
          }
          buttonGedrueckt=-1;
        }
        buttonGedrueckt++;
        System.out.println(buttonGedrueckt);

        
        
        
        
        
        
      }
    });
    
    
    buttons[3].setBounds(460, 11, 39, 23);
    getContentPane().add(buttons[3]);
    buttons[3].setContentAreaFilled(false);
    buttons[3].setBorder(null);
    buttons[3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("3");
      
        if(buttonGedrueckt==0) {
          verschiebenNach[spielFeldP2[2]]= true;
                    
        }
        
        if(buttonGedrueckt==1) {
          for(int j=0;j<25;j++) {
            if(verschiebenNach[j]==true) {
              spielsteineP2[j].setBounds(460,11,50,50);
              verschiebenNach[j]=false;
              spielFeldP2[2]=j;
              
              
            }
          }
          buttonGedrueckt=-1;
        }
        buttonGedrueckt++;
        System.out.println(buttonGedrueckt);

        
        
        
        
        
        
      }
    });
    
    buttons[4].setBounds(90, 148, 39, 23);
    getContentPane().add(buttons[4]);
    buttons[4].setContentAreaFilled(false);
    buttons[4].setBorder(null);
    buttons[4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("4");
        
        if(buttonGedrueckt==0) {
          verschiebenNach[spielFeldP2[3]]= true;
                    
        }
        
        if(buttonGedrueckt==1) {
          for(int j=0;j<25;j++) {
            if(verschiebenNach[j]==true) {
              spielsteineP2[j].setBounds(90,148,50,50);
              verschiebenNach[j]=false;
              spielFeldP2[3]=j;
              
              
            }
          }
          buttonGedrueckt=-1;
        }
        buttonGedrueckt++;
        System.out.println(buttonGedrueckt);

        
        
        
        
        
        
      }
    });
    
    buttons[5].setBounds(178, 148, 39, 23);
    getContentPane().add(buttons[5]);
    buttons[5].setContentAreaFilled(false);
    buttons[5].setBorder(null);
    buttons[5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("5");
        
        if(buttonGedrueckt==0) {
          verschiebenNach[spielFeldP2[4]]= true;
                    
        }
        
        if(buttonGedrueckt==1) {
          for(int j=0;j<25;j++) {
            if(verschiebenNach[j]==true) {// der j Stein wird verschoben
              spielsteineP2[j].setBounds(178,148,50,50);
              verschiebenNach[j]=false;
              spielFeldP2[4]=j;
              
              
            }
          }
          buttonGedrueckt=-1;
        }
        buttonGedrueckt++;
        System.out.println(buttonGedrueckt);
        for(int j=0;j<8;j++) {
          
        }

        
        
        
        
        
        
      }
    });
    
    
    
    
    
    
    
    buttons[6].setBounds(276, 148, 39, 23);
    getContentPane().add(buttons[6]);
    buttons[6].setContentAreaFilled(false);
    buttons[6].setBorder(null);
    buttons[6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("6");
        
        if(buttonGedrueckt==0) {
          verschiebenNach[spielFeldP2[5]]= true;
                    
        }
        
        if(buttonGedrueckt==1) {
          for(int j=0;j<25;j++) {
            if(verschiebenNach[j]==true) {
              spielsteineP2[j].setBounds(276,148,50,50);
              verschiebenNach[j]=false;
              spielFeldP2[5]=j;
              
              
            }
          }
          buttonGedrueckt=-1;
        }
        buttonGedrueckt++;
        System.out.println(buttonGedrueckt);

        
        
        
        
        
        
      }
    });
    
    buttons[7].setBounds(370, 148, 39, 23);
    getContentPane().add(buttons[7]);
    buttons[7].setContentAreaFilled(false);
    buttons[7].setBorder(null);
    buttons[7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("7");
        
        if(buttonGedrueckt==0) {
          verschiebenNach[spielFeldP2[6]]= true;
                    
        }
        
        if(buttonGedrueckt==1) {
          for(int j=0;j<25;j++) {
            if(verschiebenNach[j]==true) {
              spielsteineP2[j].setBounds(370,148,50,50);
              verschiebenNach[j]=false;
              spielFeldP2[6]=j;
              
              
            }
          }
          buttonGedrueckt=-1;
        }
        buttonGedrueckt++;
        System.out.println(buttonGedrueckt);

        
        
        
        
        
        
      }
    });
    
    
    
    
    buttons[8].setBounds(460, 148, 39, 23);
    getContentPane().add(buttons[8]);
    buttons[8].setContentAreaFilled(false);
    buttons[8].setBorder(null);
    buttons[8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("8");
        
        if(buttonGedrueckt==0) {
          verschiebenNach[spielFeldP2[7]]= true;
                    
        }
        
        if(buttonGedrueckt==1) {
          for(int j=0;j<25;j++) {
            if(verschiebenNach[j]==true) {
              spielsteineP2[j].setBounds(460,148,50,50);
              verschiebenNach[j]=false;
              spielFeldP2[7]=j;
              
              
            }
          }
          buttonGedrueckt=-1;
        }
        buttonGedrueckt++;
        System.out.println(buttonGedrueckt);

        
        
        
        
        
        
      }
    });
    
    
    
    
    JLabel lblNewLabel = new JLabel(spielBrett);
    lblNewLabel.setBounds(0, 0, 584, 561);
    getContentPane().add(lblNewLabel);
    repaint();
    
    for(int j=0;j<8;j++) {
      System.out.println(spielFeldP2[j]+"  2");
      if(spielFeldP1[j]>0) {
        buttons[spielFeldP1[j]].setEnabled(true);
      }
    }
    
  }
  
  }
  
  public void getWerIstDran(int werDranIst) {
    werIstDran=werDranIst;
    
    
    
  }
  
  public void setModusNummer(int modiNr) {
    modusNummer=modiNr;
    
  }
      
    }
