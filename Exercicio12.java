import java.util.Scanner;

public class Exercicio12 {
    //Desenvolva um gerador de tabuada, capaz de gerar a
    // tabuada de qualquer número inteiro entre 1 a 10.
    // O usuário deve informar de qual numero ele deseja
    // ver a tabuada. A saída deve ser conforme o exemplo abaixo:
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o número da tabuada que devo exibir");
        Integer x = scanner.nextInt();

        for (Integer i = 1; i <= 10; i++) {

            System.out.println(i + " x " + x + " = " + i * x);

        }
    }
}
