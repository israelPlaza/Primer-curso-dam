package tareas;
import java.util.Scanner;

public class Primo_50 {
public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	int numero=0,aux=0;
	
	System.out.println("Escribe un número para saber si es primo: ");
	numero=sc.nextInt();
	
	aux=numero%1;
	
	if (aux==0) {
		System.out.println("Tú número es primo");
	}else {
		System.out.println("Tú número no es primo");
		}
	}
}
