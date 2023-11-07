package voluntariosBucles;

public class Ejercicio_5 {
public static void main(String[] args) {
	
	int tirada=1;
	int dado1=0, dado2=1;
	
		
		while (dado1!=dado2) {
		
			System.out.println("Tirada número : "+tirada);
		
			dado1 =(int) (1 + Math.random()*(6-1+1));
			dado2 =(int) (1 + Math.random()*(6-1+1));
			System.out.println(dado1);
			System.out.println(dado2);
			tirada++;
				}
	
	
	
	}
}
