package adsaufgabe1;


// Der Konstruktor der Klasse darf keine formalen Parameter (Argumente) 
// enthalten

public class Inversionszahl_aunger implements IInversionszahl {

    // Konstruktor ohne Argumente bitte belassen
    public Inversionszahl_aunger() {

    }

    public int berechne(String[] feld) {
	// Hier steht Ihre Inversionsort-Implementation, die
	// die Inversionszahl ermittelt
    	int z = 0;
    	for(int i = 1; i < feld.length; i++) {
    		String temp = feld[i];
    		int k = i;
    		while(k >= 1  && StringTest(feld[k-1], temp) > 0) {
    			feld[k] = feld[k-1];
    			z++;
    			k--;
    		}
    		feld[k] = temp;
    	}
    	for(String x: feld) {
			System.out.println(x);
		}

	return z;
    }

    // Ggf. bietet es sich an, Hilfsmethoden zum Vergleich der
    // Strings als private Methode zu implementieren
    
	private int StringTest(String wort1, String wort2) {
		int[] position = new int[2];
		
		if(wort1.indexOf('a') == -1) {
			position[0] = 9999999;
		}
		else {
		position[0] = wort1.indexOf('a');
		}
		
		if(wort2.indexOf('a') == -1) {
			position[1] = 9999999;
		}
		else {
		position[1] = wort2.indexOf('a');
		}
		
		int compare = Integer.compare(position[0], position[1]);
		
		if(compare == 0) {
			if(wort1.lastIndexOf('b') == -1) {
				position[0] = 9999999;
			}
			else {
			position[0] = wort1.length() - wort1.lastIndexOf('b');
			}
			if(wort2.lastIndexOf('b') == -1) {
				position[1] = 9999999;
			}
			else {
			position[1] = wort2.length() - wort2.lastIndexOf('b');
			}
			
			compare = Integer.compare(position[0], position[1]);
		}
		if(compare == 0) {
			compare = Integer.compare(wort1.length(), wort2.length());
		}
		return compare;
	}
}
	
