package com.br.ola.mundo;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		/* tipos primitivos
		
		int elementoX = 10;
		double numeroDouble = 1.6;
		float numeroFlutuante = 1.6f;		
		
		 wrappers
		
		String texto = "ola mundo";
		*/
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("maxima");
		
		int quantidadeMaxima = entrada.nextInt();
		
		System.out.println("minima");
		int quantidadeMinima = entrada.nextInt();
		int media;
		
		System.out.println("divisor");
		media = (quantidadeMaxima + quantidadeMinima)/entrada.nextInt();
		
		System.out.println(media);
		
		
	}
}
