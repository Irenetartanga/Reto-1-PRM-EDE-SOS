package reto;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		double kmCoche = 0;
		double kmBici = 0;
		double kmBus = 0;
		double hPlancha = 0;
		double hOrdenador = 0;
		double hMovil = 0;
		int plancha = 0;
		double suma = 0;
		int actividad=0;

		Scanner teclado = new Scanner(System.in);

		/*System.out.println("Introduce personas: ");
		int personas = Integer.parseInt(teclado.nextLine());*/

		do {

			System.out.println("Escoge el menu de actividades (con numero)");
			System.out.println("1.Kilometros recorridos en coche \n2.Kilometros recorridos en autobus "
					+ "\n3.Kilometros recorridos en bicicleta \n4.Uso de la plancha"
					+ "\n5.Uso del ordenador \n6.Uso del móvil:\n7.Finalizar actividades del dia:");
			actividad = teclado.nextInt();

			switch(actividad)
			{
			case 1:
				System.out.println("¿Cuantos kilometros has recorrido en coche?");
				kmCoche = teclado.nextFloat();
				while (kmCoche <0)
				{
					System.out.println("Error");
					System.out.println("¿Cuantos kilometros has recorrido en coche?");
					kmCoche = teclado.nextFloat();						
				}
				kmCoche = kmCoche * 0.21;
				System.out.println(kmCoche + " kg CO2");

				break;

			case 2:
				System.out.println("¿Cuantos kilometros has recorrido en autobus?");
				kmBus = teclado.nextFloat();

				while (kmBus <0)
				{
					System.out.println("Error");
					System.out.println("¿Cuantos kilometros has recorrido en bus?");
					kmBus = teclado.nextFloat();						
				}
				kmBus = kmBus * 0.10;
				System.out.println(kmBus + " kg CO2");
				break;

			case 3:
				System.out.println("¿Cuantos kilometros has recorrido en bicicleta?");
				kmBici = teclado.nextFloat();

				while (kmBici <0)
				{
					System.out.println("Error");
					System.out.println("¿Cuantos kilometros has recorrido en bici?");
					kmBici = teclado.nextFloat();						
				}
				kmBici =  0;
				System.out.println(kmBici + " kg CO2");
				break;

			case 4:
				System.out.println("¿Utilizas plancha (0 - no/1 - si)?");
				plancha = teclado.nextInt();

				while ( plancha <0|| plancha >1 )
				{
					System.out.println("Error, mete 1 o 0");
					System.out.println("¿Utilizas plancha (0 - no/1 - si)?");
					plancha = teclado.nextInt();

				}
				if(plancha == 1)
				{
					System.out.println("Cuantas horas la usaste?");
					hPlancha = teclado.nextInt();
					hPlancha = hPlancha * 0.7;
					System.out.println(hPlancha + " kg CO2");

				}
				else if (plancha == 0)
					break;

			case 5:
				System.out.println("¿Cuantas horas usas el ordenador?");
				hOrdenador = teclado.nextFloat();

				while (hOrdenador <0)
				{
					System.out.println("Error");
					System.out.println("¿Cuantas hora usas el ordenador?");
					hOrdenador = teclado.nextFloat();						
				}
				hOrdenador = hOrdenador * 0.08;
				System.out.println(hOrdenador + " kg CO2");
				break;

			case 6:
				System.out.println("¿Cuantas horas usas el movil?");
				hMovil = teclado.nextFloat();

				while (hMovil <0)
				{
					System.out.println("Error");
					System.out.println("¿Cuantas hora usas el ordenador?");
					hMovil = teclado.nextFloat();						
				}
				hMovil = hMovil * 0.02;
				System.out.println(hMovil + " kg CO2");
				break;

			}	
		}
		while (actividad !=7);
		{

			suma = kmCoche + kmBus + kmBici + hPlancha + hOrdenador + hMovil;
			System.out.println(suma);
		}
	}
}

