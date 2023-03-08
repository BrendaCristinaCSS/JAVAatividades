
public class Financiamento {

	public static void main(String[] args) {
		float valor, float entrada, int meses {
	        
	         float parcela=0;
	        
	        if(entrada>=(valor/2)){
	           valor-=entrada;
	            valor=valor*1.35F;
	           parcela=valor/meses;   
	        }
	        
	         if(entrada<=(valor/2)){
	           valor-=entrada;
	            valor=valor*1.45F;
	           parcela=valor/meses;   
	        }
	         
	     return "O valor da parcela eh: "+parcela+" em "+meses+". Valor financiado: "+valor;
	   
		}
	}

}
