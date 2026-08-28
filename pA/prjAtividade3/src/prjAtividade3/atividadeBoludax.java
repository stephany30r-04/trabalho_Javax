package prjAtividade3;

import java.util.Scanner;

public class atividadeBoludax {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int golsA, golsB;
		
		System.out.println("Me digax os gols do timex A ");
		golsA = ler.nextInt();
		System.out.println("Me digax os gols do timex B ");
		golsB = ler.nextInt();
		if (golsA == golsB){
			System.out.println("Vocês extão empatadoxs!");
		} else if (golsA < golsB) {
			System.out.println("Time B ganhoux!!!!");
		} else {
			System.out.println("Time A ganhoux!!!");
		}
		ler.close();

	}

}
