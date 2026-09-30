package principal;

import java.util.Scanner;

public class Script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Control de revisiones de bicicletas
		Una empresa de alquiler de bicicletas quiere llevar un control sobre las revisiones de las bicicletas de su flota.
		(Hecho)		Primero se pedirá mediante consola la fecha actual, indicando día, mes y año.
		(Hecho)		Después se introducirán los datos de varias bicicletas, una a una. Antes de pasar a registrar una nueva bicicleta, se preguntará:
					“¿Quiere registrar otra bicicleta? Conteste S o N”
		(hecho)		Para cada bicicleta se pedirá:
					El número de identificación de la bicicleta. 
					La fecha de la última revisión, indicando día, mes y año. 
		El programa deberá comparar la fecha de la última revisión con la fecha actual.
		(Hecho)		Si ha pasado más de un año desde la última revisión, se mostrará:
					“Esta bicicleta necesita revisión.”
					En caso contrario, se mostrará:
					“Esta bicicleta NO necesita revisión.”
		(Hecho)		Además, el programa deberá contar cuántas bicicletas necesitan revisión y cuántas no necesitan revisión.
					Al finalizar el registro, se mostrará en pantalla:
					Bicicletas que necesitan revisión: seguido del número correspondiente.
					Bicicletas que no necesitan revisión: seguido del número correspondiente.*/

		
		int diaActual = 0;
		int mesActual = 0;		
		int anoActual = 0;
		
		int numIdentificacion = 0;
		
		int diaRevision = 0;
		int mesRevision = 0;
		int anoRevision = 0;
		
		int contadorBicis = 0;
		int revisionSi = 0;
		int revisionNo = 0;
		
		String respuesta = "S";
		Scanner teclado = new Scanner(System.in);
		
		
		
		
		System.out.println("Introduce el día actual: ");
		diaActual = Integer.parseInt(teclado.nextLine());
		
		while (diaActual > 31 || diaActual < 1)
		{
			System.out.println("Día inválido");
			System.out.println("Introduce el día actual: ");
			diaActual = Integer.parseInt(teclado.nextLine());
		}
		
		
		System.out.println("Introduce el mes actual: ");
		mesActual = Integer.parseInt(teclado.nextLine());
		
		while (mesActual > 12 || mesActual < 1)
		{
			System.out.println("Mes inválido");
			System.out.println("Introduce el mes actual: ");
			mesActual = Integer.parseInt(teclado.nextLine());
		}
		
		System.out.println("Introduce el año actual: ");
		anoActual = Integer.parseInt(teclado.nextLine());
		
		while (anoActual < 1)
		{
			System.out.println("Año inválido");
			System.out.println("Introduce el año actual: ");
			anoActual = Integer.parseInt(teclado.nextLine());
		}
		
		
		while (respuesta.equalsIgnoreCase("S"))
		{
			System.out.println("Introduce el numero de identificacion de la bicicleta: ");
			numIdentificacion = Integer.parseInt(teclado.nextLine());
			
			while (numIdentificacion < 1)
			{
				System.out.println("Número inválido");
				System.out.println("Introduce el numero de identificacion de la bicicleta: ");
				numIdentificacion = Integer.parseInt(teclado.nextLine());
			}
			
			System.out.println("Fecha de la última revisión (día): ");
			diaRevision = Integer.parseInt(teclado.nextLine());
			
			while (diaRevision > 31 || diaRevision < 1)
			{
				System.out.println("Día inválido");
				System.out.println("Fecha de la última revisión (día): ");
				diaRevision = Integer.parseInt(teclado.nextLine());
			}
			
			System.out.println("Fecha de la última revisión (mes): ");
			mesRevision = Integer.parseInt(teclado.nextLine());
			
			while (mesRevision > 12 || mesRevision < 1 )
			{
				System.out.println("Mes inválido");
				System.out.println("Fecha de la última revisión (Mes): ");
				mesRevision = Integer.parseInt(teclado.nextLine());
			}
			
			System.out.println("Fecha de la última revisión (Año): ");
			anoRevision = Integer.parseInt(teclado.nextLine());
			
			while (anoRevision > anoActual)
			{
				System.out.println("El año de la última revision debe ser debe ser igual o anterior al año Actual");
				System.out.println("Fecha de la última revisión (Año): ");
				anoRevision = Integer.parseInt(teclado.nextLine());
			}
			
			if(anoActual - anoRevision > 1 || anoActual - anoRevision == 1 && mesActual > mesRevision || anoActual - anoRevision == 1 && mesActual == mesRevision && diaActual > diaRevision)
			{
				System.out.println("Esta bicicleta necesita revision");
				revisionSi++;
				contadorBicis++;
			}
			
			else //(anoActual - anoRevision < 1 )
			{
				System.out.println("Esta bicicleta NO necesita revision");
				revisionNo++;
				contadorBicis++;
			}
			
			
			
			
			System.out.println("¿Quiere registrar otra bicicleta? Conteste S o N");
			respuesta = teclado.nextLine();
			
			while(!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"))
			{
				System.out.println("Solo puede responder S o N");
				System.out.println("¿Quiere registrar otra bicicleta? Conteste S o N");
				respuesta = teclado.nextLine();
			}
		
		
		}
		

		System.out.println("Bicicletas registradas: " + contadorBicis);
		System.out.println("Bicicletas que necesitan revisión: " + revisionSi);
		System.out.println("Bicicletas que NO necesitan revisión: " + revisionNo);
		

		
	teclado.close();	
		

	}
	

}
