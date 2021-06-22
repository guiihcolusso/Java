package me.guiihpcolusso;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro Valor", "Valor");
		
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo Valor", "Valor");
		
		String valor3 = JOptionPane.showInputDialog("Digite o Terceiro Valor", "Valor");
		
		String valor4 = JOptionPane.showInputDialog("Digite o Quarto Valor", "Valor");
		
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		double numero4 = Double.parseDouble(valor4);
		
		double soma = numero1+numero2+numero3+numero4;
		double media = soma /4;
		
		
		JOptionPane.showMessageDialog(null, "A Soma total é : " + soma);
		JOptionPane.showMessageDialog(null, "A Media é : " + media);
			
		
	}
}
