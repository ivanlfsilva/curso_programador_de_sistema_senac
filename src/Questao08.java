import java.util.Scanner;

public class Questao08 {

    // Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = in.nextLine();

        System.out.println("Olá " + nome + " Quanto você ganha por hora Trabalhada? ");
        Double valorHora = in.nextDouble();

        System.out.println( nome + " Quantas horas você trabalhou esse mês?");
        Double quantHoras = in.nextDouble();

        Double totSalario = valorHora * quantHoras;

        System.out.println("-------------------------------------------------------");
        System.out.println(nome + " O total do seu salário é: " + totSalario + " R$");
        System.out.println("-------------------------------------------------------");

    }
}
