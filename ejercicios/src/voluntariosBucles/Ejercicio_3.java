package voluntariosBucles;

import java.util.Scanner;

public class Ejercicio_3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int numero=0,factorial=1;
	
	System.out.println("Escribe el numero: ");
	numero=sc.nextInt();
	
	for (int i = 1; i <=numero ; i++) {

		factorial=factorial*i;
		
	}
	
		System.out.println((numero+"!")+" = "+factorial);
	
	
	
	}
}
