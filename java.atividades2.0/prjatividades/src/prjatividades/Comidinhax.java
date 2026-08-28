package prjatividades;

import java.util.Scanner;

public class Comidinhax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c;
		System.out.println("Insira o codigo");
		c = in.nextInt();
		switch (c) {
			case 1:
				System.out.println("cachorro quente custa 8 reais");
				break;
			case 2:
				System.out.println("o cheese burguer custa 12 reais");
				break;
			case 3:
				System.out.println("o x-salada custa 15 reais");
				break;
			case 4:
				System.out.println("O misto quente custa 11 reais");
				break;
			case 5:
				System.out.println("o pao na chapa custa 6 reais");
				break;
			default:
				System.out.println("codigo invalido");
		}

	}

}
