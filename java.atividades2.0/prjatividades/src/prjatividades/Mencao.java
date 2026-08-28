package prjatividades;

import java.util.Scanner;

public class Mencao {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	String m;
	System.out.println("insira sua menção");
	m = ler.next();
	switch (m) {
		case "MB":
			System.out.println("Você é um aluno excelente");
			break;
		case "B": 
			System.out.println("Você é um aluno bom");
			break;
		case "R":
			System.out.println("Você é um aluno regular");
			break;
		case "I":
			System.out.println("Você é um aluno Instatisfatorio");
			break;
		default :
			System.out.println("Menção invalida");
	}
	
	}

}
