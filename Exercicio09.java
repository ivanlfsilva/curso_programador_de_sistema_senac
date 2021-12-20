public class Exercicio09 {
    // Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
    public static void main(String[] args) {

        System.out.println("Números impares de 1 à 50");
        String texto = "";
        for (Integer i = 1; i <= 50; i++) {

            if( i % 2 != 0){
                texto +=  " " + i;
            }
        }
        System.out.print(texto);
    }
}
