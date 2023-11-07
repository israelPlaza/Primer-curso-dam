package tareas;
import java.util.Scanner;

public class tabla_46 {
public static void main(String[] args) {
	
	int num,aux;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Escribe el n�meo de la tabla que quieres");
	num=sc.nextInt();
	aux=num;
	for (int i = 1; i<11; i++) {
		System.out.println(aux+" "+"x "+i+" "+"="+(num*i));
		
	}
	
}
}
