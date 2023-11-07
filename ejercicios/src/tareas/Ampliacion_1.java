package tareas;
import java.util.Scanner;

public class Ampliacion_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int salario,cuarenta=40,total=0;
	
	System.out.println("¿Cuál tú salario semanal?");
	salario=sc.nextInt();	
	
	if (salario <41) {
		total=(salario*12);
		
	}else if (salario >40) {
		total=((salario-cuarenta)*16)+salario;
	}
	System.out.println("Su salario semanal es: "+total+" €");
}
}
