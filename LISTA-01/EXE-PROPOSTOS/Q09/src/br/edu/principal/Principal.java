package br.edu.principal;
import java.util.Scanner;
public class Principal {
//EXE PROPOSTOS
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor da base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        
        System.out.print("Digite o valor da base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        
        System.out.print("Digite o valor da altura do trapézio: ");
        double altura = scanner.nextDouble();

        
        double area = ((baseMaior + baseMenor) * altura) / 2;

       
        System.out.printf("A área do trapézio é: %.2f\n", area);

       
        scanner.close();
    }
}


