import java.util.*;
import javax.swing.*;


public class Spielbrett extends JFrame {
	static int gedrueckt1;
	static int gedrueckt2;
	static GUI dieGUI;
	static int[] button;
  	static int spielerVon1;
  	static int spielerVon2;
  	private static int[] enabln;
  	static boolean nichtWechseln;
  	
  
  
  public Spielbrett(GUI pGUI) {
	  dieGUI=pGUI;
    
    button = new int[25];
    for (int i = 0;i<12;i++) {
      button[i] = i+1;
    }
  
    button[12] = 0; // Zahl im Array = Zahl der Spielfigur von 1-24 Bsp.: Button [0] = Figur 1
  
    for ( int i = 13; i<25;i++) {
    	
      button[i] = i;
      }
    spielerVon1 = 12;
    spielerVon2 = 12;
  }
  
  
  public static void spielerEins() {
	  System.out.println("In spieler EINS");
    
    enabln = new int[spielerVon1];
    
    for(int i = 0; i<enabln.length;i++) {
      enabln[i] = -1;
    }
   
    int k = 0;
    for  (int i=0; i<button.length;i++) {
  
      if (button[i]>= 1 & button[i]<=12) {
        enabln[k]= i;
        k++;
      }
    }
    Buttons();
    
    
    int loeschen = ArtDesSprungs();
    if (loeschen == -1) {
    	System.out.println("Keine Figur wird geloescht!");
    }else {
    	SpielerLoeschen(loeschen);
    }
  }
  
  
  public static void spielerZwei() {
	  System.out.println("In spieler ZWEI");
    
    enabln = new int[spielerVon2];
    
    for(int i = 0; i<enabln.length;i++) {
      enabln[i] = -1;
    }

    int k = 0;
    for  (int i=0; i<button.length;i++) {
  
      if (button[i]<= 24 & button[i]>=13) {
        enabln[k]= i;
        k++;
      }
    }
    Buttons();
  }
  
  
  private static void Buttons() {
  
    for (int i= 0;i<enabln.length;i++) {
    dieGUI.buttons[enabln[i]].setEnabled(true);
    }
  }
  
  public void getGedrueckt1(int zahl) {
	  gedrueckt1=zahl;
	  
  }
  
  
  
