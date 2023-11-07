package tareas;
import java.util.Scanner;

public class media_47 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	float num1, suma=0, maxsum=0;
	
	
	
	do {
		System.out.println("Escribe el n�mero");
		num1=sc.nextFloat();
		suma+=num1;
		maxsum++;		
	} while (num1>0);
	suma=suma-num1;
	maxsum--;
	
	System.out.println("La media es: "+(suma/maxsum));
}
}
