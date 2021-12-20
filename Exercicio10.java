public class Exercicio10 {
    // Faça um programa que receba dois números inteiros
    // e gere os números inteiros que estão no intervalo
    // compreendido por eles.
    public static void main(String[] args) {
        String texto = "";

        for (Integer i = 1; i < 50; i++) {

            if(i > 1 ) {
                texto += " " + i;
            }
        }
        System.out.println(texto);
    }
}
