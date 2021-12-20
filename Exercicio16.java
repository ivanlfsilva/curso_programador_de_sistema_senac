import java.util.Scanner;
    // A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
    // Faça um programa que gere a série até que o valor seja maior que 500.
public class Exercicio16 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer termo01 = 0;
        Integer termo02 = 1;
        Integer aux = 0;
        Boolean sequencia = true;


        for(Integer i = 1; sequencia ; i++){

            if(i == 1) {
                System.out.println(aux);
            }else if(aux <= 500) {
                aux = termo01 + termo02;
                termo01 = termo02;
                termo02 = aux;
                System.out.println(aux);
            }else{
                sequencia = false;
            }

        }

    }
}
