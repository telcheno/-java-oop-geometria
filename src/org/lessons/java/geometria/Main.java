package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		System.out.println("Ciao Geometria");
		
		//richiamo class Rettangolo per costruire il rettangolo
		//si richima al classe con il nome della variabile datta
		Rettangolo rettangolo = new Rettangolo();
		
		//importo il metodo scanner
		Scanner input = new Scanner(System.in);
		
		//chiedo al utente la misura della base
		System.out.println("Inserisci la misura della base del rettangolo");
		
		//assegno il valore delinpit alla variabile del oggeto "retangolo.base"
		rettangolo.base = input.nextInt();
//		System.out.println(rettangolo.base);
		
		//chiedo al utente la misura dell'altezza
		System.out.println("Inserisci la misura dell'altezza  del rettangolo");
		
		//assegno il valore delinpit alla variabile del oggeto "retangolo.altezza"
		rettangolo.altezza = input.nextInt();
//		System.out.println(rettangolo.altezza);
		
		//variabili principali
		int area;
		int perimetro;
		String disegno;
		
		//invoco il metodo della classe Rettangolo per i calcoli e assegno alla variabile corrispondente
		area = rettangolo.calcoloArea();
		System.out.println("L'area del rettangolo è: " + area  + "\n");
		
		//invoco il metodo della classe Rettangolo per i calcoli e assegno alla variabile corrispondente
		perimetro = rettangolo.calcoloPerimetro();
		System.out.println("Il perimetro del rettangolo è: " + perimetro + "\n");
		
		//invoco il metodo che disegna il rettangolo
		rettangolo.disegnoRettangolo();
	}
		
}
		

