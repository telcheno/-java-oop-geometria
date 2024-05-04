package org.lessons.java.geometria;

public class Rettangolo {
	
	// creo le variabili (istanzia)
	int base;
	int altezza;
	
	//calcolo del area (metodo)
	int calcoloArea() {
		int area = base * altezza;
		return area;
	}
	
	//calcolo ilperimetro (metodo)
	int calcoloPerimetro() {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}
	
	//creo il metodo che disegna il rettangolo
	public void disegnoRettangolo() {
		
	//uso come nome della variabile y nel for che corrisponde al asse verticale == altezza
	//uso come nome della variabile x nel for che corrisponde al asse orizontale == base
	
		//il for del asse y itera il ciclo per disegnare ogni linea del rettangolo dal alto verso il basso
		for(int y = 0; y <= altezza; y++) {
			
			//il for del asse x itera il cilo che stampa ogni elemento da sinistra verso destra
			for(int x = 0; x <= base; x++) {
				
			//uso un condizionale per stampare gli elementi
				//SE y è == 0 o y == alteza cio è nel asse verticale
				if(y == 0 || y == altezza) {
					
				//stampo il elemento da ogni iterazione in verso orizontale mentre è nella iterazione del asse x
				System.out.print("@");	
					
				//ALTRIMENTI SE y == 0 o y == base 	
				}else if(x == 0 || x == base) {
					
				//stampo il elemnto nella iterazione corrispondente  
				System.out.print("@");
				
				//ALTRIMANTI
				}else {
				
				//stampo il elemento nelle iterazioni che non rientrano nelle condizioni precedenti 
				System.out.print("-");
				
				//SE l'iterazione è == alla base salta la linea e riprende il ciclo
				}if(x == base) {
					System.out.print("\n");					
				}
				
			}
		}
		
		System.out.println("\n La @ rapresenta i valori di base e altezza e il - rapresenta il area del rettangolo");
		
	}
	
	
}
