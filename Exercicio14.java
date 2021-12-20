import java.util.Scanner;

public class Exercicio14 {
    // aça um programa que peça 10 números inteiros,
    // calcule e mostre a quantidade de números pares
    // e a quantidade de números impares.
    public static void main(String[] args) {

        String totPares = "";
        String totImpares = "";
        Scanner scanner = new Scanner(System.in);

        for (Integer i = 1; i <= 10; i++) {

            System.out.println("Digite o " + i + "º número");
            Integer num = scanner.nextInt();

            if (num % 2 != 0) {
                totImpares += " " + num;
            } else {
                totPares += " " + num;
            }
        }
        System.out.println("Estes são os números impares: " + totImpares);
        System.out.println("Estes são os números  pares: " + totPares);
    }
}
