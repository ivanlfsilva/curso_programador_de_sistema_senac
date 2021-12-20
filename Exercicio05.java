import java.util.Scanner;
    // Altere o programa anterior permitindo ao usuário informar
    // as populações e as taxas de crescimento iniciais. Valide
    // a entrada e permita repetir a operação.
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("Este programa calcula em quenato tempo um pais");
        System.out.println("de menor população atinge a mesma quantidade de");
        System.out.println("pessoas de outro país, levando em conta sua taxa");
        System.out.println("de crescimento.");
        System.out.println("--------------------------------------------------");

        System.out.println("Digite a quantidade de pessoas do primeiro país");
        Double paisA = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas do segundo país");
        Double paisB = scanner.nextDouble();
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
