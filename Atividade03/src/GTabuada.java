import java.util.Scanner;

public class GTabuada {

	public static void main(String[] args) {
		int num_tabuada, valor_tabuada;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por gentileza, digite a tabuada deseja: ");
		
		num_tabuada=teclado.nextInt();
		
		for(int contador=1; contador<=10; contador++) {
			valor_tabuada=num_tabuada*contador;
			System.out.println(num_tabuada+" x "+contador+" = "+valor_tabuada);
			
		}

	}

}
