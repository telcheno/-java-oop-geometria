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
	

}
