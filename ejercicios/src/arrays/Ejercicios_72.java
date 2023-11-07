package arrays;

import java.util.Scanner;
import java.util.*;
public class Ejercicios_72 {
public static void main(String[] args) {
	
	int [] arrayAleatorio= new int[100];
	int numeroR=0,contador=0;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("Escribe un valor entre (0 y 50) :");
		numeroR=sc.nextInt();	
	} while (numeroR>=0 || numeroR<=50);
	
	
	for (int i = 0; i < arrayAleatorio.length; i++) {
		
		arrayAleatorio[i]=(int) (Math.random()*1000+1);
		System.out.print(arrayAleatorio[i]);
		System.out.print(" ");
		
	 }
	
		for (int i = 0; i < arrayAleatorio.length; i++) {
			if (arrayAleatorio[i]==numeroR) {
				 contador=contador++;
			}else if (arrayAleatorio[i]!=numeroR) {
				
			}
		}	
	System.out.println(" ");
	System.err.println("Ha coincidido = "+contador);
	
}
}
