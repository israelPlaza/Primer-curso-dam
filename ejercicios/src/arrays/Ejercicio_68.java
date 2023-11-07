package arrays;
import java.util.*;
public class Ejercicio_68 {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int[] numeros =new int[10];
	int suma=0;
  	int contenedor=0;
  	int contador=1;
  	
  		for (int i = 0; i < numeros.length; i++) {
  			System.out.println("Escriba el "+contador);
  			contenedor= sc.nextInt();
  			numeros[i]=contenedor;
  			suma=suma+numeros[i];
  			contador++;
  		}

	System.out.println("");
	
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]);
				System.out.print(" ");
			}
	System.out.println("= La suma es: "+suma);	
}
}
