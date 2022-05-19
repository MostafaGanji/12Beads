
import java.util.*;

public class Spielleitung {

static int aktiverSpieler;
Steuerung steuerung= new Steuerung();
  

public Spielleitung() {
  WerIstDran();
  
  
  }
  

public static int random() {

  Random wuerfel = new Random();
  int werFaengtan = 1;

    werFaengtan = wuerfel.nextInt(2);
  
  return werFaengtan;
  }


public static void Spieler() {

  switch(aktiverSpieler) {
  case 0: 
    aktiverSpieler = 1;
    break;
  
  case 1: 
    aktiverSpieler = 0;
    break;
    }
  }

public void WerIstDran() {
  
  aktiverSpieler = random();

    switch (aktiverSpieler) {
      case 1 :
        System.out.println("Spieler 1 ist dran");
        // Button 0-12 enabln
        break;
        
      case 0 :
        System.out.println("Spieler 2 ist dran");
        // Button 13-24 enabln
        break;
      }
    System.out.println("Aktiver Spieler"+aktiverSpieler);
    //steuerung.getWerDranIst(aktiverSpieler);
}


/*public static boolean Gewinnabfrage() {
  
  boolean keinerHatGewonnen = true;
  if (aktiverSpieler == 0 & Spielbrett.SpielerVon1 == 0 ) {
    
    System.out.println("Spieler 2 hat gewonnen");
    keinerHatGewonnen = false;
    
  }else {
    if (aktiverSpieler == 1 & Spielbrett.SpielerVon2 == 0) {
      
      System.out.println("Spieler 2 hat gewonnen");
      keinerHatGewonnen = false;
      
    }
  }
  
  return keinerHatGewonnen;
  
}*/

}
