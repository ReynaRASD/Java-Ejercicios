package ejercicio;
import java.util.Scanner;

public class Triangulo {
	
	// Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido
	public static void main(String[] args) {
		System.out.println("Se te pediran 3 angulos.");
		
		System.out.println("Introduce primer angulo: ");
		Scanner ang1 = new Scanner(System.in);
		int angulo1 = ang1.nextInt();
		
		System.out.println("Introduce segundo angulo: ");
		Scanner ang2 = new Scanner(System.in);
		int angulo2 = ang2.nextInt();
		
		System.out.println("Introduce tercer angulo: ");
		Scanner ang3 = new Scanner(System.in);
		int angulo3 = ang3.nextInt();
		
		int suma = angulo1 + angulo2 + angulo3;
		
		if (suma == 180) {
			System.out.println("Es un triangulo.");
			if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
				System.out.println("Exactamente un triangulo Rectangulo.");
			} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
				System.out.println("Exactamente un triangulo Acutangulo.");
			} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
				System.out.println("Exactamente un triangulo Obtusangulo.");
			}
		} else {
			System.out.println("No es un triangulo.");
		}
		
	}
}
