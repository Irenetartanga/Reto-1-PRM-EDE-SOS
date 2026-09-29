package retoPrincipal;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		 // --- VALIDACIÓN: Número de usuarios ---
        int numUsuarios = -1;
        while (numUsuarios < 0) {
            System.out.print("¿Cuántos usuarios quieres registrar? ");
            numUsuarios = teclado.nextInt();
            if (numUsuarios < 0) {
                System.out.println("Error: El número de usuarios no puede ser negativo.");
            }
        }

        int usuario = 1;
        double mediaminutos;
        int totalMinutos = 0;
        int minutos = 0;

        int mejorusuario = -1;
        int totaltotalminutos = -1;

        int acumuladorMinutosGlobales = 0;
        int acumuladorDiasGlobales = 0;

        // Bucle principal: recorre cada usuario
        while (usuario <= numUsuarios) {
            System.out.println("\nUsuario " + usuario);
            
            // --- VALIDACIÓN: Días de gimnasio ---
            int dias = -1;
            while (dias < 0) {
                System.out.print("¿Cuántos días ha ido al gimnasio? ");
                dias = teclado.nextInt();
                if (dias < 0) {
                    System.out.println("Error: El número de días no puede ser negativo.");
                }
            }

            int dia = 1;
            minutos = 0;
            totalMinutos = 0;
            int dias60 = 0;

            // Bucle secundario: pide los minutos para cada día
            while (dia <= dias) {
                
                // --- VALIDACIÓN: Minutos por día ---
                minutos = -1;
                while (minutos < 0) {
                    System.out.print("¿Cuántos minutos ha hecho ejercicio el día " + dia + "? ");
                    minutos = teclado.nextInt();
                    if (minutos < 0) {
                        System.out.println("Error: Los minutos no pueden ser negativos.");
                    }
                }

                totalMinutos = totalMinutos + minutos;

                if (minutos > 60) {
                    dias60++;
                }
                dia++;
            }

            // Cálculo de la media (solo si los días son mayores a cero para evitar división por cero)
            if (dias > 0) {
                mediaminutos = (double) totalMinutos / dias;
            } else {
                mediaminutos = 0;
            }

            if (totalMinutos > totaltotalminutos) {
                totaltotalminutos = totalMinutos;
                mejorusuario = usuario;
            }

            acumuladorMinutosGlobales += totalMinutos;
            acumuladorDiasGlobales += dias;

            // --- RESULTADOS INDIVIDUALES DEL USUARIO ---
            System.out.println("Días con más de 60 minutos de ejercicio: " + dias60);
            System.out.println("El usuario " + usuario + " ha hecho " + totalMinutos + " minutos esta semana.");
            System.out.println("Media de minutos por día: " + mediaminutos);

            if (totalMinutos > 300) {
                System.out.println("¡Has alcanzado tu objetivo semanal!");
            }
            usuario++;
        }

        // --- RESULTADOS GLOBALES ---
        if (numUsuarios > 0) {
            System.out.println("\nUsuario que realizó más minutos de ejercicio: Usuario " + mejorusuario + " (" + totaltotalminutos + " min)");
            System.out.println("Número total de minutos realizados entre todos: " + acumuladorMinutosGlobales + " minutos");
            System.out.println("Número total de días de entrenamiento registrados: " + acumuladorDiasGlobales + " días");
        } else {
            System.out.println("\nNo se registraron usuarios.");
        }
        
        teclado.close();
    }
}