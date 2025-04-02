package br.edu.principal;
import java.util.Scanner;
public class Principal {
//EXE RESOLVIDOS
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor do depósito: R$ ");
        double deposito = scanner.nextDouble();

      
        System.out.print("Digite a taxa de juros (%): ");
        double taxaJuros = scanner.nextDouble();

        
        double rendimento = deposito * (taxaJuros / 100);

        
        double total = deposito + rendimento;

        
        System.out.printf("Valor do rendimento: R$ %.2f\n", rendimento);
        System.out.printf("Valor total após o rendimento: R$ %.2f\n", total);

        
        scanner.close();

	}

}
