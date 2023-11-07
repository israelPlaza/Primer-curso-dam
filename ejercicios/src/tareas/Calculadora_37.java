package tareas;
import java.util.Scanner;

public class Calculadora_37 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1,num2,menu;
	System.out.println("Escribe el número para calcular: ");
	num1= sc.nextInt();
	System.out.println("Escribe el otro número para calcular: ");
	num2= sc.nextInt();
	System.out.println("Si quieres sumar marca el 1");
	System.out.println("Si quieres restar marca el 2");
	System.out.println("Si quieres multiplicar marca el 3");
	System.out.println("Si quieres dividr marca el 4");
	menu=sc.nextInt();
	 
	switch (menu) {
	case 1: 
	 System.out.println((num1+num2));
		break;
	case 2: 
		 System.out.println((num1-num2));
			break;
	case 3: 
		 System.out.println((num1*num2));
			break;
	case 4: 
		 System.out.println((num1/num2));
			break;
	}	
	sc.close();
}
}
