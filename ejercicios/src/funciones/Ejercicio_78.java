package funciones;


import java.util.Scanner;

public class Ejercicio_78 {
	public static float precioVenta(float precio) {
	float total;
	total= ((precio*21)/100)+precio;
	return total;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float precio;
		
		for (int i = 1; i <=5; i++) {
			System.out.println("( "+i+" )"+" indica el precio: ");
			precio=sc.nextFloat();
			System.out.println((i) +" precio es:"+ precioVenta(precio)+" €");
		}
		
	}
	
}
