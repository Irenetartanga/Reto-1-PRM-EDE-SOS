package principal;

import java.util.Scanner;

public class Script1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float kmCoche = 0;
		float kmBici = 0;
		float kmBus = 0;
		float hPlancha = 0;
		float hOrdenador = 0;
		float hMovil = 0;		
		float suma = 0;
		float totalGrupo = 0;
		
		int plancha = 0;
		int actividad = 0;
		int contadorPersonas = 1;
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos sois? ");
		int personas = Integer.parseInt(teclado.nextLine());
				
		while (personas <= 0) {
			System.out.println("Error: tienes que meter al menos a una persona.");
			System.out.println("¿Cuantos sois? ");
			personas = Integer.parseInt(teclado.nextLine());
		}
		
		while (contadorPersonas <= personas) {
			
			
			kmCoche = 0; 
			kmBus = 0; 
			kmBici = 0; 
			hPlancha = 0; 
			hOrdenador = 0; 
			hMovil = 0; 
			plancha = 0;
			actividad = 0;

			while (actividad != 7) {
				
				System.out.println("Escoge el menu de actividades (con numero)");
				System.out.println("1.Kilometros recorridos en coche"); 
				System.out.println("2.Kilometros recorridos en autobus");
				System.out.println("3.Kilometros recorridos en bicicleta ");
				System.out.println("4.Uso de la plancha");
				System.out.println("5.Uso del ordenador");
				System.out.println("6.Uso del móvil");
				System.out.println("7.Finalizar actividades del dia");
				
				actividad = Integer.parseInt(teclado.nextLine());
				
				if (actividad < 1 || actividad > 7) {
					System.out.println("Error: elige entre 1 y 7");
				}
				
				
				switch(actividad)
				{
				case 1:
					System.out.println("¿Cuantos kilometros has recorrido en coche?");
					kmCoche = Float.parseFloat(teclado.nextLine());
					
					while (kmCoche < 0) {
						System.out.println("Error");
						System.out.println("¿Cuantos kilometros has recorrido en coche?");
						kmCoche = Float.parseFloat(teclado.nextLine());						
					}
					kmCoche = kmCoche * 0.21f;
					System.out.println(kmCoche + " kg CO2");
					break;
					
				case 2:
					System.out.println("¿Cuantos kilometros has recorrido en autobus?");
					kmBus = Float.parseFloat(teclado.nextLine());
					
					while (kmBus < 0) {
						System.out.println("Error");
						System.out.println("¿Cuantos kilometros has recorrido en bus?");
						kmBus = Float.parseFloat(teclado.nextLine());						
					}
					kmBus = kmBus * 0.10f;
					System.out.println(kmBus + " kg CO2");
					break;
					
				case 3:
					System.out.println("¿Cuantos kilometros has recorrido en bicicleta?");
					kmBici = Float.parseFloat(teclado.nextLine());
					
					while (kmBici < 0) {
						System.out.println("Error");
						System.out.println("¿Cuantos kilometros has recorrido en bici?");
						kmBici = Float.parseFloat(teclado.nextLine());						
					}
					kmBici = kmBici * 0f; 
					System.out.println(kmBici + " kg CO2");
					break;
					
				case 4:
					System.out.println("¿Utilizas plancha (0 - no/1 - si)?");
					plancha = Integer.parseInt(teclado.nextLine());
					
					while (plancha < 0 || plancha > 1) {
						System.out.println("Error, mete 1 o 0");
						System.out.println("¿Utilizas plancha (0 - no/1 - si)?");
						plancha = Integer.parseInt(teclado.nextLine());
					}
					
					if(plancha == 1) {
						System.out.println("Cuantas horas la usaste?");
						hPlancha = Float.parseFloat(teclado.nextLine());
						
						while (hPlancha < 0) {
							System.out.println("Error");
							System.out.println("Cuantas horas la usaste?");
							hPlancha = Float.parseFloat(teclado.nextLine());
						}
						hPlancha = hPlancha * 0.7f;
						System.out.println(hPlancha + " kg CO2");
					} 
					
					else if (plancha == 0) {
						System.out.println("No usaste la plancha");
					}
					break; 
					
				case 5:
					System.out.println("¿Cuantas horas usas el ordenador?");
					hOrdenador = Float.parseFloat(teclado.nextLine());
					
					while (hOrdenador < 0) {
						System.out.println("Error");
						System.out.println("¿Cuantas hora usas el ordenador?");
						hOrdenador = Float.parseFloat(teclado.nextLine());						
					}
					hOrdenador = hOrdenador * 0.08f;
					System.out.println(hOrdenador + " kg CO2");
					break;
					
				case 6:
					System.out.println("¿Cuantas horas usas el movil?");
					hMovil = Float.parseFloat(teclado.nextLine());
					
					while (hMovil < 0) {
						System.out.println("Error");
						System.out.println("¿Cuantas hora usas el movil?");
						hMovil = Float.parseFloat(teclado.nextLine());						
					}
					hMovil = hMovil * 0.02f;
					System.out.println(hMovil + " kg CO2");
					break;
					
				case 7:
					System.out.println("Fin de actividades");
					break;
				}
			}
			
			suma = kmCoche + kmBus + kmBici + hPlancha + hOrdenador + hMovil;
			System.out.println("CO2 total por persona: " + suma + " kg\n");
			
			totalGrupo = totalGrupo + suma; 
			contadorPersonas++; 
		}
		
		System.out.println("Total CO2 del grupo: " + totalGrupo + " kg");
		teclado.close();
	}
}
