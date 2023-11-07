package funciones;

import java.util.Scanner;

public class Ejercicios_77 {
	public static int minimo(int num_1,int num_2) {
		int min;
		if (num_1>num_2) {
			min=num_2;
			return min;
		}else {
			min=num_1;
			return min;
		}
		
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int num_1, num_2;
	
	System.out.println("Escribe el primer número: ");
	num_1=sc.nextInt();
	System.out.println("Escribe el segundo  número: ");
	num_2=sc.nextInt();
	System.out.println("El número menor es: "+(minimo(num_1,num_2)));
	
	}
}
