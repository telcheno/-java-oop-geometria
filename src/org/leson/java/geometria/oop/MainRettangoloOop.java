package org.leson.java.geometria.oop;

import java.util.Scanner;

public class MainRettangoloOop {

	public static void main(String[] args) {
		System.out.println("Ciao Figura Oop");
		
		//istanzio le classi per recuperare i dati e disegno per il rettangolo
		MisureFigura rettangolo = new MisureFigura();
		DisegnoFigura disegno = new DisegnoFigura();
		
		//importo il metodo secanner per interagire col utente
		Scanner input = new Scanner(System.in);
		
		//chiedo al utente la base della figura
		System.out.println("Inserisci la base della figura");
		rettangolo.base = input.nextInt();
		
		//stampo la base scelta  utente
		System.out.println("La tua base sarà \n " + rettangolo.base);
		
		//chiedo al utente l'altezza della figura
		System.out.println("Inserisci la altezza della figura");
		rettangolo.altezza = input.nextInt();
		
		//stampo la altezza scelta  utente
		System.out.println("La tua  altezza sarà \n " + rettangolo.altezza);
		
		//inboco il metodo che calcola l'area della figura
		rettangolo.getCalcoloArea(rettangolo.base, rettangolo.altezza);
		//stampo il risultato del metodo
		System.out.println("L'aria della figura è:  \n" + rettangolo.area)
		;
		//inboco il metodo che calcola il perimetro della figura
		rettangolo.getPalcoloPerimetro(rettangolo.base, rettangolo.altezza);
		//stampo il risultato del metodo
		System.out.println("Il perimetro della figura è: \n" + rettangolo.perimetro);
		
		//stampo la figura con i dati del utente
		System.out.println("Ecco la tua figura ! \n");
		disegno.getDisegno(rettangolo.base, rettangolo.altezza);;
	}

}
