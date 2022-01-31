package ejercicio;
import java.util.Scanner;

public class Cuenta {
	public static void main(String[] args) {
		// // solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000 no tiene descuento.
		// sila cuenta es de 1001 - 4999 tiene 10%
		// si la cuenta es de 5001 a 9999 tiene 20%
		// si la copra es de 10000 o más tiene 30%
		
		System.out.println("Dame el total de tu compra: ");
		Scanner buy = new Scanner(System.in);
		double compra = buy.nextDouble();
		
		if (compra < 1000) {
			System.out.println("No tiene descuento.");
			System.out.println("Gran total: " + compra);
			
		} else if (compra < 5000 && compra > 1000) {
			System.out.println("Tiene 10% de descuento.");
			double descuento10= compra * 0.1;
			double total10 = compra - descuento10;
			System.out.println("Su descuento es de: " + descuento10);
			System.out.println("Gran total: " + total10);
			
		} else if (compra < 10000 && compra > 5000) {
			System.out.println("Tiene 20% de descuento.");
			double descuento20= compra * 0.2;
			double total20 = compra - descuento20;
			System.out.println("Su descuento es de: " + descuento20);
			System.out.println("Gran total: " + total20);
			
		} else if (compra >= 10000) {
			System.out.println("Tiene 30% de descuento.");
			double descuento30= compra * 0.3;
			double total30 = compra - descuento30;
			System.out.println("Su descuento es de: " + descuento30);
			System.out.println("Gran total: " + total30);
			
		} else {
			System.out.println("Dato no valido.");
		}
		
		
	}
	
	
}
