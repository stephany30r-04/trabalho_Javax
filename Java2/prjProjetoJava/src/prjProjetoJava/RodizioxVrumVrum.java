package prjProjetoJava;

import java.util.Scanner;
public class RodizioxVrumVrum {
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n;
		System.out.println("escreva o último número de sua placa");
		n = in.nextInt();
		
		switch(n) {
			case 1:
			case 2:
				System.out.println("Seu carro não pode circular as segundas");
				break;
			case 3:
			case 4:
				System.out.println("Seu carro não pode circular as terças");
				break;
			case 5:
			case 6:
				System.out.println("Seu carro não pode circular as quartas");
				break;
			case 7:
			case 8:
				System.out.println("Seu carro não pode circular as quintas");
				break;
			case 9:
			case 0:
				System.out.println("Seu carro não pode circular as sextas");
				break;
			default:
				System.out.println("Dia inválido");
				
		}
		
	 

	}

}
