import java.util.Scanner;

// determine o menor valor, o maior valor e a soma dos valores.
// Faça um programa que, dado um conjunto de N números,
public class Exercicio18 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("______________________________________________");
        System.out.println("Este programa recebe um número N de números e");
        System.out.println("calcula o maior o menor e a soma entre eles");
        System.out.println("_______________________________________________");

        System.out.println("Digite a quantidade de Números que você Deseja");
        Integer n = scanner.nextInt();

        Integer maiorNumero = 0;
        Integer menorNumero = 0;
        Integer soma = 0;

        for (Integer i = 1; i <= n; i++) {

            System.out.println("Digite o " + i + " º número");
            Integer numeroAtual = scanner.nextInt();
            soma += + numeroAtual;
            if (i == 1) {
                maiorNumero = numeroAtual;
                menorNumero = numeroAtual;
            }
            if (numeroAtual > maiorNumero) {
                maiorNumero = numeroAtual;
            }
            if (numeroAtual < menorNumero) {
                menorNumero = numeroAtual;
            }
        }
        System.out.println("O maior número Digitado foi: " + maiorNumero);
        System.out.println("O menor número Digitado foi: " + menorNumero);
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A soma do maior número com maior é: " + (maiorNumero + menorNumero));
    }
}
