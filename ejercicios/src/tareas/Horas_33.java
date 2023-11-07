package tareas;
import java.util.Scanner;

public class Horas_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Escribe la hora: ");
		num1= sc.nextInt();
			if (num1>=1 && num1<=24) {
				if(num1== 6|| num1<=12) {
					System.out.println("Buenos dias");
				}
				else if (num1==13 || num1<=20) {
					System.out.println("Buenas tardes");
				}
				else if (num1>=21 || num1<=24) {
					System.out.println("Buenas Noches");
				}
				
			}else {
				System.err.println("ERROR");
			}
			sc.close();
			}
}
