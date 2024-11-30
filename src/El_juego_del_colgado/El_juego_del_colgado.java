package El_juego_del_colgado;


import java.util.Scanner;


public class El_juego_del_colgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creo un Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("¡Bienvenidos al juego del Colgado!");

		
		System.out.println("¿Cuántos jugadores van a jugar? (mínimo 2): ");
			int numJugadores = scanner.nextInt();
			scanner.nextLine();
		// Para validar que haya al menos 2 jugadores si hay menos se mostrara este while
		while (numJugadores < 2) {
			System.out.println("¡Debe haber al menos 2 jugadores! Inténtelo de nuevo:");
			numJugadores = scanner.nextInt();
			scanner.nextLine(); 
			
			}
		
		// Preguntar cuántas rondas quieren jugar
			System.out.println("¿Cuántas rondas quieren jugar?");
			int numRondas = scanner.nextInt();
			scanner.nextLine(); 
		
		// Array para almacenar los puntos de cada jugador
		int[] puntosJugadores = new int[numJugadores];
		// Bucle principal para las rondas
		for (int ronda = 1; ronda <= numRondas; ronda++) {
			System.out.println("Ronda " + ronda + " de " + numRondas);
			
		// Solicitar al administrador que ingrese la palabra secreta
			System.out.println(" Pon la palabra secreta para esta ronda:");
			
		String palabraSecreta = scanner.nextLine().toLowerCase(); 
		// Convertir a minúsculas para evitar problemas de comparación
		int longitudPalabra = palabraSecreta.length();
		
		
		// Crear un array para representar el estado de la palabra 
		//(los guiones bajos son para letras no adivinadas)
		char[] estadoPalabra = new char [longitudPalabra];
		
		for (int i = 0; i < longitudPalabra; i++) {
		estadoPalabra[i] = '_'; // Para ver que todas las posiciones están ocultas
		
		}
		// Array para almacenar los intentos restantes de cada jugador
		int[] intentosRestantes = new int[numJugadores];
			for (int i = 0; i < numJugadores; i++) {
				intentosRestantes[i] = 6; 
		// Para indicar el numero de intentos de los juigadores
		
		}
		
		// Variable para controlar si la palabra ya ha sido adivinada
		boolean palabraAdivinada = false;

		// Bucle mientras haya intentos restantes y no se haya adivinado la palabra
			while (!palabraAdivinada) {
			
		// Verificar si al menos un jugador tiene intentos restantes
		boolean hayIntentos = false;
		
		for (int intentos : intentosRestantes) {
			if (intentos > 0) {
		hayIntentos = true;
		break;
		
			}
		}
		
		// Si ningún jugador tiene intentos, salir del bucle
		if (!hayIntentos) break;
		
		// Turno de cada jugador
			for (int jugador = 0; jugador < numJugadores; jugador++) {
			
		
		// Solo permitir turno si el jugador tiene intentos restantes
			if (intentosRestantes[jugador] > 0 && !palabraAdivinada) {
			
		System.out.println("Jugador " + (jugador + 1) + ", es tu turno.");
		
		// Mostrar el estado de la palabra encadenada
		System.out.println("Palabra actual: " + String.valueOf(estadoPalabra)); 
		
		
		
		System.out.println("Intentos restantes: " + intentosRestantes[jugador]);
		
		System.out.print("Ingresa una letra: ");
		
		// Leer la letra y convertirla a minúscula
			char letra = scanner.nextLine().toLowerCase().charAt(0); 
		
		// Verificar si la letra ingresada está en la palabra secreta
		boolean acierto = false;
			
			for (int i = 0; i < longitudPalabra; i++) {
				if (palabraSecreta.charAt(i) == letra) {
		// Para remplazar el guión bajo con la letra adivinada
					estadoPalabra[i] = letra; 
					acierto = true;
			
				}
			}
			

		// Mensaje según si el jugador ha hacertado o fallado
			if (acierto) { 
				
				System.out.println("¡Correcto!");
			}
			
		} else {
						
		}
			
		System.out.println("Letra incorrecta.");
		// Restarle un intento
		intentosRestantes[jugador]--; 
			
			
			
		// Comrobar si la palabra ha sido adivinada	
		if (String.valueOf(estadoPalabra).equals(palabraSecreta)) {
		palabraAdivinada = true; // Marcar que la palabra fue adivinada
		puntosJugadores[jugador]++; // Incrementar los puntos del jugador
		
		System.out.println("¡Felicidades, Jugador " + (jugador + 1) + "! Has adivinado la palabra.");
			break; 
			// Para salir del bucle de turnos
		
			
						}
					}
				}
			
		// Si nadie ha adivinado la palabra, la mostrara al final de la ronda la palabra
		//secreta para que los jugadores puedan saber cual era la palabra	
		if (!palabraAdivinada) {
		System.out.println("Nadie adivinó la palabra. Era: " + palabraSecreta);
			}
		}

		// Se muestra la puntuacion final de todos los jugadores
			System.out.println("Puntajes finales:");
			
		for (int i = 0; i < numJugadores; i++) {
		System.out.println("Jugador " + (i + 1) + ": " + puntosJugadores[i] + " puntos.");
		
		}

		// Para saber el ganador final
		int maxPuntos = 0;
		int ganador = -1;
		
		for (int i = 0; i < numJugadores; i++) {
			if (puntosJugadores[i] > maxPuntos) {
				maxPuntos = puntosJugadores[i];
				ganador = i; 
		// Guardar el índice del jugador con más puntos
		
			}
		}
		
		// Para mostrar al ganador o decir que no hay un ganador
		if (ganador != -1) {
			System.out.println("¡El ganador final es el Jugador " + (ganador + 1) + " con " + maxPuntos + " puntos!");
			
			} else {
				
			System.out.println("No hay un ganador en este juego.");
			
					}
				}

			}
		
		
	


