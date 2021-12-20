import java.util.Scanner;

//Supondo que a população de um país A seja da ordem de 80000 habitantes
// com uma taxa anual de crescimento de 3% e que a população de B seja
// 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa
// que calcule e escreva o número de anos necessários para que a população
// do país A ultrapasse ou iguale a população do país B, mantidas as taxas
// de crescimento.
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double paisA = 80000.0;
        Double paisB = 200000.0;
        final Double TAXA_A = (3 / 100.0);
        final Double TAXA_B = (1.5 / 100.0);
        Integer quantidadeAnos;

        for (quantidadeAnos = 0; paisA <= paisB; quantidadeAnos++) {

            paisA += paisA * TAXA_A;
            paisB += paisB * TAXA_B;
        }
        System.out.println(quantidadeAnos + " Anos");

    }
}
