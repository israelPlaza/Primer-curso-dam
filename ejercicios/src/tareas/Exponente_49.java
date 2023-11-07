package tareas;

import java.util.Scanner;

public class Exponente_49 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int modulo=0,exponente=0,numero=1;
		
			
		System.out.println("Escriba el módulo: ");
		modulo=sc.nextInt();
		System.out.println("Escriba el exponente: ");
		exponente=sc.nextInt();
		
			for (int i = 1; i<=exponente; i++) {
			numero=modulo*numero;	
			}
			System.out.println("");	
			System.out.println(numero);
 
 }
}
