package me.guiihpcolusso;

import java.util.Calendar;
import java.util.Scanner;

public class Atividade18 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.println("Digite o ano que voce nasceu : ");
		int nacimento = scn.nextInt();
		
		scn.close();
		
		int idade = ano - nacimento;
		
		
		if (idade >= 16) {
			System.out.println("Vocé Podera Votar :)");
		}else {
			System.out.println("Infelizmente Vocé não podera votar");
		}
		
		
	}

}
