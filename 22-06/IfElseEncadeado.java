package me.guiihpcolusso;

public class IfElseEncadeado {
	
	public static void main(String[] args) {
		
		int valor = 12;
		
		if (valor < 10) {
			System.out.println("Valor Menor que 10");
		}else if (valor > 10 && valor < 20) {
			System.out.println("Valor está entre 11 e 20");			
		}else if (valor > 20 && valor < 30) {
			System.out.println("Valor está entre 21 e 30");
		}else {
			System.out.println("Valor Maior que 30");
		}
		
	}

}
