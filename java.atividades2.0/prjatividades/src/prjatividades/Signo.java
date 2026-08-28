package prjatividades;

import java.util.Scanner;

public class Signo {
	public static void main(String [] args ) {
		 Scanner in = new Scanner (System.in);
		 int d, m;
		 
		 System.out.println("Insira seu dia de nascimento");
		 d = in.nextInt();
		 System.out.println("Insira seu mês de nascimento");
		 m = in.nextInt();
		 
		 switch (m) {
		 	case 1:
		 		if (d>=21) {
		 		System.out.println("Aquário");
		 		} else {
		 			System.out.println("Capricórnio");
		 		}
		 		break;
		 		
		 	case 2:
		 		if (d>=19) {
		 			System.out.println("peixes");
		 		} else {
		 			System.out.println("Aquario");
		 		}
		 	case 3:
		 		if (d>=21) {
		 			System.out.println("áries");
		 		} else {
		 			System.out.println("peixes");
		 		}
		 	case 4:
		 		if (d>=21){
		 			System.out.println("tourox");
		 		} else {
		 			System.out.println("Ariesx");
		 		}
		 		break;
		 	case 5:
		 		if (d>=21){
		 			System.out.println("gemeos");
		 		} else {
		 			System.out.println("touro");
		 		}
		 		break;
		 	case 6:
		 		if (d>=21){
		 			System.out.println("cancer");
		 		} else {
		 			
		 			System.out.println("gemeos");
		 		}
		 		break;
		 	case 7:
		 		if (d>=23){
		 			System.out.println("leão");
		 		} else {
		 			System.out.println("cancer");
		 		}
		 		break;
		 	case 8:
		 		if (d>=23){
		 			System.out.println("virgem");
		 		} else {
		 			System.out.println("leão");
		 		}
		 		break;
		 	case 9:
		 		if (d>=23){
		 			System.out.println("Libra");
		 		} else {
		 			System.out.println("virgem");
		 		}
		 		break;
			case 10:
		 		if (d>=23){
		 			System.out.println("escorpião");
		 		} else {
		 			System.out.println("libra");
		 		}
		 		break;
			case 11:
		 		if (d>=22){
		 			System.out.println("sargitario");
		 		} else {
		 			System.out.println("escorpiao");
		 		}
		 		break;
		 		
			case 12:
			 		if (d>=22){
			 			System.out.println("capricornio");
			 		} else {
			 			System.out.println("sargitario");
			 		}
			 		break;
		 	default:
		 		System.out.println("Dia invalido");
		 		
		 	}
		 		
		 }
			 
		 
		 
		 
		
} 
	
