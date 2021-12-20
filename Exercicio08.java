import java.util.Scanner;

public class Exercicio08 {
    // Faça um programa que leia 5 números e informe a soma e a média dos números.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double soma = 0.0;

        for (Integer i = 1; i <= 5; i++) {

            System.out.println("Digite o " + i + " número");
            soma += scanner.nextDouble();
        }
        System.out.println("Está é a soma dos Números " + soma);
        System.out.println("Está é a media dos Números " + soma/5);
    }
}
