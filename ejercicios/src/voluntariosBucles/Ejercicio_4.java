package voluntariosBucles;



public class Ejercicio_4 {
	public static void main(String[] args) {
		
		double maximo=0,minimo=199;
		int aleatorio=0;
		
		for (int i = 1; i <=50; i++) {

			aleatorio = (int) (100 + Math.random() * (199-100+1));
			System.out.println(aleatorio);
			
			maximo = Math.max(maximo, aleatorio);
			minimo = Math.min(minimo, aleatorio);
		
		}
		
				System.out.println("Número máximo es: "+maximo);
				System.out.println("Número mínimo es: "+minimo);
				System.out.println("La media  es: "+(maximo+minimo)/2);
	}
}
