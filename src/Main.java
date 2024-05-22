import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do número ao usuário
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Validação do número negativo
        if (numero < 0) {
            System.out.println("Fatorial não está definido para números negativos.");
        }else{

        // Instanciação das classes
        FatorialIterativo fatorialIterativo = new FatorialIterativo();
        FatorialRecursivo fatorialRecursivo = new FatorialRecursivo();

            
        // Cálculo e exibição do fatorial iterativo
        System.out.println("Calculo Usando Iteratividade");
        long resultadoIterativo = fatorialIterativo.calcularFatorial(numero);
        System.out.println("Fatorial (iterativo) de " + numero + " é: " + resultadoIterativo);

        // Cálculo e exibição do fatorial recursivo
        System.out.println("Calculo Usando recursivo");
        long resultadoRecursivo = fatorialRecursivo.calcularFatorial(numero);
        System.out.println("");
        System.out.println("Fatorial (recursivo) de " + numero + " é: " + resultadoRecursivo);

        // Fechamento do scanner
        scanner.close();


        }

    }
}
