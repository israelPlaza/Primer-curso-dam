package arrays;


public class Ejercicio_73 {
public static void main(String[] args) {
	int[] normal =new int[100];
	int[] reverso =new  int[100];
	int cont=1;
		for (int i = 0; i < normal.length; i++) {
			
			normal[i]=cont++;
		}
		for (int i = 0; i < normal.length; i++) {
			reverso[i]=normal[i];
		}
		
		for (int i = 0; i < normal.length; i++) {
			System.out.print(normal[i]);
			System.out.print(" : ");
		}
	System.out.println(" ");
	for (int i =normal.length-1; i>=0; i--) {
		System.out.print(reverso[i]);
		System.out.print(" : ");
	}
	
	
}
}
