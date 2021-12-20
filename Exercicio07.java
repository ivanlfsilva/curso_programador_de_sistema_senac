import java.util.Scanner;

//Faça um programa que leia 5 números e informe o maior número.
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer numero = 0;
        for (Integer i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número");
            Integer numAtual = scanner.nextInt();
            if (i == 1) {
                numero = numAtual;
            }
            if (numAtual > numero) {
                numero = numAtual;
            }
        }
        System.out.println("O maior número Digitado foi : " + numero);


    }
}
