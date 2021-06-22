package me.guiihpcolusso;

import java.util.Scanner;

public class RenameDp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um valor : ");
		
		float a = scn.nextFloat();
		
		if (a>10) {
			System.out.println("o Valor é maior que 10");
		} else {
			System.out.println("o Valor é Menor que 10");
		}
		
		
		scn.close();
	}

}
