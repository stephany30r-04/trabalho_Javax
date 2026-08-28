package prjAtividade2;

import java.util.Scanner;

public class atividadeAnus {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double ano, anoNascimento, idade;
		
		System.out.println("Entre com o ano de nascimentox:");
		anoNascimento = ler.nextDouble();
		System.out.println("Entre com o ano atual:");
		ano = ler.nextDouble() ;
		if (anoNascimento > 1900 && anoNascimento < 2026){
			idade = ano-anoNascimento;
			System.out.println("Sua idade é " + idade + " anus");
		} else {
			System.out.println("O ano digitado é invalidox");
		}
		ler.close();
			

	}

}
