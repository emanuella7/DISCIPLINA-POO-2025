package br.edu.principal;
import java.util.Scanner;
public class Principal {
//EXE PROPOSTOS
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o peso da pessoa em quilos: ");
        double pesoEmQuilos = scanner.nextDouble();

        
        double pesoEmGramas = pesoEmQuilos * 1000;

        
        System.out.printf("O peso da pessoa em gramas é: %.2f g\n", pesoEmGramas);

        
        scanner.close();
    }
}