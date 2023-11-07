package tareas;
import java.util.Scanner;

public class Ampliacion_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int total=0;
	String dato;
	System.out.println("____CUESTIONARIO___");
	System.out.println("¿Tu pareja está más inquieta?");
	System.out.println("a) si\nb) No ");
	System.out.print("respuesta: ");
	dato=sc.next();
	
	if (dato.equalsIgnoreCase("si")) {
		total=total+3;
	}
	System.out.println("¿Ha perdido interés en ti?");
	System.out.println("a) si\nb) No ");
	System.out.print("respuesta: ");
	dato=sc.next();
	
	if (dato.equalsIgnoreCase("si")) {
		total=total+3;
	}
	System.out.println("¿Te deja que mires la agenda del movil?");
	System.out.println("a) si\nb) No ");
	System.out.print("respuesta: ");
	dato=sc.next();
	
	if (dato.equalsIgnoreCase("si")) {
		total=total+3;
	}
	System.out.println("¿A aumentado su gasto en vestuario?");
	System.out.println("a) si\nb) No ");
	System.out.print("respuesta: ");
	dato=sc.next();
	
	if (dato.equalsIgnoreCase("si")) {
		total=total+3;
	}
	
	if (total==0 && total<=3) {
		System.out.println("ENHORABUENA");
	}else if (total>3 && total<=6) {
		System.out.println("Algo de peligro");
	}else if (total>6) {
		System.out.println("INFIEL");
	}
	System.out.println(total);
}
}
