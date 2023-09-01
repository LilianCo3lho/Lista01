import java.util.Scanner;
//Ana Lilian Sousa Coelho - 556697
public class Atividade01_Questao04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);          //criei um objeto scanner para ler oq o usuario digitar.
		int A, B;                                          //declarei duas variaveis int.
		
		System.out.println("Digite um valor para A:");     //pedi ao usuario que digite um valor inteiro para A.
		A = entrada.nextInt();                             //A vai armazenar esse numero
		
		System.out.println("Digite um valor para B:");     //pedi ao usuario que digite um valor inteiro para B.
		B = entrada.nextInt();                             //B vai armazenar esse numero
		
		if (A > 10 || A + B == 20) {                       //se A for maior que 10 ou A mais B e igual a 20
			System.out.println("numero valido");           //Entra no if e Imprime "numero valido"
		}else if(A == B){                                  //caso for falso e se A for igual a B 
			System.out.println("A e igual a B; A e B sao diferentes de 10; A e menor que 10."); //imprime A = B
		}else {                                            //caso for falso
			System.out.println("numero nao valido.");      //Imprime numero nao valido
		}
		entrada.close();                                   ////fechar o objeto escanner para parar a leitura da entrada.
	}

}
