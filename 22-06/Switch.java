package me.guiihpcolusso;

public class Switch {
	public static void main(String[] args) {

		int valor = 10;

		switch (valor) {

		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda");
			break;

		case 3:
			System.out.println("Terça");
			break;

		case 4:
			System.out.println("Quarta");
			break;

		case 5:
			System.out.println("Quinta");
			break;

		case 6:
			System.out.println("Sexta");
			break;

		case 7:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Nao Possui Dia Correspondente");
			break;
		}

	}

}
