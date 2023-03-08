
public class ComprarCarro {

	public static void main(String[] args) {
String [] carros= {"Ferrari","Porsche","Alfa Romeo","Jaguar","Camaro","Mini Cooper","Evoque", "L200","Malibu"};
		
		int Ferrari=1990000;
		int Porsche=1200000;
		int Alfa_Romeo=850000;
		int Jaguar=650000;
		int Camaro=500000;
		int Mini_Cooper=400000;
		int Evoque=350000;
		int L200=300000;
		int Malibu=250000;
		
		System.out.println(carros.length);
		
		for(int contador=0;contador<carros.length;contador++) {
			System.out.println(contador+" - "+carros[contador]);
		}
		
		System.out.println(Ferrari - Porsche);
		
		
	}

}
