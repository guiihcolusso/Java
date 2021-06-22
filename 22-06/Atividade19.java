package me.guiihpcolusso;

import java.util.Scanner;

public class Atividade19 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Valor : ");
		float valor1 = scn.nextFloat();
		
		System.out.println("Digite o Segundo Valor : ");
		float valor2 = scn.nextFloat();
		
		scn.close();
		
		
		if (valor1 > valor2) {
			System.out.println("o Primeiro Valor : " + valor1 + " é o maior");
		}else if (valor2 > valor1) {
			System.out.println("o Segundo Valor : " + valor2 + " é o maior");
		}
		
	}

}
