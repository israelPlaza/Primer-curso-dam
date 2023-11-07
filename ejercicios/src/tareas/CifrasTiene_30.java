package tareas;
import java.util.Scanner;
public class CifrasTiene_30 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1;
	System.out.println("Escribe el número: ");
	num1= sc.nextInt();
		if (num1>=0 ||num1<999) {
			if(num1==0 || num1<10) {
				System.out.println("tienes una cifra");
			}
			else if (num1>=10 || num1>100) {
				System.out.println("Tú número tiene dos cifras");
			}
			else if (num1>=100 || num1<999) {
				System.out.println("Tú número tiene tres cifras");
			}
			
		}else {
			System.out.println("Adiós");
		}
		}
}
