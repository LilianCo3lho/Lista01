import java.util.Scanner;

public class Atividade01_Questao17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);               
		int A, B;                                               
		
		System.out.println("Informe um valor inteiro para A:"); 
		A = entrada.nextInt();                                 

		System.out.println("Informe um valor inteiro para B:"); 
		B = entrada.nextInt();                            
		
		if(A>10 || A + B == 20) {
			System.out.println("numero valido");
			
		}else if(A == B) {
			System.out.println("A eh igual a B");
		
		}else if(A != 10 && B != 10 && A < 10) {
			System.out.println("A eh menor que 10");
			
		}else {
			System.out.println("numero nao valido");
		}
		
		entrada.close();
	}

}

