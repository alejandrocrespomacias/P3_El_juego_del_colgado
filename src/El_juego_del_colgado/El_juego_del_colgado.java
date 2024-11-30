package El_juego_del_colgado;

import java.util.Scanner;


public class El_juego_del_colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("¡Bienvenidos al juego del Colgado!");

		
		System.out.println("¿Cuántos jugadores van a jugar? (mínimo 2): ");
		int numJugadores = scanner.nextInt();
		scanner.nextLine();
		
		while (numJugadores < 2) {
			System.out.println("¡Debe haber al menos 2 jugadores! Inténtelo de nuevo:");
			numJugadores = scanner.nextInt();
			scanner.nextLine(); 
			
			}
		
		
		System.out.println("¿Cuántas rondas quieren jugar?");
		int numRondas = scanner.nextInt();
		scanner.nextLine(); 
		
		
		int[] puntosJugadores = new int[numJugadores];
		
		for (int ronda = 1; ronda <= numRondas; ronda++) {
			System.out.println("Ronda " + ronda + " de " + numRondas);
			
		
		System.out.println(" Pon la palabra secreta para esta ronda:");
		String palabraSecreta = scanner.nextLine().toLowerCase(); 
		
		int longitudPalabra = palabraSecreta.length();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
