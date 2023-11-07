package tareas;
import java.util.Scanner;
public class Entero_32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Escriba el número: ");
		num1=sc.nextInt();
		
		if (num1 >=1 && num1 <7) {
			if (num1==1) {
				System.out.println("Es Lunes");
			}
			else if (num1==2) {
				System.out.println("Es Martes");
			}
			else if (num1==3) {
				System.out.println("Es Miércoles");
			}
			else if (num1==4) {
				System.out.println("Es Jueves");
			}
			else if (num1==5) {
				System.out.println("Es Viernes");
			}
			else if (num1==6) {
				System.out.println("Es Sábado");
			}
			else if (num1==7) {
				System.out.println("Es Domingo");
			}
		}else {
			System.err.println("Es un ERROR");
		}
	
	}
}
