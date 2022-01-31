package ejercicio;
import java.util.Scanner;

public class Calculadora {

	/*
	   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
	   * 1) Suma
	   * 2) Resta
	   * 3) División
	   * 4) Multiplicación
	   * 
	   * y despues imprimir el resultado
	*/

	public static void main(String[] args) {
		
		System.out.println("Piensa en dos numeros.");
		System.out.println("Dame el primer numero: ");
		Scanner num1 = new Scanner(System.in);
		double numero1 = num1.nextDouble();
		
		System.out.println("Dame el segundo numero: ");
		Scanner num2 = new Scanner(System.in);
		double numero2 = num2.nextDouble();
		
		System.out.println("Elige la operacion que deseas realizar.");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		
		System.out.println("Escribe la operacion: ");
		Scanner op = new Scanner(System.in);
		String operacion = op.nextLine();
		
		switch(operacion.toLowerCase()) {
		
		case "suma":
			double suma = numero1 + numero2;
			System.out.println("El resultado de la Suma es: " + numero1 + " + " + numero2 + " = " + suma);
			break;
		
		case "resta":
			double resta = numero1 - numero2;
			System.out.println("El resultado de la Resta es: " + numero1 + " - " + numero2 + " = " + resta);
			break;
		
		case "multiplicacion":
			double multi = numero1 * numero2;
			System.out.println("El resultado de la Multiplicacion es: " + numero1 + " x " + numero2 + " = " + multi);
			break;
		
		case "division":
			double div = numero1 / numero2;
			System.out.println("El resultado de la Division es: " + numero1 + " / " + numero2 + " = " + div);
			break;
		default:
			System.out.println("Error. Vuelve a intentarlo.");
		}
		
		
	}
	
	
}
