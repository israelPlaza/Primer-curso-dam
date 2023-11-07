package funciones;
import java.util.*;
public class Ejercicio_75 {

	public static int decimal(float valor1) {
		int resultado=(int)valor1;
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float valor1;
			System.out.println("Escribe tu número: ");
			valor1=sc.nextFloat();
			System.out.println(decimal(valor1));
	}
	
}
