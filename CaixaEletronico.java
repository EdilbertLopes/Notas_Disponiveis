package ProgramasDecis�es;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		int saque;
		double notas100, notas50, notas20;
		int resto;

		saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor desejado para saque: "));//armazena e l� vari�vel
		
		if (saque%10 == 0)//valor informado est� correto, valor do saque divisel por 10 � igual a 0
		{
			
			notas100 = Math.floor(saque/100);
			
			resto = saque%100;
			
			notas50 = Math.floor(resto/50);
			resto = resto%50;
			
			notas20 = Math.floor(resto/20);			
			
				if (notas100>0)
					System.out.println("O n�mero de notas de Cem �: "+notas100);
				if (notas50>0)
					System.out.println("O n�mero de notas de Cinquenta �: "+notas50);
				if (notas20>0)
					System.out.println("O n�mero de notas de Vinte �: "+notas20);
		}else
			System.out.println("Valor informado est� incorreto");

	}

}
