package arrays;

import java.util.Scanner;

public class Ejercicio_71 {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	int principio=0, hasta=0;
	
	System.out.println("Escribe el primer número: ");
	principio=sc.nextInt();	
	System.out.println("Escribe hasta que número: ");
	hasta=sc.nextInt();
	
	int resta=hasta-principio;
	int[] numeros =new int[resta];
	
		for (int i =0; i < numeros.length; i++) {
			numeros[i]=principio++;
		}
	
	
	for (int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i]+1);
		System.out.print(" : ");
	}
	
	
	
}
}
