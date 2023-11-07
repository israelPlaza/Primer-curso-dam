package arrays;

import java.util.Scanner;

public class Ejercicio_69 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] numeros =new int[8];
	int sumaPos=0;
	int sumaNeg=0;
	int contenedor=0;
  	int contador=1;
  	
  		for (int i = 0; i < numeros.length; i++) {
  			System.out.println("Escriba el "+contador);
  			contenedor= sc.nextInt();
  			numeros[i]=contenedor;
  			contador++;
  		}
  		
  		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>0) {
				sumaPos=sumaPos+numeros[i];	
			}else if (numeros[i]<0) {
				sumaNeg=sumaNeg+numeros[i];
				}
  		}
  		
  		

	System.out.println("");
	
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]);
				System.out.print(" ");
			}
			System.out.println("");
			System.out.println("La suma de positivos es: "+sumaPos);	
			System.out.println("La suma de negativos es: "+sumaNeg);	
}
}
