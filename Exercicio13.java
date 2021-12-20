import java.util.Scanner;

public class Exercicio13 {
    // Faça um programa que peça dois números, base e expoente, calcule e mostre o
    // primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número que Vai corresponder a Base da potênciação");
        Integer base = scanner.nextInt();
        System.out.println("Digite um número que vai corresponder ao expoente da potênciação");
        Integer expoente = scanner.nextInt();

        Integer potencia = 1;

        for(Integer i = 1; i <= expoente; i++){
            potencia *= base;
        }
        System.out.println("O resultado da potência é: " + potencia);
    }
}
