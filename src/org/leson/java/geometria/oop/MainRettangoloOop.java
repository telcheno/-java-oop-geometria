package org.leson.java.geometria.oop;

import java.util.Scanner;

public class MainRettangoloOop {

	public static void main(String[] args) {
		System.out.println("Ciao Figura Oop");
		
		//istanzio le classi per recuperare i dati e disegno per il rettangolo
		MisureFigura rettangolo = new MisureFigura();
		DisegnoFigura disegno = new DisegnoFigura();
		
		//
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la base della figura");
		
		rettangolo.base = input.nextInt();
		System.out.println(rettangolo.base);
		
		System.out.println("Inserisci la altezza della figura");
		rettangolo.altezza = input.nextInt();
		System.out.println(rettangolo.altezza);
		
		rettangolo.calcoloArea();
		System.out.println(rettangolo.calcoloArea());
		rettangolo.calcoloPerimetro();
		System.out.println(rettangolo.calcoloPerimetro());
		
		disegno.disegno(rettangolo.base, rettangolo.altezza);
	}

}
