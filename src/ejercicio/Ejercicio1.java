/*
 * 
 Crear un nuevo proyecto llamado NumeroParImpar
crear el m�todo main
crear una funci�n que eval�e si un n�mero es par o impar (se puede usar el operador ternario)
Imprimir en terminal el resultado

*extra, investigar c�mo usar la clase Scanner en java.

 */
package ejercicio;
import java.util.Scanner;

public class Ejercicio1 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Ingresar un numero: ");
		numero = entrada.nextInt();
		
		if (numero % 2 == 0)
			
			System.out.println("Par");
		else
			System.out.println("Impar");
		
		String resultado = ((numero % 2 == 0) ? "Par" : "Impar");
		System.out.println("Hecho con otro procedimiento: " + resultado);
		
	}
}
