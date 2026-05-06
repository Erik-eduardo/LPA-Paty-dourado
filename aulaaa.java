package exModularizacao;

import java.util.Scanner;

public class aulaaa {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	double soma;
 
	double salario[];
	
	salario = new double[10];
	
	for(int i=0; i<=9; i++) {
		
		System.out.println("Digite o salario dos funcionarios: ");
		
	 salario[i] = teclado.nextDouble();
	 
	}
	
	soma = salario[0] + salario[1] + salario[2] + salario[3] + salario[4] + salario[5] + salario[6] + salario[7] + salario[8] + salario[9];
	
	System.out.println("A soma dos salarios dos dez funcionarios é: " + soma);
	teclado.close();
	
	}

}
