import java.util.*;

public class Spielbrett {
  
  static GUI dieGUI;
  static int[] button;
  static int SpielerVon1;
  static int SpielerVon2;
  private static int[] enabln;
  
  
  public Spielbrett() {
    
    dieGUI = new GUI();
    button = new int[25];
    for (int i = 0;i<12;i++) {
      button[i] = i+1;
    }
  
    button[12] = 0; // Zahl im Array = Zahl der Spielfigur von 1-24 Bsp.: Button [0] = Figur 1
  
    for ( int i = 13; i<25;i++) {
      button[i] = i;
      }
    SpielerVon1 = 12;
    SpielerVon2 = 12;
  }
  
  
  public static void spielerEins() {
    
    enabln = new int[SpielerVon1];
    
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
    
  }
  
  
  public static void spielerZwei() {
    
    enabln = new int[SpielerVon2];
    
    for(int i = 0; i<enabln.length;i++) {
      enabln[i] = -1;
    }

    int k = 0;
    for  (int i=0; i<button.length;i++) {
  
      if (button[i]<= 24 & button[i]>=13) {
        enabln[k]= i;
        System.out.println(enabln[k]);
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
  
  
  public static void SprungSpieler1() {
    int gedrueckt = 0; // Button wird gedrueckt 
    button[1] = 17;
    int a;
    int b;
    switch (gedrueckt) {
    
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
          if (button[22] == 0) {
            dieGUI.buttons[22].setEnabled(true);
          }
          break;
        case 22:
          if (button[23] == 0) {
            dieGUI.buttons[23].setEnabled(true);
          }
          if (button[21] == 0) {
            dieGUI.buttons[21].setEnabled(true);
          }
          for (int i = 16;i<=18;i++) {
              if (button[i] == 0) {
              dieGUI.buttons[i].setEnabled(true);
              }
          }
          break;
        case 23:
          if (button[22] == 0) {
            dieGUI.buttons[22].setEnabled(true);
          }
          if (button[18] == 0) {
            dieGUI.buttons[18].setEnabled(true);
          }
          if (button[24] == 0) {
            dieGUI.buttons[24].setEnabled(true);
          }
          break;
        case 24:
          if (button[19] == 0) {
            dieGUI.buttons[19].setEnabled(true);
          }
          if (button[18] == 0) {
            dieGUI.buttons[18].setEnabled(true);
          }
          if (button[23] == 0) {
            dieGUI.buttons[23].setEnabled(true);
          }
    }
    
    
    
  }
}
