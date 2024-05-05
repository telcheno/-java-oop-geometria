package org.leson.java.geometria.oop;

import java.util.Scanner;

public class DatiRettangolo {
	int base;
	int altezza;
	
	int calcoloArea() {
		int area = base * altezza;
		return area;
	}
	
	int calcoloPerimetro() {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}
}
