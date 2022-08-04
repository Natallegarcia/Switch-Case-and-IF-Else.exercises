package switchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println ("Informe o dia da semana para agendamento (1-7)");
		Scanner scan = new Scanner (System.in);
		
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {
			System.out.println ("DOMINGO");
		}  else if (diaSemana == 2) {
			System.out.println ("Segunda-Feira");
		} else if (diaSemana == 3) {
			System.out.println ("Terça-Feira");
		}else if (diaSemana == 4) {
			System.out.println ("Quarta-Feira");
		} else if (diaSemana == 5) {
			System.out.println ("Quinta-Feira");
			} else if (diaSemana == 6) {
				System.out.println ("Sexta-Feira");
			} else if (diaSemana == 7) {
				System.out.println ("Sábado");
			} else {
				System.out.println ("O número escolhido não corresponde a um dia da semana válido");
		}
		
		// a mesma lógica aplicada ao switch case
		
		switch (diaSemana) {
		case 1: System.out.println ("Domingo");break;	// finaliza a execução ao fim do case
		case 2: System.out.println ("Segunda-Feira");break;
		case 3: System.out.println ("Terça-Feira"); break;
		case 4: System.out.println ("Quarta-Feira"); break;
		case 5: System.out.println ("Quinta-feira");break;
		case 6: System.out.println ("Sexta-feira");break;
		case 7: System.out.println ("Sábado");break;
		default: System.out.println ("O número escolhido não corresponde a um dia da semana válido");
		} // default é o código que será executado caso a condição não seja atendida 
		System.out.println("Agendamento confirmado  " + diaSemana);

		
		} 
		

}
