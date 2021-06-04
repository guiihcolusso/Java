package pt.guiihpcolusso.exercicios;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		double base,altura;
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Digite a Base: ");
		base = scn.nextDouble();
		System.out.println("Digite a Altura: ");
		altura = scn.nextDouble();
		
		scn.close();
		
		System.out.println("A área deste retângulo é de : " + base*altura + " cm²");
		
	}

}
