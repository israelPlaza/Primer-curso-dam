package arrays;
import java.util.*;
public class Ejercicio_70 {
public static void main(String[] args) {
	
	int numeroArray=0,llenado=0;
	Scanner sc =new Scanner(System.in);
	
	System.out.println("¿ De qué tamaño quieres la cadena ? ");
	numeroArray=sc.nextInt();
	System.out.println("¿ Con qué número lo quieres rellenar? ");
	llenado=sc.nextInt();
	
	int[] numeros =new int[numeroArray];
	
	for (int i = 0; i < numeros.length; i++) {
		numeros[i]=llenado;
	}
	
	for (int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i]);
		System.out.print(" : ");
	}
	
	
}
}
