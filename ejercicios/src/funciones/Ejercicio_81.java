package funciones;

import java.util.Scanner;

public class Ejercicio_81 {

	public static int multiplicar (int numero) {
		
		return numero;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int numero=0;
		
		System.out.println("Escribe la tabla que quieras repasar");
		numero=sc.nextInt();
		for (int i = 1; i<11; i++) {
			System.out.println(numero+" "+"x "+i+" "+"="+(multiplicar(numero)*i));
		}	
	}
}
