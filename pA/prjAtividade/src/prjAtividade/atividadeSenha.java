package prjAtividade;
import java.util.Scanner;

public class atividadeSenha {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		String senha, senhaCerta;
		senhaCerta = "abcd";
		System.out.println("Entre com a senha:");
		senha = ler.next();
		
		if (senha.equalsIgnoreCase(senhaCerta)) { 
			System.out.println("Acesso Permitidox");
		} else {
			System.out.println("Acesso Negadox");
		}
		ler.close();
	}

}
