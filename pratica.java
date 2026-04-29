import java.util.Scanner;

public class pratica {

	public static void main(String[] args) {
		
		int cal1, cal2, escolher, soma, sub, divi, multi;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculadora de soma, subtração, multiplicação e divisão.");
		System.out.println("------------------------------------------------------");
		System.out.println("(1) Soma");
		System.out.println("------------------------------------------------------");
		System.out.println("(2) Subtração");
		System.out.println("------------------------------------------------------");
		System.out.println("(3) Multiplicação");
		System.out.println("------------------------------------------------------");
		System.out.println("(4) Divisão");
		System.out.println("------------------------------------------------------");
		System.out.println("escolha: ");
		escolher = teclado.nextInt();
		System.out.println("escolha o primeiro numero: ");
		cal1 = teclado.nextInt();
		System.out.println("escolha o segundo numero: ");
		cal2 = teclado.nextInt();
		
		
		if(escolher == 1) {
			
			soma = cal1 + cal2;
			System.out.println("a soma é: " + soma);
			
		}else if(escolher == 2) {
		
		   sub = cal1 - cal2;
		   System.out.println("a subtraçao é: " + sub);
		
	    }else if(escolher == 3) {
		
		   multi = cal1 * cal2;
		   System.out.println("a multiplicação é: " + multi);
	    
        }else if(escolher == 4) {
        	divi = cal1 / cal2;
        	System.out.println("a divisão é: " + divi);
        }
        	
		
		teclado.close();
		

	}

}
