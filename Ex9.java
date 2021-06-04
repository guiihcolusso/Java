package pt.guiihpcolusso.exercicios;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		double alt,base;
		
		
		System.out.print("Informe a medida da altura do paralelogramo (cm): ");
		alt = scn.nextInt();
		
		System.out.print("Informe a a medida da base do paralelogramo (cm): ");
		base = scn.nextInt();
		
		
		System.out.println("A área deste paralelogramo é de " + base * alt);
		
		scn.close();
	}

}
