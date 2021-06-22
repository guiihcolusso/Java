package me.guiihpcolusso;

import java.util.Scanner;

public class Imc {
	
public static void main(String[] args) {
		
	
		java.util.Scanner scn = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------");
		System.out.println("Olá, Bem vindo ao Calculador de IMC");
		System.out.println("Vou Precisar de Algumas Informacoes Ok?");
		System.out.println("Entao Vamos lá :)");
		System.out.println("--------------------------------------------------");
		
		System.out.print("Digite Seu Peso : ");
		float peso = scn.nextFloat();
		
		System.out.print("Digite Sua Altura : ");
		float altura = scn.nextFloat();
		
		scn.close();
		
		float imc = altura * altura;
		float imc2 = peso / imc;
		
		for (float limpaconsole = 0; limpaconsole < 50; ++limpaconsole) {
			System.out.println();
		}		
			
			System.out.println("--------------------------------------------------");
			System.out.println("Altura Informada : " + altura);
			System.out.println("Peso Inform90ado : " + peso);
			System.out.println("IMC : " + imc2);
			System.out.println("--------------------------------------------------");
			
			System.out.println("IMC                 CLASSIFICAÇÃO      OBESIDADE (GRAU) ");
			System.out.println("MENOR QUE 18,5      MAGREZA            0");
			System.out.println("ENTRE 18,5 E 24,9   NORMAL             0");
			System.out.println("ENTRE 25,0 E 29,9   SOBREPESO          I");
			System.out.println("ENTRE 30,0 E 39,9   OBESIDADE          II");
			System.out.println("MAIOR QUE 40,0      OBESIDADE_GRAVE    III");
			System.out.println("--------------------------------------------------");
			

	}
}

