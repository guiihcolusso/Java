package me.guiihpcolusso;

import java.util.Scanner;

public class Atividade {
	
	public static void main(String[] args) {
		
		int a=0;
		
		while(a<3) {
			
		a++;
			
		Scanner scn = new Scanner(System.in);
						
		System.out.println("Digite seu nome : ");
		String name = scn.nextLine();
		
		System.out.println("Digite seu Sexo (Masculino ou Feminino)");
		String sexo = scn.nextLine();		
		
		System.out.println("Digite a Primeira Nota : ");
		float n1 = scn.nextFloat();
		
		System.out.println("Digite a Segunda Nota : ");
		float n2 = scn.nextFloat();
		
		System.out.println("Digite a Terceira Nota : ");
		float n3 = scn.nextFloat();
		
		System.out.println("Digite a Quarta Nota : ");
		float n4 = scn.nextFloat();
		
		scn.close();
		
		float total = n1+n2+n3+n4;
		float media = total / 4;
		
		System.out.println("Nome : " + name + "Sexo : " + sexo + "A Media é " + media + "o Total é " + total);
		
		}
		
	
		
	}

}
