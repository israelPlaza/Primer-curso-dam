package tareas;
import java.util.Scanner;

public class especial {
public static void main(String[] args) {
	int num, contador=0;
	int aleatorio = (int) (1 + Math.random() * (100-1+1));
	
	Scanner sc =new Scanner(System.in);

	System.out.println(aleatorio);
		do{
		contador++;
		System.out.println();
		System.out.println("Adivina el numero: ");
		num = sc.nextInt(); 
		if (aleatorio>num) {
			System.out.println("el numero es mayor");
		}else if  (aleatorio<num) {
			System.out.println("el numero es menor");
		}
	}while (num!=aleatorio);
	
		
		System.out.println("El n�mero es correcto,"+" "+"errores "+contador);
		
	
}
}
