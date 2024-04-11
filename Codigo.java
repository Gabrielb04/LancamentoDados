import java.util.Random;
import java.util.Scanner;

public class SimuladorLancamentoDados {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Bem-vindo ao Simulador de Lançamento de Dados!");

	        boolean continuar = true;
	        while (continuar) {
	            System.out.print("Quantos dados você gostaria de lançar? ");
	            int numDados = scanner.nextInt();

	            System.out.print("Quantas faces os dados têm? ");
	            int numFaces = scanner.nextInt();

	     
	            System.out.print("Resultados do lançamento: ");
	            for (int i = 0; i < numDados; i++) {
	                int resultado = random.nextInt(numFaces) + 1;
	                System.out.print(resultado + " ");
	            }
	            System.out.println();

	    
	            System.out.print("Deseja lançar mais dados? (S/N) ");
	            String resposta = scanner.next();
	            if (!resposta.equalsIgnoreCase("S")) {
	                continuar = false;
	            }
	        }

	        System.out.println("Obrigado por usar o Simulador de Lançamento de Dados!");
	        scanner.close();
	}

}