  public static void SprungSpieler1() {
	  System.out.println("Spielbrett erster SPieler turn");
    button[1] = 17;
    int a;
    int b;
    switch (gedrueckt1) {
    
      	case 0:
      		a = 1;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			if(button[a] >= 13 & button[2]== 0) {
      				dieGUI.buttons[a].setEnabled(true); 
      			}
      		}
      		a = 5;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 10;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 6;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 12;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 1:
      		if (button[0] == 0) {
      			dieGUI.buttons[0].setEnabled(true); 
      		}
      		a = 2;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 3;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 6;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 11;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 2:
      		a = 1;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 0;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 3;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 4;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		b = 8;
      		for(a = 6;a<=8;a++) {
      			b = b+2;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 

      		}else {

      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      				}
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 3:
      		a = 2;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 1;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		if (button[4] == 0) {
      			dieGUI.buttons[4].setEnabled(true);
      		}
      		a = 8;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 13;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 4:
      		a = 3;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 2;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 8;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 12;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 9;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 14;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 5:
      		if (button[0] == 0) {
      			dieGUI.buttons[0].setEnabled(true);
      		}
      		a = 6;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 7;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 10;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 15;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 6:
      		for(a = 0;a<=a+2;a++) {
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      			}
      		}
      		if (button[5] == 0) {
      			dieGUI.buttons[5].setEnabled(true);
      		}
      		a = 7;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 8;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		b = 12;
      		for(a = 10;a<=a+2;a++) {
      			b = b+2;
      			if (button[a] == 0) {
      				dieGUI.buttons[a].setEnabled(true);
      			
      			}else {
      				if(button[a] >= 13 & button[b]== 0 & a != 10) {
      				dieGUI.buttons[b].setEnabled(true); 
      				}
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 7:
      		if (button[2] == 0) {
      			dieGUI.buttons[2].setEnabled(true);
      		}
      		a = 12;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 16;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 6;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 5;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 8;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 9;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 8:
      		a = 7;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 6;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		if (button[9] == 0) {
      			dieGUI.buttons[9].setEnabled(true);
      		}
      		b = 14;
      		for(a = 12;a<=a+2;a++) {
      			b = b+2;
      			if (button[a] == 0) {
      				dieGUI.buttons[a].setEnabled(true);
      			
      			}else {
      				if(button[a] >= 13 & button[b]== 0 & a != 14) {
      				dieGUI.buttons[b].setEnabled(true); 
      				}
      			}
      		}
      		for (int i = 2;i<=4;i++) {
          		if (button[i] == 0) {
          		dieGUI.buttons[i].setEnabled(true);
          		}
      		}
      		dieGUI.turn1player();
      		break;
      	case 9:
      		if (button[4] == 0) {
      			dieGUI.buttons[4].setEnabled(true);
      		}
      		a = 8;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 7;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 14;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 19;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 10:
      		a = 5;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 0;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 6;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 2;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 11;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 12;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 16;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 22;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 15;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 20;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 11:
      		a = 6;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 1;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 12;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 13;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 16;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 21;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		if (button[10] == 0) {
      			dieGUI.buttons[10].setEnabled(true);
      		}
      		dieGUI.turn1player();
      		break;
      	case 12:
      		a = 11;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 10;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 13;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 14;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		b = -2;
      		for(a = 6;a<=a+2;a++) {
      			b = b+2;
      			if (button[a] == 0) {
      				dieGUI.buttons[a].setEnabled(true);
      			
      			}else {
      				if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      				}
      			}
      		}
      		b = 18;
      		for(a = 16;a<=a+2;a++) {
      			b = b+2;
      			if (button[a] == 0) {
      				dieGUI.buttons[a].setEnabled(true);
      			
      			}else {
      				if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      				}
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 13:
      		a = 8;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 3;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 12;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 11;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		if (button[14] == 0) {
      			dieGUI.buttons[14].setEnabled(true);
      		}
      		a = 18;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 23;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 14:
      		a = 9;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 4;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 13;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 12;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 8;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 2;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 18;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 22;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 19;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 24;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 15:
      		a = 10;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 14;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 16;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 17;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		if (button[20] == 0) {
      			dieGUI.buttons[20].setEnabled(true);
      		}
      		dieGUI.turn1player();
      		break;
      	case 16:
    		if (button[15] == 0) {
      			dieGUI.buttons[11].setEnabled(true);
      		}
      		a = 17;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 18;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		b = 4;
      		for(a = 10;a<=a+2;a++) {
      			b = b+2;
      			if (button[a] == 0) {
      				dieGUI.buttons[a].setEnabled(true);
      			
      			}else {
      				if(button[a] >= 13 & button[b]== 0 & a != 10) {
      				dieGUI.buttons[b].setEnabled(true); 
      				}
      			}
      		}
      		for (int i = 20;i<=22;i++) {
          		if (button[i] == 0) {
          		dieGUI.buttons[i].setEnabled(true);
          		}
      		}
      		dieGUI.turn1player();
      		break;
      	case 17:
      		a = 12;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 7;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 16;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 15;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		if (button[22] == 0) {
      			dieGUI.buttons[22].setEnabled(true);
      		}
      		a = 18;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 19;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 18:
    		if (button[19] == 0) {
      			dieGUI.buttons[19].setEnabled(true);
      		}
      		a = 17;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 16;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		b = 4;
      		for(a = 12;a<=a+2;a++) {
      			b = b+2;
      			if (button[a] == 0) {
      				dieGUI.buttons[a].setEnabled(true);
      			
      			}else {
      				if(button[a] >= 13 & button[b]== 0 & a != 14) {
      				dieGUI.buttons[b].setEnabled(true); 
      				}
      			}
      		}
      		for (int i = 22;i<=24;i++) {
          		if (button[i] == 0) {
          		dieGUI.buttons[i].setEnabled(true);
          		}
      		}
      		dieGUI.turn1player();
      		break;
      	case 19:
      		a = 14;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 9;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 18;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 17;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		if (button[24] == 0) {
      			dieGUI.buttons[24].setEnabled(true);
      		}
      		dieGUI.turn1player();
      		break;	
      	case 20:
      		a = 15;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 10;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 16;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 12;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 21;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 22;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 21:
      		if (button[20] == 0) {
      			dieGUI.buttons[20].setEnabled(true);
      		}
      		a = 16;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 11;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 22;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 23;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 22:
      		a = 21;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 20;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 23;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 24;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		b = 8;
      		for(a = 16;a<=a+2;a++) {
      			b = b+2;
      			if (button[a] == 0) {
      				dieGUI.buttons[a].setEnabled(true);
      			
      			}else {
      				if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      				}
      			}
      		}
      		dieGUI.turn1player();
      		break;
      	case 23:
      		a = 22;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 21;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 18;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 13;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		if (button[24] == 0) {
      			dieGUI.buttons[24].setEnabled(true);
      		}
      		dieGUI.turn1player();
      		break;
      	case 24:
      		a = 23;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 22;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 18;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 12;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      		}
      		a = 19;
      		if (button[a] == 0) {
      			dieGUI.buttons[a].setEnabled(true); 
      		}else {
      			b = 14;
      			if(button[a] >= 13 & button[b]== 0) {
      				dieGUI.buttons[b].setEnabled(true); 
      			}
      			
      		}
      		dieGUI.turn1player();
    }
    
    
    
  }
  
  public static void SprungSpieler2() {
	  System.out.println("Spielbrett zweiter SPieler turn");

	    button[1] = 17;
	    int a;
	    int b;
	    switch (gedrueckt1) {
	    
	      	case 0:
	      		a = 1;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			if(button[a] <= 13 & button[2]== 0) {
	      				dieGUI.buttons[a].setEnabled(true); 
	      			}
	      		}
	      		a = 5;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 10;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 6;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 12;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 1:
	      		if (button[0] == 0) {
	      			dieGUI.buttons[0].setEnabled(true); 
	      		}
	      		a = 2;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 3;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 6;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 11;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 2:
	      		a = 1;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 0;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 3;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 4;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		b = 8;
	      		for(a = 6;a<=8;a++) {
	      			b = b+2;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 

	      		}else {

	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      				}
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 3:
	      		a = 2;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 1;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		if (button[4] == 0) {
	      			dieGUI.buttons[4].setEnabled(true);
	      		}
	      		a = 8;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 13;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 4:
	      		a = 3;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 2;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 8;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 12;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 9;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 14;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 5:
	      		if (button[0] == 0) {
	      			dieGUI.buttons[0].setEnabled(true);
	      		}
	      		a = 6;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 7;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 10;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 15;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 6:
	      		for(a = 0;a<=a+2;a++) {
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      			}
	      		}
	      		if (button[5] == 0) {
	      			dieGUI.buttons[5].setEnabled(true);
	      		}
	      		a = 7;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 8;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		b = 12;
	      		for(a = 10;a<=a+2;a++) {
	      			b = b+2;
	      			if (button[a] == 0) {
	      				dieGUI.buttons[a].setEnabled(true);
	      			
	      			}else {
	      				if(button[a] <= 13 & button[b]== 0 & a != 10) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      				}
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 7:
	      		if (button[2] == 0) {
	      			dieGUI.buttons[2].setEnabled(true);
	      		}
	      		a = 12;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 16;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 6;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 5;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 8;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 9;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 8:
	      		a = 7;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 6;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		if (button[9] == 0) {
	      			dieGUI.buttons[9].setEnabled(true);
	      		}
	      		b = 14;
	      		for(a = 12;a<=a+2;a++) {
	      			b = b+2;
	      			if (button[a] == 0) {
	      				dieGUI.buttons[a].setEnabled(true);
	      			
	      			}else {
	      				if(button[a] <= 13 & button[b]== 0 & a != 14) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      				}
	      			}
	      		}
	      		for (int i = 2;i<=4;i++) {
	          		if (button[i] == 0) {
	          		dieGUI.buttons[i].setEnabled(true);
	          		}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 9:
	      		if (button[4] == 0) {
	      			dieGUI.buttons[4].setEnabled(true);
	      		}
	      		a = 8;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 7;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 14;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 19;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 10:
	      		a = 5;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 0;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 6;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 2;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 11;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 12;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 16;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 22;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 15;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 20;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 11:
	      		a = 6;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 1;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 12;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 13;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 16;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 21;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		if (button[10] == 0) {
	      			dieGUI.buttons[10].setEnabled(true);
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 12:
	      		a = 11;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 10;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 13;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 14;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		b = -2;
	      		for(a = 6;a<=a+2;a++) {
	      			b = b+2;
	      			if (button[a] == 0) {
	      				dieGUI.buttons[a].setEnabled(true);
	      			
	      			}else {
	      				if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      				}
	      			}
	      		}
	      		b = 18;
	      		for(a = 16;a<=a+2;a++) {
	      			b = b+2;
	      			if (button[a] == 0) {
	      				dieGUI.buttons[a].setEnabled(true);
	      			
	      			}else {
	      				if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      				}
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 13:
	      		
	      		
	      		a = 8;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 3;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 12;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 11;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		if (button[14] == 0) {
	      			dieGUI.buttons[14].setEnabled(true);
	      		}
	      		a = 18;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 23;
	      			if(button[a]<= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 14:
	      		a = 9;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 4;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 13;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 12;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 8;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 2;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 18;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 22;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 19;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 24;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 15:
	      		a = 10;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 14;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 16;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 17;
	      			if(button[a]<= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		if (button[20] == 0) {
	      			dieGUI.buttons[20].setEnabled(true);
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 16:
	    		if (button[15] == 0) {
	      			dieGUI.buttons[11].setEnabled(true);
	      		}
	      		a = 17;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 18;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		b = 4;
	      		for(a = 10;a<=a+2;a++) {
	      			b = b+2;
	      			if (button[a] == 0) {
	      				dieGUI.buttons[a].setEnabled(true);
	      			
	      			}else {
	      				if(button[a] <= 13 & button[b]== 0 & a != 10) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      				}
	      			}
	      		}
	      		for (int i = 20;i<=22;i++) {
	          		if (button[i] == 0) {
	          		dieGUI.buttons[i].setEnabled(true);
	          		}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 17:
	      		a = 12;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 7;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 16;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 15;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		if (button[22] == 0) {
	      			dieGUI.buttons[22].setEnabled(true);
	      		}
	      		a = 18;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 19;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 18:
	    		if (button[19] == 0) {
	      			dieGUI.buttons[19].setEnabled(true);
	      		}
	      		a = 17;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 16;
	      			if(button[a]<= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		b = 4;
	      		for(a = 12;a<=a+2;a++) {
	      			b = b+2;
	      			if (button[a] == 0) {
	      				dieGUI.buttons[a].setEnabled(true);
	      			
	      			}else {
	      				if(button[a] <= 13 & button[b]== 0 & a != 14) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      				}
	      			}
	      		}
	      		for (int i = 22;i<=24;i++) {
	          		if (button[i] == 0) {
	          		dieGUI.buttons[i].setEnabled(true);
	          		}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 19:
	      		a = 14;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 9;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 18;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 17;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		if (button[24] == 0) {
	      			dieGUI.buttons[24].setEnabled(true);
	      		}
	      		dieGUI.turn2player();
	      		break;	
	      	case 20:
	      		a = 15;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 10;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 16;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 12;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 21;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 22;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 21:
	      		if (button[20] == 0) {
	      			dieGUI.buttons[20].setEnabled(true);
	      		}
	      		a = 16;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 11;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 22;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 23;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 22:
	      		a = 21;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 20;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 23;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 24;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		b = 8;
	      		for(a = 16;a<=a+2;a++) {
	      			b = b+2;
	      			if (button[a] == 0) {
	      				dieGUI.buttons[a].setEnabled(true);
	      			
	      			}else {
	      				if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      				}
	      			}
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 23:
	      		a = 22;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 21;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 18;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 13;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		if (button[24] == 0) {
	      			dieGUI.buttons[24].setEnabled(true);
	      		}
	      		dieGUI.turn2player();
	      		break;
	      	case 24:
	      		a = 23;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 22;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 18;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 12;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		a = 19;
	      		if (button[a] == 0) {
	      			dieGUI.buttons[a].setEnabled(true); 
	      		}else {
	      			b = 14;
	      			if(button[a] <= 13 & button[b]== 0) {
	      				dieGUI.buttons[b].setEnabled(true); 
	      			}
	      		}
	      		dieGUI.turn2player();
	    	}
	    
	  }
  
  
  public static int ArtDesSprungs() {
	  
	  int a = -1;
	  	switch(gedrueckt1) {
	  	
	  		case 0:
	  			
	  			if (gedrueckt2 == 10) {
	  				a = 5;
	  				button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 2) {
	  				a = 1;
		  			button[a] = 0;
	  			}
		  			
	  			if (gedrueckt2 == 12) {
	  					a = 6;
	  					button[a] = 0;
	  			}
	  			break;		
	  				
	  		case 1:
	  			
	  			if (gedrueckt2 == 11) {
	  				a = 6;
	  				button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 2) {
	  				a = 1;
		  			button[a] = 0;
	  			}
	  			break;
	  			
	  		case 2:
	  			
	  			if (gedrueckt2 == 0) {
	  				a = 1;
	  				button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 4) {
	  				a = 3;
		  			button[a] = 0;
	  			}
		  			
	  			if (gedrueckt2 == 12) {
	  					a = 7;
	  					button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 10) {
  					a = 6;
  					button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 14) {
  					a = 8;
  					button[a] = 0;
	  			}
	  			break;	
	  		case 4:
	  			
	  			if (gedrueckt2 == 14) {
	  				a = 9;
	  				button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 2) {
	  				a = 3;
		  			button[a] = 0;
	  			}
	  			break;
	  			
	  		case 5:
	  			
	  			if (gedrueckt2 == 15) {
	  				a = 10;
		  			button[a] = 0;
	  			}
		  			
	  			if (gedrueckt2 == 7) {
	  					a = 6;
	  					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 6:
	  			
	  			if (gedrueckt2 == 8) {
	  				a = 7;
	  				button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 18) {
	  				a = 12;
		  			button[a] = 0;
	  			}
		  			
	  			if (gedrueckt2 == 11) {
	  					a = 16;
	  					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 7:
	  			
	  			if (gedrueckt2 == 5) {
	  				a = 6;
	  				button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 9) {
	  				a = 8;
		  			button[a] = 0;
	  			}
		  			
	  			if (gedrueckt2 == 17) {
	  					a = 12;
	  					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 8:
	  			
	  			if (gedrueckt2 == 16) {
	  				a = 12;
	  				button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 18) {
	  				a = 13;
		  			button[a] = 0;
	  			}
		  			
	  			if (gedrueckt2 == 6) {
	  					a = 7;
	  					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 9:
	  			
	  			if (gedrueckt2 == 7) {
	  				a = 8;
		  			button[a] = 0;
	  			}
		  			
	  			if (gedrueckt2 == 19) {
	  					a = 14;
	  					button[a] = 0;
	  			}
	  			break;
	  		
	  		case 10:
	  			
	  			if (gedrueckt2 == 0) {
	  				a = 5;
	  				button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 2) {
	  				a = 6;
		  			button[a] = 0;
	  			}
		  			
	  			if (gedrueckt2 == 12) {
	  					a = 11;
	  					button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 20) {
  					a = 15;
  					button[a] = 0;
	  			}
	  			
	  			if (gedrueckt2 == 22) {
  					a = 16;
  					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 11:
	  			
	  			if (gedrueckt2 == 1) {
  					a = 6;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 13) {
					a = 12;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 21) {
					a = 16;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 12:
	  			
	  			if (gedrueckt2 == 0) {
  					a = 6;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 2) {
					a = 7;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 4) {
					a = 8;
					button[a] = 0;
	  			}
	  			if (gedrueckt2 == 14) {
  					a = 13;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 24) {
					a = 18;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 22) {
					a = 17;
					button[a] = 0;
	  			}
	  			if (gedrueckt2 == 20) {
  					a = 16;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 10) {
					a = 11;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 13:
	  			
	  			if (gedrueckt2 == 3) {
  					a = 8;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 23) {
					a = 18;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 11) {
					a = 12;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 14:
	  			
	  			if (gedrueckt2 == 4) {
  					a = 9;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 2) {
					a = 8;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 12) {
					a = 13;
					button[a] = 0;
	  			}
	  			if (gedrueckt2 == 22) {
  					a = 18;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 24) {
					a = 19;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 15:	  			
	  			if (gedrueckt2 == 5) {
					a = 10;
					button[a] = 0;
	  			}
			
	  			if (gedrueckt2 == 17) {
	  				a = 16;
	  				button[a] = 0;
	  			}
	  			break;
	  			
	  		case 16:
	  			
	  			if (gedrueckt2 == 8) {
  					a = 12;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 6) {
					a = 11;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 18) {
					a = 17;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 17:
	  			
	  			if (gedrueckt2 == 7) {
  					a = 12;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 19) {
					a = 18;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 15) {
					a = 16;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 18:
	  			
	  			if (gedrueckt2 == 8) {
  					a = 13;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 16) {
					a = 17;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 6) {
					a = 12;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 19:
	  			
	  			if (gedrueckt2 == 17) {
  					a = 18;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 9) {
					a = 14;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 20:
	  			
	  			if (gedrueckt2 == 10) {
  					a = 15;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 12) {
					a = 16;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 22) {
					a = 21;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 21:
	  			
	  			if (gedrueckt2 == 11) {
  					a = 16;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 23) {
					a = 22;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 22:
	  			
	  			if (gedrueckt2 == 12) {
  					a = 17;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 10) {
					a = 16;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 14) {
					a = 18;
					button[a] = 0;
	  			}
	  			if (gedrueckt2 == 20) {
  					a = 21;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 24) {
					a = 23;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 23:
	  			
	  			if (gedrueckt2 == 13) {
  					a = 18;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 21) {
					a = 22;
					button[a] = 0;
	  			}
	  			break;
	  			
	  		case 24:
	  			
	  			if (gedrueckt2 == 22) {
  					a = 23;
  					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 12) {
					a = 18;
					button[a] = 0;
	  			}
  			
	  			if (gedrueckt2 == 14) {
					a = 19;
					button[a] = 0;
	  			}
	  			break;
	  	}	

			SpielerBewegen();
			
			return a;

  }
  
  public static void SpielerBewegen() {
		
	button[gedrueckt2] = button[gedrueckt1];
	button[gedrueckt1] = 0;
	  
  }
  
  public static void SpielerLoeschen(int a) {
	  
		if(button[a] <= 1 & button[a] >= 12) {
				
				spielerVon1 = -1;
			}else {
				spielerVon2 = -1;
		}
  }
}


