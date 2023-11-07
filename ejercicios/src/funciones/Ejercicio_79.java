package funciones;
import java.util.*;
public class Ejercicio_79 {
	
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro;
		perimetro=(2*ancho) + (2*alto);
		return perimetro;
	}
	public static double areaRectangulo(double ancho, double alto) {
		double area;
		area=ancho*alto;
		return area;
	}
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int ancho=0, alto=0;
	
		System.out.println("Escribe la altura del rectángulo");
		alto=sc.nextInt();
		System.out.println("Escribe la anchura del rectángulo");
		ancho=sc.nextInt();
		
		System.out.println("El área es: "+areaRectangulo(ancho, alto));
		System.out.println("El perímetro es: "+perimetroRectangulo(ancho, alto));
	}
}