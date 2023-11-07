package tareas;
import java.util.Scanner;

public class DiaSemana_34 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1;
	System.out.println("Escribe el número ");
	num1= sc.nextInt();
	
	switch (num1) {
	case 1: 
	 System.out.println("Lunes");
		break;
	case 2: 
		 System.out.println("Martes");
			break;
	case 3: 
		 System.out.println("Miercoles");
			break;
	case 4: 
		 System.out.println("Jueves");
			break;
	case 5: 
		 System.out.println("Viernes");
			break;
	case 6: 
		 System.out.println("Sábado");
			break;
	case 7: 
		 System.out.println("Domingo");
			break;	
	
	default:
		System.err.println("ERROR");
	}
}
}
