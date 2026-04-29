package exModularizacao;

import java.util.Scanner;

public class AtividadeReserva {
	
	//Erik Eduardo Oliveira Barbosa, Carlos Alexandre Cantuária

	public static void main(String[] args) {
		String resposta;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite a sua idade para verificação de voto: ");
		idade = teclado.nextInt();
		
		resposta = categoria(idade);
		
			System.out.println(resposta);
		
	}
		
		public static String categoria(int idade) {
			String categoria;

		if (idade >= 0 && idade <= 15) {

			categoria = "Não pode votar";
			return categoria;
					
		}else if (idade == 16 && idade == 17) {
			
			categoria = "voto facultativo";
			return categoria;
			
		}else if (idade >= 18 && idade <= 64) {
			
			categoria = "obrigatorio votar";
			return categoria;
			
		}else {
			categoria = "opção invalida.";
			return categoria;
			
		}
		

	}

}
