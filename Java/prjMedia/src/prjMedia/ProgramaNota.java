package prjMedia;

import java.util.Scanner;

public class ProgramaNota {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double n1,n2,n3,m,nm;
		System.out.println("informe a primeira nota");
		n1 = ler.nextDouble();
		System.out.println("Informe a segunda nota");
		n2 = ler.nextDouble();
		m = (n1+ n2)/2;
		if (m<3) {
			System.out.println("Reprovado");
		} else {
			if (m>=6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("vc está de exame");
				
				System.out.println("insira a nota do exame");
				n3 = ler.nextDouble();
				nm = (n3+m)/2;
				System.out.println("Sua nova média é: "+nm);
				if (nm>=6){
					System.out.println("Aprovado");
				}else {
					System.out.println("Reprovado");
				}
				}
		}
		ler.close();

	}

}
