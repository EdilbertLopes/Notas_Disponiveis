package ProgramasDecisões;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		int saque;
		double notas100, notas50, notas20;
		int resto;

		saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor desejado para saque: "));//armazena e lê variável
		
		if (saque%10 == 0)//valor informado está correto, valor do saque divisel por 10 é igual a 0
		{
			
			notas100 = Math.floor(saque/100);
			
			resto = saque%100;
			
			notas50 = Math.floor(resto/50);
			resto = resto%50;
			
			notas20 = Math.floor(resto/20);			
			
				if (notas100>0)
					System.out.println("O número de notas de Cem é: "+notas100);
				if (notas50>0)
					System.out.println("O número de notas de Cinquenta é: "+notas50);
				if (notas20>0)
					System.out.println("O número de notas de Vinte é: "+notas20);
		}else
			System.out.println("Valor informado está incorreto");

	}

}
