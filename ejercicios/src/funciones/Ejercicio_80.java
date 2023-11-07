package funciones;
import java.util.*;
public class Ejercicio_80 {

	public static void calendario (int dia,int mes, int anio) {
		
		if ( dia<=31 && dia>=1 && mes>0 && mes <=12 && anio>0) {
			
			System.out.println("La fecha es: "+dia+" / "+mes+" / "+anio); 	
					return;		
		} else {
			System.err.println("la fecha esta mal");
			return;
		}
		
	}
	
	
	
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	int dia=0,mes=0,anio=0;
	
	System.err.println("Escribe el día: ");
	dia=sc.nextInt();
	System.err.println("El mes: ");
	mes=sc.nextInt();
	System.err.println("El año:");
	anio=sc.nextInt();
	System.out.println("");
	
	calendario(dia, mes, anio);
	
	
	
	
	}	
}
