
public class Variaveis {

	public static void main(String[] args) {
		String nome = "Brenda Cristina";
		
		int Nota1=10;
		int Nota2=8;
		int Nota3=7;
		int Nota4=9;
		int Nota5=8;
		int Nota6=7;
		int Total=Nota1+Nota2+Nota3+Nota4+Nota5+Nota6;
		int media;
		
		
		System.out.println("Olá seja bem vindo "+ nome);
			
		media=Total/6;
		
		System.out.println("6 variáveis: \n Nota 1: "+Nota1+" \n Nota 2: "+Nota2+" \n Nota 3: "+Nota3+" \n Nota 4: "+Nota4+" \n Nota 5: "+Nota5+" \n Nota 6: "+Nota6+" \n o total notas é: "+Total+" \n o resultado da média é "+media);
		
				
		if(media>5) {
			System.out.println("Aluno aprovado, parabéns!!!!!");}
		else if(media==5) {
			System.out.println("Aluno em recuperação, preste atenção, estude bastante para aprovar, não perca a oportunidade");}
		else { System.out.println("Aluno reprovado, mas não fique desanimado, esforce estudar bastante que você conseguirá, com certeza! ;-)");}
				

	}

}
