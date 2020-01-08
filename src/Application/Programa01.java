package Application;

import java.util.Locale;
import java.util.Scanner;

import entites.Produtos;

public class Programa01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos product = new Produtos();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product.name+", "+product.price+", "+product.quantity);
		
		sc.close();
	}
	
}
