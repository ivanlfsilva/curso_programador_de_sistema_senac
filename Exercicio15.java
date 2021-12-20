import java.util.Scanner;

public class Exercicio15 {
    // A série de Fibonacci é formada pela seqüência
    // 1,1,2,3,5,8,13,21,34,55,... Faça um programa
    // capaz de gerar a série até o n−ésimo termo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer termo01 = 0;
        Integer termo02 = 1;
        Integer aux = 0;
        System.out.println("Escolha o número de termos que você deseja da sequência de Fibonacci");
        Integer x = scanner.nextInt();

        for(Integer i = 1; i < x; i++){

            if(i == 1) {
                System.out.println(aux);
            }
            aux = termo01 + termo02;
            termo01 = termo02;
            termo02 = aux;
            System.out.println(aux);

        }

    }
}