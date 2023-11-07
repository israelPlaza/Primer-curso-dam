package arrays;

import java.util.Iterator;

public class Ejercicio_65 {
public static void main(String[] args) {
	 int[] aleatorio = new int[20];
	 int[] par = new int[20];
	 int[] impar = new int[20];
	 int contPares=0;
	 int conImpar=19;
	 
	 	for (int i = 0; i < aleatorio.length; i++) {
	 		aleatorio[i]= (int) (Math.random() * 100+1);
	 		System.out.print(aleatorio[i]);
	 		System.out.print(" ");
		}
System.out.println();
	 	for (int i = 0; i < aleatorio.length; i++) {
	 		int numero= aleatorio[i];
	 		if (numero%2==0) {
	 			aleatorio[contPares]=numero;
				contPares++;
			} else {
				aleatorio[conImpar]=numero;
				conImpar--;
			
	 		}
	 		

	 	
}
	 	for (int i = 0; i < aleatorio.length; i++) {
	 		
	 		System.out.print(aleatorio[i]);
	 		System.out.print(" ");
		}
}
}
