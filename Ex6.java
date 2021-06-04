package pt.guiihpcolusso.exercicios;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		int a;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um Valor : ");
		a = scn.nextInt();
		
		scn.close();
		
		System.out.println("O Valor Sucessor  É : " + ++a);
		
		
	}

}
