package me.guiihpcolusso;

import javax.swing.JOptionPane;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		String SalaFixo = JOptionPane.showInputDialog("Digite o Salario fixo de seu Funcionario ", "Valor");
		String GanhoVendas = JOptionPane.showInputDialog("Quanto ele Ganha por venda ", "Valor");
		String Carros = JOptionPane.showInputDialog("Quantos Carros Ele Vendeu ", "Valor");
		String ValorTotalVendas = JOptionPane.showInputDialog("Digite o Valor total das Vendas dele ", "Valor");
		
		double Salario = Double.parseDouble(SalaFixo);
		double GanhoPorCarro = Double.parseDouble(GanhoVendas);
		double CarrosVendido = Double.parseDouble(Carros);
		double TotalVendas = Double.parseDouble(ValorTotalVendas);
		
		double salariovendedor = Salario + (GanhoPorCarro * CarrosVendido) + (TotalVendas* 5/100);
		
		JOptionPane.showMessageDialog(null, "O Salario Final do Vendedor Será : R$" + salariovendedor);
		
	}

}
