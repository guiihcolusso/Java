package pt.guiihpcolusso.exercicios;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		int a;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um Valor : ");
		a = scn.nextInt();
		
		scn.close();
		
		System.out.println("O Valor Antecessor É : " + (a-1));
		
		
	}

}
