import java.util.Scanner;

public class Exercicio17 {
    // Faça um programa que calcule o fatorial de um
    // número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor para calcularmos o fatorial dele");
        Integer valor = scanner.nextInt();
        Integer fatorial = 1;

        for (Integer i = 1; i <= valor; i++){
            System.out.println(fatorial = fatorial * i);
        }

    }
}
