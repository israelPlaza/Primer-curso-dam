package tareas;
import java.util.Scanner;
public class Ampliacion_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int total=0;
	String dato;
	System.out.println("____CUESTIONARIO___");
	System.out.println("¿Qué tipo de dato es más preciso?");
	System.out.println("a) int\nb) double \nc) float");
	System.out.print("respuesta: ");
	dato=sc.next();
	
	if (dato.equalsIgnoreCase("b")) {
		total++;
	}
	System.out.println("¿Cuál es el mejor IDE?");
	System.out.println("a) Eclipse\nb) Netbeans \nc) Intellij");
	System.out.print("respuesta: ");
	dato=sc.next();
	if (dato.equalsIgnoreCase("c")) {
		total++;
	}
	System.out.println("¿Cuál de las siguientes memorias es volátil?");
	System.out.println("a) RAM\nb) ROM \nc) EPROM");
	System.out.print("respuesta: ");
	dato=sc.next();
	if (dato.equalsIgnoreCase("a")) {
		total++;
	}
	
}
}
