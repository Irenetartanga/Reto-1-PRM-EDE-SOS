package reto;
import java.util.Scanner;

public class Videojuegos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		// variables globales
		int totalpuntosglobal = 0;		// total de puntos de todos los jugadores
		int totalenemigosglobal = 0;	// total de enemigos de todos los jugadores
		int puntuacionmaxima = -1;		// mayor puntuacion
		String mejorjugador = "";		// nombre del mejor jugador
		int numerojugadores = 0;		// cuantos jugadores se registran

		// variables jugador
		String nombrejugador;			// nombre del jugador
		int numeropartidas = 0;			// numero de partidas
		int totalpuntos = 0;			// puntos de todas las partidas del jugador
		int totalenemigos = 0;			// enemigos de todas las partidas del jugador
		int puntuacionmedia = 0;		// media de puntos del jugador

		// para las partidas jugadas
		int partidajugada = 1;			// partida actual
		int puntospartida = 0;			// puntos de la partida actual
		int enemigospartida = 0;		// enemigos de la partida actual

		// para el bonus
		int bonuspuntos = 100;			// bonus de puntos
		int puntosparabonus = 0;		// puntos que se utilizan para calcular el bonus
		boolean terminar = false;		// para terminar el bucle del bonus

		System.out.println("¿Cuántos jugadores sois?");
		numerojugadores = teclado.nextInt();

		// para no poner numeros negativos
		while (numerojugadores <= 0) {
			System.out.print("Ingresa un número positivo mayor que 0: ");
			numerojugadores = teclado.nextInt();
		}

		// por cada jugador se va a repetir
		while (numerojugadores > 0) {
			numerojugadores--;

			// dar los valores del principio
			partidajugada = 1;
			totalpuntos = 0;
			totalenemigos = 0;

			// datos de cada jugador
			System.out.println("\n¿Cuál es tu nombre?");
			nombrejugador = teclado.next();

			System.out.println("¿Cuántas partidas has jugado?");
			numeropartidas = teclado.nextInt();

			// VALIDACIÓN: Evita partidas negativas o cero (evita error de división por cero más abajo)
			while (numeropartidas <= 0) {
				System.out.print("Debes haber jugado al menos 1 partida. Introduce de nuevo: ");
				numeropartidas = teclado.nextInt();
			}

			// datos por partida
			while (partidajugada <= numeropartidas) {
				System.out.println("¿Cuántos puntos has obtenido en la partida " + partidajugada + "?");
				puntospartida = teclado.nextInt();

				// VALIDACIÓN: Puntos no negativos ni cero
				while (puntospartida <= 0) {
					System.out.print("Los puntos deben ser mayores que 0. Introduce de nuevo: ");
					puntospartida = teclado.nextInt();
				}

				System.out.println("¿Cuántos enemigos has derrotado en la partida " + partidajugada + "?");
				enemigospartida = teclado.nextInt();

				// VALIDACIÓN: Enemigos no negativos ni cero
				while (enemigospartida <= 0) {
					System.out.print("Los enemigos eliminados deben ser mayores que 0. Introduce de nuevo: ");
					enemigospartida = teclado.nextInt();
				}

				// sumar los datos de la partida al total del jugador
				totalpuntos = totalpuntos + puntospartida;
				totalenemigos = totalenemigos + enemigospartida;
				partidajugada++;
			}

			// por cada 1000 puntos suma 100 puntos
			puntosparabonus = totalpuntos;
			terminar = false;
			while (terminar == false) {
				if (puntosparabonus >= 1000) {
					totalpuntos = totalpuntos + bonuspuntos;
					puntosparabonus = puntosparabonus - 1000;
				} else {
					terminar = true;
				}
			}

			// resultados por cada jugador
			System.out.println("\nResultados de " + nombrejugador + ":");
			System.out.println("Puntuación total (con bonus): " + totalpuntos);
			System.out.println("Enemigos derrotados: " + totalenemigos);
			puntuacionmedia = totalpuntos / numeropartidas;
			System.out.println("Puntuación media obtenida: " + puntuacionmedia);

			// sumar los resultados del jugador al total general
			totalpuntosglobal = totalpuntosglobal + totalpuntos;
			totalenemigosglobal = totalenemigosglobal + totalenemigos;

			// comprobar cual es el mejor jugador
			if (totalpuntos > puntuacionmaxima) {
				puntuacionmaxima = totalpuntos;
				mejorjugador = nombrejugador;
			}
		}

		// resultados de todos los jugadores
		System.out.println("\n--- RESULTADOS GLOBALES ---");
		System.out.println("El jugador con mayor puntuación es: " + mejorjugador + " con " + puntuacionmaxima + " puntos.");
		System.out.println("La puntuación total conseguida entre todos los jugadores: " + totalpuntosglobal);
		System.out.println("El número total de enemigos derrotados: " + totalenemigosglobal);
		teclado.close();
	}
}

