import java.util.Scanner;
//Ana Lilian Sousa Coelho - 556697
public class Atividade01_Questao02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);               //criei um objeto scanner para ler oq o usuario digitar.
		int A, B;                                               //declarei duas variaveis int.

		System.out.println("Informe um valor inteiro para A:"); //pedi ao usuario que digite um numero inteiro para A.
		A = entrada.nextInt();                                  //A vai armazenar esse numero.

		System.out.println("Informe um valor inteiro para B:"); //pedi ao usuario que digite um numero inteiro para A.
		B = entrada.nextInt();   
		
		if(A<10){                                               //Se A for menor que 10
			System.out.println("A < 10");                       //Imprime "A < 10" 
		}else if(A+B==20) {                                     //Caso for falso e Se A mais B for 20 
			System.out.println("A + B == 20");                  //Imprime "A + B == 20"
		}else {                                                 //Caso nenhuma acima seja verdade
			System.out.println("numero nao valido");            //Imprime "numero nao valido"
		}
		entrada.close();                                        //fechar o objeto escanner para parar a leitura da entrada.
	}

}
