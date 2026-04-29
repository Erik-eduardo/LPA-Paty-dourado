package exModularizacao;

import java.util.Scanner;

public class aula2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n1, n2, resultadoSoma, resultadoSub;
		int opcao;
	
		System.out.println("digite o seu primeiro numero e consequentemente o segundo: ");
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		
		System.out.println("digite 1 se você deseja somar ou digite 0 caso deseje subtrair");
		opcao = teclado.nextInt();
		
		if (opcao==1) {
			resultadoSoma = soma (n1, n2);
			System.out.println("O resultado da soma é: "+ resultadoSoma);
		}else if (opcao==0) {
			resultadoSub = sub (n1, n2);
			System.out.println("O resultado da subtração é: " + resultadoSub);
		}else {
			System.out.println("opção invalida.");
		}
		
		teclado.close();
		
	
	}

	public static int soma (int n1, int n2) {
		
		int somador = n1 + n2;
		return somador;
		
	}

	
		public static int sub(int n1, int n2) {
		
	int subtracao;
	
	subtracao = n1 - n2;
	return subtracao;
	}

}
