
import java.util.*;

public class Spielleitung {

static int aktiverSpieler;
Steuerung steuerung;
  

public Spielleitung(Steuerung pSteuerung) {
	steuerung = pSteuerung;
  WerIstDran();
  
  
  }
  

public static int random() {

  Random wuerfel = new Random();
  int werFaengtan = 1;

    werFaengtan = wuerfel.nextInt(2);
  
  return werFaengtan;
  }


public void WerIstDran() {
	
	aktiverSpieler = random();
	  switch (aktiverSpieler) {
	    case 1: System.out.println("Spieler 1 fängt an");
	     
	      break;
	      
	    case 0 : System.out.println("Spieler 2 fängt an");
	      
	      break;
	    }
	  steuerung.getWerDranIst(aktiverSpieler);
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
