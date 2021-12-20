public class Exercicio06 {
    // Faça um programa que imprima na tela os números de 1 a 20,
    // um abaixo do outro. Depois modifique o programa para  que
    // ele mostre os números um ao lado do outro.
    public static void main(String[] args) {

        String texto = "";
        for (Integer i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        for (Integer j = 1; j <= 20; j++) {
            if (j == 1) {
                texto += "" + j;
            } else {
                texto += " " + j;
            }
        }
        System.out.println(texto);
    }
}
