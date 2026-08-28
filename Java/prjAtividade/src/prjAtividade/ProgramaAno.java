package prjAtividade;

import java.util.Scanner;

public class ProgramaAno {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int ano;
		System.out.println("Insira o ano");
		ano = ler.nextInt();
		if (ano<4) {
			System.out.println("Seu ano não é bissexto");
		} else 
		if (ano%4 ==0) {
			System.out.println("Seu ano é bissexto!");
		} else {
			System.out.println("Seu ano não é bissexto!");
		}
		ler.close();
		}

}
