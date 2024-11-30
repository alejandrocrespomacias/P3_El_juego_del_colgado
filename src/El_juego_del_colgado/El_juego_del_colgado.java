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
		
		
		
		char[] estadoPalabra = new char [longitudPalabra];
		
		for (int i = 0; i < longitudPalabra; i++) {
		estadoPalabra[i] = '_'; 
		
		}
		
		int[] intentosRestantes = new int[numJugadores];
		for (int i = 0; i < numJugadores; i++) {
		intentosRestantes[i] = 6; 
		// Para indicar el numero de intentos de los juigadores
		
		}
		
		
		boolean palabraAdivinada = false;

		
		while (!palabraAdivinada) {
			
		
		boolean hayIntentos = false;
		
		for (int intentos : intentosRestantes) {
		if (intentos > 0) {
		hayIntentos = true;
		break;
		
			}
		}
		
		
		if (!hayIntentos) break;

			for (int jugador = 0; jugador < numJugadores; jugador++) {
			
		
			
			if (intentosRestantes[jugador] > 0 && !palabraAdivinada) {
			
		System.out.println("Jugador " + (jugador + 1) + ", es tu turno.");
		
		System.out.println("Palabra actual: " + String.valueOf(estadoPalabra)); 
		
		
		
		System.out.println("Intentos restantes: " + intentosRestantes[jugador]);
		
		System.out.print("Ingresa una letra: ");
		
			char letra = scanner.nextLine().toLowerCase().charAt(0); 
		
		
		boolean acierto = false;
			
			for (int i = 0; i < longitudPalabra; i++) {
				if (palabraSecreta.charAt(i) == letra) {
					estadoPalabra[i] = letra; 
					acierto = true;
			
				}
			}
			

			
			if (acierto) { 
				
				System.out.println("¡Correcto!");
			}
			
		} else {
						
		}
			
		System.out.println("Letra incorrecta.");
		intentosRestantes[jugador]--; 
			
			}
			
			
		if (String.valueOf(estadoPalabra).equals(palabraSecreta)) {
		palabraAdivinada = true; 
		puntosJugadores[jugador]++; 
		
		System.out.println("¡Felicidades, Jugador " + (jugador + 1) + "! Has adivinado la palabra.");
			break; 
			
		
			
						}
					}
				}
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
		}
		
	}


