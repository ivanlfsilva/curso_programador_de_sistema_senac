public class Exercicio11 {
    // Altere o programa anterior para mostrar no final a soma dos números.
    public static void main(String[] args) {
        Integer soma = 0;

        for (Integer i = 1; i < 50; i++) {

            if (i > 1) {
                soma += +i;
            }
        }
        System.out.println("A soma entre os números 2 e 49 é : " + soma);
    }

}
