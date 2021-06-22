package me.guiihpcolusso;

import javax.swing.JOptionPane;

public class Exercicios08 {
	
	public static void main(String[] args) {
		
		String eleitores = JOptionPane.showInputDialog("Digite a Quantidade de Eleitores", "Valor");
		String brancos = JOptionPane.showInputDialog("Digite a Quantidade de Votos Brancos", "Valor");
		String nulos = JOptionPane.showInputDialog("Digite a Quantidade de Votos Nulos", "Valor");
		String validos = JOptionPane.showInputDialog("Digite a Quantidade de Votos Validos", "Valor");
		
		double eleitores1 = Double.parseDouble(eleitores);
		double brancos1 = Double.parseDouble(brancos);
		double nulos1 = Double.parseDouble(nulos);
		double validos1 = Double.parseDouble(validos);
		
		double nulos2 = 100*(nulos1/eleitores1);
		double votovalido = 100*(validos1/eleitores1);
		double votosbranco = 100*(brancos1/eleitores1);
		
		double votos = nulos1 + validos1 + brancos1;		
		
		JOptionPane.showMessageDialog(null, "Total de Eleitores : " + eleitores1);
		JOptionPane.showMessageDialog(null, "Numero de votos : " + votos);
		JOptionPane.showMessageDialog(null, "Numero de votos Brancos : " + votosbranco + "%");
		JOptionPane.showMessageDialog(null, "Numero de votos Nulo : " + nulos2 + "%");
		JOptionPane.showMessageDialog(null, "Numero de votos Validos : " + votovalido + "%");
		
		
		
	}

}
