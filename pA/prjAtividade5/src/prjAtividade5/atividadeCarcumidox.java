package prjAtividade5;

import java.util.Scanner;

public class atividadeCarcumidox {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String nome1, nome2; int idade1, idade2;
		
		System.out.println("Entre com o primeiro nome ");
		nome1 = ler.next();
		System.out.println("Entre com o segundo nome ");
		nome2 = ler.next();
		System.out.println("Entre com a idade da primeira pessoa ");
		idade1 = ler.nextInt();
		System.out.println("Entre com a idade da segunda pessoal ");
		idade2 = ler.nextInt();
		if (idade1 > idade2) {
			System.out.println("O mais velhox é " +nome1+ " com " +idade1+ " mais anus");
		} else {
			System.out.println("O mais velhox é " +nome2+ " com " +idade2+ " mais anus");
		} if (idade1 < idade2) {
			System.out.println("O mais novo é " +nome1+ " com " +idade1+ " mais anus");
		} else {
			System.out.println("O mais novo é " +nome1+ " com " +idade1+ " mais anus");
		} if (idade1 == idade2) {
			System.out.println("Vocês tem a mesma idade");
		} else {}
		ler.close();
	}

}
