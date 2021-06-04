package pt.guiihpcolusso.exercicios;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
			
			Scanner scn = new Scanner(System.in);
			
			double alt,base;
			
			System.out.print("Informe a medida da altura do triângulo (cm): ");
			alt = scn.nextInt();
			
			System.out.print("Informe a medida da base do triângulo (cm): ");
			base = scn.nextInt();
			
			scn.close();			
			
			System.out.println("A área deste triângulo é de " + base * alt/2);
		
	}

}
