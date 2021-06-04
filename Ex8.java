package pt.guiihpcolusso.exercicios;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		final double pi=3.14159;
		double raio;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Infome a medida do raio do círculo : ");
		raio = scn.nextDouble();
		
		
		System.out.print("A área do cículo é de : ");
		System.out.print(pi * raio * raio);
		
		
		scn.close();
		
	}

}
