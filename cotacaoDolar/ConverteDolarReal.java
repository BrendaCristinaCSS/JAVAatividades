package cotacaoDolar;

import java.util.Scanner;

public class ConverteDolarReal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cotDolar, valDolar, valReal;

        System.out.print("Conversor de dolar em real. \n\n");

        System.out.print("Digite a cotacao do dolar: ");
        cotDolar = entrada.nextDouble();
        
        System.out.print("Digite o valor em dolares. \n\n");
        valDolar = entrada.nextDouble();

        valReal = cotDolar*valDolar;

        System.out.println("O valor em reais R$"+valReal+"\n");

        entrada.close();

        
    }
}