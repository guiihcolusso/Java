package me.guiihpcolusso;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		String PrecoC = JOptionPane.showInputDialog("Digite o Valor do Veiculo ", "Valor");
		
		double PrecoCarro = Double.parseDouble(PrecoC);
		
		double distribuidor = PrecoCarro*0.28;
		double imposto = PrecoCarro*0.45;
		double PrecoFinal = PrecoCarro + imposto + distribuidor;
		
		JOptionPane.showMessageDialog(null, "O Preço Final do Veiculo Será : R$" + PrecoFinal);
		
	}
	
}
