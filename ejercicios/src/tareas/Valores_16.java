package tareas;

public class Valores_16 {
	public static void main(String[] args) {
		
		int salario=1000,impuestos=134,segSocial=222;
		
		System.out.println(segSocial >impuestos);
		System.out.println((segSocial + impuestos)>salario/2);
		System.out.println((segSocial >impuestos)&&(segSocial + impuestos)>salario/2);
		System.out.println((impuestos <200)||(segSocial<200)||(salario<500));
		System.out.println((impuestos<200 | segSocial<200)& salario>1500);
		
		
		
		
		
	}

}
