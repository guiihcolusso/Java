package me.guiihpcolusso;

import java.util.Scanner;

public class Atividade20 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a Hora que o Jogo Começo");
		int comeco = scn.nextInt();
		System.out.println("Digite a Hora que o Jogo Acabaou");
		int fim = scn.nextInt();
		
		
		int horas = fim - comeco;
		
		System.out.println("o Jogo Teve " + horas + " Horas" + " de Duração");
		
		scn.close();
	}

}
