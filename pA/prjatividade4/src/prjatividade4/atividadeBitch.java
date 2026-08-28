package prjatividade4;

import java.util.Scanner;

public class atividadeBitch {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double dias, valorIlha, valorF;
		System.out.println("Informe a quantidade de dias");
		dias = ler.nextDouble();
		
		if (dias > 0 && dias <= 5) {
			valorIlha = dias * 240;
			valorF = dias * 400 +100;
			System.out.println("Valor final para Ilha bela é " +valorIlha);
			System.out.println("Valor final de Fernando de Noronho é " +valorF);
		} else if (dias > 6 && dias <= 10) {
			valorIlha = dias * 220 + 130;
			valorF = dias * 410 + 150;
			System.out.println("Valor final para Ilha bela é " +valorIlha);
			System.out.println("Valor final de Fernando de Noronho é " +valorF);
		}  else if (dias > 10) {
			valorIlha = dias * 210 + 150;
			valorF = dias * 420 + 200;
			System.out.println("Valor final para Ilha bela é " +valorIlha);
			System.out.println("Valor final de Fernando de Noronho é " +valorF);
		} 
		ler.close();

	}
 
}
