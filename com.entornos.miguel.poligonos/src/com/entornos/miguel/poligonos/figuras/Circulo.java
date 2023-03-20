package com.entornos.miguel.poligonos.figuras;

/*
 * Representa un circulo. Contiene constructures para crear un circulo
 * dado el radio y para crear un circulo con un radio aleatorio entero entre
 * 1 y 10. Contiene metodos para calcular el area y el perimetro.
 * 
 */

import java.util.Random;
public class Circulo {
	
	double radio;
	
	
	/**
	 * Constructor para el caso de que sepamos el radio, que entre por parametro
	 * 
	 * 
	 */
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	/**
	 * 
	 * Constructor para el caso de radio aleatorio.
	 * @see java.util.Random
	 */
	public Circulo() {
		Random numeroAleatorio = new Random();
		this.radio=numeroAleatorio.nextInt(10)+1;
	}
	/**
	 * 
	 * Método para calcular el area
	 * 
	 * @return el area del circulo
	 */
	public double getArea() {
		return Math.PI*(Math.pow(radio, 2));
	}
	/**
	 * 
	 * Metodo para calcular el perimetro
	 * @return el perimetro del circulo
	 */
	public double getPerimetro() {
		return 2*Math.PI*radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	

}
