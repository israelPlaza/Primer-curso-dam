package voluntariosBucles;

import java.util.Scanner;

public class EjercicioL_1 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int cantidad=0;
	final char letra='*';
	
	System.out.println("Escribe el tamaño de tu letra L : ");
	cantidad=sc.nextInt();
	
	for (int i = 2; i <=cantidad; i++) {
		System.out.println(letra);
		}
		for (int i = 1; i <= cantidad/2; i++) {
			System.out.print(letra);
			
			}
		System.out.print("*");
	}
}
