package principal;

import java.util.Scanner;

public class carrera_popular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menosSESENTA = 0;
		int masTRES = 0;
		int mejorTIEMP = 10000;
		int contador = 0;
		int tiempSUMA = 0;
		int mediaPART = 0;
		
		Scanner teclado = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar) {
			System.out.println("Introduce DNI PARTICIPANTE:");
			String DNI = teclado.nextLine();
			//System.out.println("¿Participa individualmente o por parejas?");
			System.out.println("Introduce el numero de carreras populares en las que has participado anteriormente");
			
		
			int carreraPOP = Integer.parseInt(teclado.nextLine());
			while (carreraPOP < 0) {
				System.out.println("No se permiten valores negativos. Introduce de nuevo:");
				carreraPOP = Integer.parseInt(teclado.nextLine());
			}
			
			if(carreraPOP > 3) masTRES += 1;
			
			System.out.println("Introduce tu tiempo tiempo realizado en minutos y seguidamente en segundos");
			
		
			int tiempMIN = Integer.parseInt(teclado.nextLine());
			while (tiempMIN < 0) {
				System.out.println("Los minutos no pueden ser negativos. Introduce de nuevo:");
				tiempMIN = Integer.parseInt(teclado.nextLine());
			}
			
		
			int tiempSEG = Integer.parseInt(teclado.nextLine());
			while (tiempSEG < 0) {
				System.out.println("Los segundos no pueden ser negativos. Introduce de nuevo:");
				tiempSEG = Integer.parseInt(teclado.nextLine());
			}
			
			int totalTIEMP = tiempMIN * 60 + tiempSEG;
			
			if(totalTIEMP < mejorTIEMP) mejorTIEMP = totalTIEMP;
			
			if(tiempMIN < 60) {
				menosSESENTA += 1;
				System.out.println("Has hecho menos de 60 min");
			}
			
			System.out.println("¿Desea introducir más participantes? 1 si 2 no");
			int contDATA = Integer.parseInt(teclado.nextLine());
			
			if(contDATA == 2) continuar = false;
			contador += 1;
			
			tiempSUMA = totalTIEMP + tiempSUMA;
		}
		
		mediaPART = tiempSUMA / contador;
		
		System.out.println("1 El número total de participantes registrados es de " + contador);
		System.out.println(menosSESENTA + " ha terminado la carrera en menos de 60 minutos");
		System.out.println(masTRES + " ha participado en mas de 3 carreras");
		System.out.println("El tiempo medio ha sido " + mediaPART + " en segundos");	
		System.out.println(mejorTIEMP + " ha sido el mejor tiempo");
	}
}