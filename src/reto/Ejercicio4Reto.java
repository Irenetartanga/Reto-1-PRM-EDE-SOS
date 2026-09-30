package retoPrincipal;

import java.util.Scanner;

public class Ejercicio4Reto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numUsuarios = 0;
		int usuario = 1;
		int entradasAdulto = 0;
		int entradasInfantil = 0;
		int precioAdulto = 9;
		int precioInfantil = 6;
		int usuarioConMasEntradas = 0;
		int maxEntradas = 0;
		//	Variables para el usuario actual
		int precioTotal = 0;
		double descuento;
		int totalEntradas = 0;
		//	variables goblales que se acumulan
		int totalEntradasGlobal = 0;
		int totalAdultosGlobal = 0;
		int totalInfantilGlobal = 0;
		double precioGlobal = 0.0;
		System.out.print("¿Cuántos usuarios quieres registrar? ");
		numUsuarios = teclado.nextInt();
		//Esta es la validación para que no se puedan meter numeros negativos
		while (numUsuarios < 1) {
			System.out.println("Error: El número de usuarios no puede ser negativo.");
			System.out.print("¿Cuántos usuarios quieres registrar? ");
			numUsuarios = teclado.nextInt();
		}
		// Bucle principal: recorre cada usuario
		while (usuario <= numUsuarios) {
			System.out.println("\nUsuario " + usuario);
			System.out.println("¿cuantos son adultos?");
			entradasAdulto = teclado.nextInt();
			System.out.println("¿cuantos son niños?");
			entradasInfantil = teclado.nextInt();
			//	calculos del usuario actual
			totalEntradas = entradasAdulto + entradasInfantil;
			precioTotal = (entradasAdulto*precioAdulto) + (entradasInfantil*precioInfantil);
			if (totalEntradas > maxEntradas) {
				maxEntradas = totalEntradas;
				usuarioConMasEntradas = usuario;
			}
			//	acumulamos las entradas en el total
			totalEntradasGlobal += totalEntradas;
			totalAdultosGlobal += entradasAdulto;    			
			totalInfantilGlobal += entradasInfantil;
			//hacemos otro bucle para el descuento
			double precioFinalUsuario = 0;
			if (totalEntradas >=5) {
				precioFinalUsuario = precioTotal * 0.9;
				System.out.println("Precio total con descuento: " + precioFinalUsuario + " euros");
			}
			else {
				precioFinalUsuario = precioTotal;
				System.out.println("Precio total: " + precioTotal + " euros");
			}
			//	acumulamos el dinero de este usuario en el total lgobal
			precioGlobal += precioFinalUsuario;
			//aqui bateria de respuestas de cada usuario
			System.out.println("Entradas de adulto: " + entradasAdulto);
			System.out.println("Entradas de infantil: " + entradasInfantil);
			System.out.println("Número total de entradas compradas: " + totalEntradas);
			usuario ++;
		}
		//aqui bateria de respuestas globales (fuera del bucle)
		System.out.println("RESPUESTAS GLOBALES");
		System.out.println("Numero total de entradas de adulto: " + totalAdultosGlobal);
		System.out.println("Numero total de entradas infantiles: " + totalInfantilGlobal);
		System.out.println("Dinero total recaudado: " + precioGlobal);
		System.out.println("El usuario que más entradas compró fue el usuario " + usuarioConMasEntradas + " con " + maxEntradas + " entradas.");
		teclado.close();
	}
}

