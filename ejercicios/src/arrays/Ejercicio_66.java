package arrays;
import java.util.Scanner;
public class Ejercicio_66 {
public static void main(String[] args) {
	int numero=0;
	numero=(int) (Math.random() * 10+1);
	int acierto=0, contador=1;
	Scanner sc=new Scanner(System.in);
	int[] miArray =new int[5];
	for (int i = 0; i <miArray.length; i++) {
		System.out.println("Intento: "+(contador++));
		System.out.println("Escribe el numero: ");
		acierto=sc.nextInt();
		 miArray[i]=acierto;
		
		if (acierto!=numero) {
			System.out.println("Has fallado");
		}else {
			System.out.println("Has ACERTADO");
			break;
		}
		
	}
	for (int i = 0; i < miArray.length; i++) {
		System.out.print(miArray[i]);
		System.out.print(" ");
	}
	System.out.println("");
	System.out.println("El número era: "+numero);
	
}
}
