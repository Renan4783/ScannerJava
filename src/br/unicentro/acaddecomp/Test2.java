package br.unicentro.acaddecomp;

import java.util.*;

public class Test2 {
	public static void main (String args[]){
		try{
			Scanner scan = new Scanner (System.in);
			int numero1, numero2, numero3, produto;
			System.out.println("\nDigite o primeiro numero: ");
			numero1 = scan.nextInt();
			System.out.println("\nDigite o segundo numero: ");
			numero2 = scan.nextInt();
			System.out.println("\nDigite o terceiro numero: ");
			numero3 = scan.nextInt();
			produto = numero1*numero2*numero3;
			System.out.printf("\nO resultado é: %d", produto);
		} catch (InputMismatchException inputMismatchException){
			System.out.printf("Exception: %s", inputMismatchException);
			System.out.println("\nO número precisa ser um inteiro!");
		}
	}
}
