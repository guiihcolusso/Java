package me.guiihpcolusso;

public class ExemploMatriz02 {
	
	public static void main(String[] args) {
		
		int [][] valores = { {25,26,27,28},{10,11,14,15} };
		
		for(int i=0; i<valores.length;++i) {
			for(int j=0; j<valores[i].length;++j) {
				
				System.out.println(valores[i][j]);	
				
			}
							
		}
		
	}

}
