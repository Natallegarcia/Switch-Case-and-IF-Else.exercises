package switchCase;

import java.util.Scanner;

public class ResultadoNotasIfElse {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println ("Digite a NOTA 1");
	double nota1 = scan.nextDouble();
	
	System.out.println ("Digite a NOTA 2");
	double nota2 = scan.nextDouble();

	double mediaFinal = (nota1 + nota2)/2;
	
	System.out.println (mediaFinal);
	if (mediaFinal >=9.0 && mediaFinal <=10.0) {
		System.out.println ("Conceito A");
		System.out.println ("APROVADO!");
	} else if (mediaFinal >= 7.5 && mediaFinal <=8.9) {
		System.out.println ("Conceito B");
		System.out.println ("APROVADO!");
	} else if (mediaFinal >=6.0 && mediaFinal <= 7.4) {
		System.out.println ("Conceito C");
		System.out.println ("APROVADO!");
	} else if (mediaFinal >= 4.0 && mediaFinal <=5.9) {
		System.out.println ("Conceito D");
		System.out.println ("REPROVADO!");
	} else if (mediaFinal >= 3.9 && mediaFinal == 0.0) {
		System.out.println ("Conceito E");
		System.out.println ("REPROVADO!");
	}

	}
	
	
	}


