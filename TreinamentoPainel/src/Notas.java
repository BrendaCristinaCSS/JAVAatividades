
public class Notas {
	public static void main(String[] args) {
		String alunos[]= {"Adriano", "Lessa", "Amilton", "Aline"};
		int nota1[]= {9, 7, 7, 7};
		int nota2[]= {9, 7, 5, 5};
		int nota3[]= {8, 5, 6, 6};
		int nota4[]= {7, 6, 6, 3};
		int media;

		for(int contador=0; contador<alunos.length;contador++) {
			
		media=((nota1[contador])+(nota2[contador])+(nota3[contador])+(nota4[contador]))/4;
		
		String conceito;
		
		if(media>7) {
			conceito = "Aprovado";
		}else if (media==7) {
			conceito = "Recuperação";
		}else {
		 conceito = "Reprovado";
		}
		System.out.println(alunos[contador]+ " Nota1: "+nota1[contador]+" Nota2: "+nota2[contador]+" Nota3: "+nota3[contador]+" Nota4: "+nota4[contador]+" Media: "+media+ " Resultado: "+conceito);
		}
	}
}

