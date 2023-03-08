import java.util.Scanner;

public class NovoProjeto {

	public static void main(String[] args) {
		
				
				String [] carros= {"Ferrari R$ 1.990.000,00","Porsche R$ 1.200.000,00"};
				
				int Ferrari=1990000;
				int Porsche=1200000;
				int valor1, valor2, opcao, resultado;
				
				Scanner teclado = new Scanner(System.in);
				
				System.out.println(carros.length);
				
				for(int contador=0;contador<carros.length;contador++) {
					System.out.println(contador+" - "+carros[contador]);
				}
				
				System.out.println();
				System.out.println("Digite o primeiro valor da entrada: ");
				valor1=teclado.nextInt();
				System.out.println();
				System.out.println("Digite o segundo valor quantas parcelas: ");
				valor2=teclado.nextInt();
				
				System.out.println();
				System.out.println("Escolha a opção abaixo desejada");
				System.out.println("===============================");
				System.out.println("1 - Ferrari, preço: R$ 1.990.000,00");
				System.out.println("2 - Porsche, preço: R$ 1.200.000,00");
				System.out.println("===============================");
				System.out.println();
				System.out.println("5 - Digite o número da opção");
				
				opcao=teclado.nextInt();
				
				switch (opcao) {
				case 1: 
					resultado = Ferrari-valor1 / valor2;
					System.out.println("Ferrari, as parcelas por mês: R$"+resultado);
					
					break;
				case 2: 
					resultado = (Porsche-valor1) / valor2;
					System.out.println("Porsche, as parcelas por mês: R$"+resultado);
					break;
								
				}
				
				
			}

		}

