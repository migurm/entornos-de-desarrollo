package com.entornos.miguel.poligonos.main;

import com.entornos.miguel.poligonos.figuras.Rectangulo;
import com.entornos.miguel.poligonos.figuras.Circulo;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo (5,10);	
		
		Rectangulo r2= new Rectangulo();		
		
		Circulo [] arra = new Circulo [5];
		
		for (int i = 0 ; i < arra.length ; i++) {
			arra[i]=new Circulo();
		}
		
		
	}

}
