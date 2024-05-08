package org.leson.java.geometria.oop;

//creo la classe con le variabili protected
public class MisureFigura {
	protected int base;
	protected int altezza;
	protected int area;
	protected int perimetro;
	
	//creo il metodo calcolo area incapsuloando i parametri per poterli valorizzare
	protected int getCalcoloArea(int base, int altezza) {
		this.area = this.base * this.altezza;
		return this.area;
	}
	
	//creo il metodo calcolo perimetro incapsuloando i parametri per poterli valorizzare
	protected int getPalcoloPerimetro(int base, int altezza) {
		this.perimetro = (this.base + this.altezza) * 2;
		return this.perimetro;
	}
}
