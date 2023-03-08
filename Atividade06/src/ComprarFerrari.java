import java.util.Scanner;

public class ComprarFerrari {

	public static void main(String[] args) {
		
		float valor_carro, valor_entrada, valor_a_parcelar, valor_parcela;
		int opcao;
		valor_carro = 1990000 ;
		
		
		System.out.println("Digite o valor da entrada");
			Scanner teclado = new Scanner(System.in);
			valor_entrada=teclado.nextInt();
			valor_a_parcelar = valor_carro - valor_entrada;
			
			//valor_parcela72 = valor_a_parcelar / 72;
			//valor_parcela48 = valor_a_parcelar / 48;
			//valor_parcela24 = valor_a_parcelar / 24;
			
			System.out.println("======================");
			System.out.println("1 - Pagamento em 72x =");
			System.out.println("2 - Pagamento em 48x =");
			System.out.println("3 - Pagamento em 24x =");
			System.out.println("======================");
			System.out.println("Escolha a opção deseja:");
			opcao = teclado.nextInt();
						
			switch(opcao) {
			case 1:
				if valor_parcela72 = valor_a_parcelar / 72;
				System.out.println("Valor do carro à vista: "+valor_carro+" \n Valor da entrada: "+valor_entrada+" \n Diferença a ser paga: "+valor_a_parcela+" \n Valor da parcela: "+valor_parcela+);
				break;
				
			case 2:
				if valor_parcela = valor_a_parcelar / 48;
				System.out.println("Valor do carro à vista: "+valor_carro+" \n Valor da entrada: "+valor_entrada+" \n Diferença a ser paga: "+valor_a_parcela+" \n Valor da parcela: "+valor_parcela+);
				break;
				
			case 3:
				if valor_parcela = valor_a_parcelar / 24;
				System.out.println("Valor do carro à vista: "+valor_carro+" \n Valor da entrada: "+valor_entrada+" \n Diferença a ser paga: "+valor_a_parcela+" \n Valor da parcela: "+valor_parcela+);
				break;
			
				
		}
	}

}
