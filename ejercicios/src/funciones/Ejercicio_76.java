package funciones;

import java.util.Scanner;

public class Ejercicio_76 {
	public static boolean mayorEdad(int edad) {
		
		if (edad >=18) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int edad;
		 System.out.println("Escribe tú edad: ");
			edad=sc.nextInt();
		 System.out.println(mayorEdad(edad));
		 
	}
	
	
	
	
	
	
}
