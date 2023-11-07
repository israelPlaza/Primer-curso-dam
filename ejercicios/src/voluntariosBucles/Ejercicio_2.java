package voluntariosBucles;
import java.util.Scanner;

public class Ejercicio_2 {
public static void main(String[] args) {
	
	int numero=0,cambio=0, cifra=0;
	Scanner sc =new Scanner(System.in);
	
	
	System.out.println("Escribe un número : ");
	numero=sc.nextInt();
	String numCadena= String.valueOf(numero);

	
	
	while (numero > 0) {
         cifra = numero % 10;
        cambio = cambio * 10 + cifra;
        numero = numero / 10;
    }
    
    System.out.println("El número al revés es: " + cambio);
	     
	}
}
