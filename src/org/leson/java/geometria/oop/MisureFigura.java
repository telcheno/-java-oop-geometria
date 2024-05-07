package org.leson.java.geometria.oop;

public class MisureFigura {
	public int base;
	public int altezza;
	
	public int calcoloArea() {
		int  area = base * altezza;
		return area;
	}
	
	public int calcoloPerimetro() {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}
}
