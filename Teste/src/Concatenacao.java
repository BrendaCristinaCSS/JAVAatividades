import java.util.Scanner;

public class Concatenacao {

	public static void main(String[] args) {
	
		String alunos[]= {"Givanildo","Tarciano","Adroaldo"};
		int nota1[] = {5,2,5};
		int nota2[] = {10,3,8};
		float media;

		System.out.println("========================");
		System.out.println("1 - Consulta Registro");
		System.out.println("2 - Consulta tudo");
		System.out.println("3 - Sair do Programa");
		System.out.println("========================");	
		System.out.println("Escolha a opção desejada:");
				Scanner teclado = new Scanner(System.in);
				int opcao;
				opcao=teclado.nextInt();
				switch(opcao) {
				case 1:
					// Criando uma variável para gerar um filtro
					System.out.println("Digite o RA do aluno a ser pesquisado: ");
					int ra;
					ra=teclado.nextInt();
					media=(nota1[ra]+nota2[ra])/2;
					System.out.println(alunos[ra]+ " Nota1: "+nota1[ra]+" Nota2: "+nota2[ra]+" Média: "+media);
					break;
				case 2:
					for(int contador=0; contador<alunos.length;contador++) {
						media=(nota1[contador]+nota2[contador])/2;
						System.out.println(alunos[contador]+ " Nota1: "+nota1[contador]+" Nota2: "+nota2[contador]+" Média: "+media);
					}
					break;
				case 3:
					System.out.println("Fim do sistema");
					break;
				default:
					System.out.println("Opção Inválida execute Novamente");
					break;
				}
				
						
				
			}
	

	}


