package tareas;

import java.util.Scanner;
public class cuadrado_10 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int lado;
		
		
		System.out.print("Escribe el lado del cuadro: ");
		lado= sc.nextInt();
		System.out.println("El áre del cuadrado es: "+(lado*lado));
	}

}
