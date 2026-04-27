package exModularizacao;

import java.util.Scanner;

public class aula {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		int opcao;
	
		System.out.println("digite o seu primeiro numero e consequentemente o segundo: ");
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		
		
		
		
		
		System.out.println("digite 1 se você deseja somar ou digite 0 caso deseje subtrair");
		opcao = teclado.nextInt();
		if (opcao==1) {
			soma (n1, n2);
		}else if (opcao==0) {
			sub (n1, n2);
		}else {
			System.out.println("opção invalida.");
		}
		
		teclado.close();
	
	}

	public static void sub(int n1, int n2) {
		
	int subtracao;
	
	subtracao = n1 - n2;
	System.out.println("a subtração dos seus numeros é: " + subtracao);
		
	}

	public static void soma (int n1, int n2) {
		
		int somador = n1 + n2;
		System.out.println("a soma dos seus numeros é: " + somador);
		
		
		
			
		
	}

}
