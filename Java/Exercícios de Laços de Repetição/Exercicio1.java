package LaçosDeRepetição;

public class Exercicio1 {

	public static void main(String[] args) 
	{// 1 - Informar todos os números de 1000 a 1999 que divididos quando por 11 obtemos resto = 5.
		
		for (int i=1000; i<2000; i++)
		{
			if (i%11==5) 
			{
				System.out.println(i);
			}
		}
	}
}
