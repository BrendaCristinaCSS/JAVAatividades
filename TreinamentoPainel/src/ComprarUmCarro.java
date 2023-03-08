import java.util.Scanner;

public class ComprarUmCarro {

	public static void main(String[] args) {
		
		String [] carros= {"Ferrari R$ 1.990.000,00","Porsche R$ 1.200.000,00","Alfa Romeo R$ 850.000,00","Jaguar R$ 650.000,00","Camaro R$ 500.000,00","Mini Cooper R$ 400.000,00","Evoque R$ 350.000,00", "L200 R$ 300.000,00","Malibu R$ 250.000,00"};
		
		int Ferrari=1990000;
		int Porsche=1200000;
		int Alfa_Romeo=850000;
		int Jaguar=650000;
		int Camaro=500000;
		int Mini_Cooper=400000;
		int Evoque=350000;
		int L200=300000;
		int Malibu=250000;
		int valor1,valor2,opcao,resultado;
		
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
		System.out.println("3 - Alfa Romeo, preço: R$ 850.000,00");
		System.out.println("4 - Jaguar, preço: R$ 650.000,00");
		System.out.println("5 - Camaro, preço: R$ 500.000,00");
		System.out.println("6 - Mini Cooper, preço: R$ 400.000,00");
		System.out.println("7 - Evoque, preço: R$ 350.000,00");
		System.out.println("8 - L200, preço: R$ 300.000,00");
		System.out.println("9 - Malibu, preço: R$ 250.000,00");
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
			
		case 3: 
			resultado = (Alfa_Romeo-valor1) / valor2;
			System.out.println("Alfa Romeo, as parcelas por mês: R$"+resultado);
			
			break;
		case 4: 
			resultado = (Jaguar-valor1) / valor2;
			System.out.println("Jaguar, as parcelas por mês: R$"+resultado);
			break;
		case 5: 
			resultado = (Camaro-valor1) / valor2;
			System.out.println("Camaro, as parcelas por mês: R$"+resultado);
			
			break;
		case 6: 
			resultado = (Mini_Cooper-valor1) / valor2;
			System.out.println("Mini Cooper, as parcelas por mês: R$"+resultado);
			break;
			
		case 7: 
			resultado = (Evoque-valor1) / valor2;
			System.out.println("Evoque, as parcelas por mês: R$"+resultado);
			
			break;
		case 8: 
			resultado = (L200-valor1) / valor2;
			System.out.println("L200, as parcelas por mês: R$"+resultado);
			break;
		case 9: 
			resultado = (Malibu-valor1) / valor2;
			System.out.println("Malibu, as parcelas por mês: R$"+resultado);
			break;
			
		}
		
		
	}

}
