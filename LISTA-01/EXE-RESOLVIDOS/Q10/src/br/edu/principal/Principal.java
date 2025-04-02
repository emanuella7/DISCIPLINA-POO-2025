package br.edu.principal;
//EXE RESOLVIDOS
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        
        double pi = 3.14159;

        
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        
        double area = pi * Math.pow(raio, 2); 

        
        System.out.printf("A área do círculo é: %.2f\n", area);

        
        scanner.close();
    }
}