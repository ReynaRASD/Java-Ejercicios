package ejercicio;

import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		
		//Pedir 3 numeros y determinar el mayor. 
		System.out.println("Se te pediran 3 numeros.");
		
		
		System.out.println("Introduce primer numero: ");
		Scanner num1 = new Scanner(System.in);
		int numero1 = num1.nextInt();
		
		System.out.println("Introduce segundo numero: ");
		Scanner num2 = new Scanner(System.in);
		int numero2 = num2.nextInt();
		
		System.out.println("Introduce tercer numero: ");
		Scanner num3 = new Scanner(System.in);
		int numero3 = num3.nextInt();
		
		if (numero1 > numero2 && numero1 > numero2) {
			System.out.println("El numero mayor es: " + numero1 + " que es el primero.");
			
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("El numero mayor es: " + numero2 + " que es el segundo.");
			
		} else if (numero3 > numero2 && numero3 > numero1) {
			System.out.println("El numero mayor es: " + numero3 + " que es el tercero.");
			
		} else {
			System.out.println("Vuelve a intentarlo con numeros diferentes.");
		}
		
		
	}
}
