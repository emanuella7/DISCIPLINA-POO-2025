package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		int n1, n2, n3, n4;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("digite o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.print("digite o terceiro número: ");
		n3 = sc.nextInt();
		
		System.out.print("digite o quarto número: ");
		n4 = sc.nextInt();
		
		int soma = n1 + n2 + n3 + n4; 
		
		System.out.print("A soma dos números é: " + soma );
		
		
		
		
		
	}

}