import java.util.Scanner;

public class Atividade01_Questao19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);               
		int A, B;                                               
		
		System.out.println("Informe um valor inteiro para A:"); 
		A = entrada.nextInt();                                 

		System.out.println("Informe um valor inteiro para B:"); 
		B = entrada.nextInt();                            
		
		if(A>10) {
			System.out.println("A > 10");
		}else {
			System.out.println("A >= 10");
		}
		
		if(A+B==20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("A + B != 20");
		}
		
		entrada.close();
	}

}