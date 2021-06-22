package me.guiihpcolusso;

import javax.swing.JOptionPane;

public class Exercicio09 {
	
	public static void main(String[] args) {
	
	String valor1 = JOptionPane.showInputDialog("Digite o Valor do seu Salario", "Valor");
	String valor2 = JOptionPane.showInputDialog("Digite o valor do seu reajuste : ", "Valor");
	
	double numero1 = Double.parseDouble(valor1);
	double numero2 = Double.parseDouble(valor2);
	
	double salariofinal = (numero1 + (numero1 *(numero2/100)));
	
	JOptionPane.showMessageDialog(null, "A Media é : " + salariofinal);
	
	}
}
