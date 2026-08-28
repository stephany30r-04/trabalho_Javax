package prjatividades;

import java.util.Scanner;

public class Futebol {
	public static void main(String [] args ) {
		Scanner in = new Scanner(System.in);
		int aa, nn, id;
		System.out.println("Insira seu ano de nascimento");
		aa = in.nextInt();
		System.out.println("Insira o ano atual");
		nn = in.nextInt();
		id = nn-aa;
		
		switch (id) {
			case 6:
				System.out.println("Você é categoria dente de leite");
				break;
			case 7:
				System.out.println("Você é categoria Júnior");
				break;
			case 8:
				System.out.println("Você é categoria Júnior max");
				break;
			case 9:
				System.out.println("Você é categoria Júnior master");
				break;
			case 10:
				System.out.println("Você é categoria Master");
				break;
			default:
				System.out.println("Você não pode participar dessa escola");
		}
	}
}
