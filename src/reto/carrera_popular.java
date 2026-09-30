package principal;

import java.util.Scanner;

public class carrera_popular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables para contar los resultados al final
		int menosSESENTA = 0; 
		int masTRES = 0;      
		int mejorTIEMP = 10000; 
		int contador = 0;     
		int tiempSUMA = 0;    
		int mediaPART = 0;    
		
		Scanner teclado = new Scanner(System.in);
		
		// Interruptor (bandera) para mantener activo el bucle mientras queramos añadir gente
		boolean continuar = true;
		
		// Bucle que se repite hasta que la variable 'continuar' pase a ser false
		while (continuar) {
		
			System.out.println("Introduce DNI PARTICIPANTE:");
			String DNI = teclado.nextLine();
			
		
			System.out.println("¿Participa individualmente (1) o por parejas (2)?:");
			int tipoParticipacion = Integer.parseInt(teclado.nextLine());
			
			// Si pone algo que no sea 1 ni 2, no le dejamos avanzar
			while (tipoParticipacion != 1 && tipoParticipacion != 2) {
				System.out.println("Opción incorrecta. Introduce 1 para individual o 2 para parejas:");
				tipoParticipacion = Integer.parseInt(teclado.nextLine());
			}
			
			System.out.println("Introduce el numero de carreras populares en las que has participado anteriormente");
			int carreraPOP = Integer.parseInt(teclado.nextLine());
			
			while (carreraPOP < 0) {
				System.out.println("No se permiten valores negativos. Introduce de nuevo:");
				carreraPOP = Integer.parseInt(teclado.nextLine());
			}
			
			if(carreraPOP > 3) masTRES += 1;
			
			// Pedimos los minutos y los segundos del tiempo realizado
			System.out.println("Introduce tu tiempo tiempo realizado en minutos y seguidamente en segundos");
			
			// Leemos y validamos que los minutos no sean negativos
			int tiempMIN = Integer.parseInt(teclado.nextLine());
			while (tiempMIN < 0) {
				System.out.println("Los minutos no pueden ser negativos. Introduce de nuevo:");
				tiempMIN = Integer.parseInt(teclado.nextLine());
			}
			
			// Leemos y validamos que los segundos no sean negativos
			int tiempSEG = Integer.parseInt(teclado.nextLine());
			while (tiempSEG < 0) {
				System.out.println("Los segundos no pueden ser negativos. Introduce de nuevo:");
				tiempSEG = Integer.parseInt(teclado.nextLine());
			}
			
			// Convertimos todo el tiempo a segundos 
			int totalTIEMP = tiempMIN * 60 + tiempSEG;
			
			// El 'mejorTIEMP', lo guardamos como nuevo récord
			if(totalTIEMP < mejorTIEMP) mejorTIEMP = totalTIEMP;
			
			
			if(tiempMIN < 60) {
				menosSESENTA += 1; // Sumamos 1 al contador
				System.out.println("Has hecho menos de 60 min");
			}
			
			// Preguntamos si quieren seguir metiendo a más personas
			System.out.println("¿Desea introducir más participantes? 1 si 2 no");
			int contDATA = Integer.parseInt(teclado.nextLine());
			
			// Si responden 2, cambiamos sale del bucle
			if(contDATA == 2) continuar = false;
			
	
			contador += 1;
			
			// Acumulamos el tiempo de esta persona a la suma total de tiempos
			tiempSUMA = totalTIEMP + tiempSUMA;
		}
		
		// Calculamos la media dividiendo la suma total de segundos entre el número de participantes
		mediaPART = tiempSUMA / contador;
		
		System.out.println("1 El número total de participantes registrados es de " + contador);
		System.out.println(menosSESENTA + " ha terminado la carrera en menos de 60 minutos");
		System.out.println(masTRES + " ha participado en mas de 3 carreras");
		System.out.println("El tiempo medio ha sido " + mediaPART + " en segundos");	
		System.out.println(mejorTIEMP + " ha sido el mejor tiempo");
	}
}