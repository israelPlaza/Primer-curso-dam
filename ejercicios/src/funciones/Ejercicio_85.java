package funciones;
import java.util.*;
public class Ejercicio_85 {

public static int factorial (int numero) {
	int suma=numero;
	int aux = 0;
	for (int i = 0; i <numero; i++) {
		
	suma=numero*i;	

	}
	return aux;
	
}
	
public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	int numero=0;
	
	System.out.println("Escribe el número que quieras el factorial: ");
	numero=sc.nextInt();
	System.out.println(factorial(numero));

}		
}
