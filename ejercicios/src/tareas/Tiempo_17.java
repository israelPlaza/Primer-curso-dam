package tareas;
import java.util.Scanner;

public class Tiempo_17 {
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
			int seg, min;
	        float hor;
			
	        System.out.print("Escriba sus segundos :");
	        seg= sc.nextInt();
	        System.out.print("Su tiempo es :");
	        System.out.print(seg+" segundos  ");
	        System.out.print((seg/60)+" minutos  ");
	        min=seg/60;
	        System.out.print((min/60)+" horas");
	        
	        
	        sc.close();
	    }
	
}
