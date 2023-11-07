package arrays;

public class Ejercicio_67 {
public static void main(String[] args) {
	int [] arrayAleatorio= new int[50];
	int menor=999,mayor=0;
	
	for (int i = 0; i < arrayAleatorio.length; i++) {
		
		arrayAleatorio[i]=(int) (Math.random()*1000+1);
		System.out.print(arrayAleatorio[i]);
		System.out.print(" ");
		menor=Math.min(arrayAleatorio[i], menor);
		mayor=Math.max(arrayAleatorio[i], mayor);
	}
	
	
	System.out.println(" ");
	System.err.println("El número mayor es: "+mayor+" el menor es: "+menor);
}
}
