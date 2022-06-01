import java.util.Scanner;
import java.util.Random;

public class questao2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] posicao = new int[100];
        int numero, apoio = 0;

        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();

        for (int i = 0; i < 100; i++) {
            array[i] = aleatorio.nextInt(100);
            System.out.print(array[i] + ", ");
        }

        System.out
                .println("\n\nAgora voce ira escolher um numero para verificarmos se ele se encontra dentro do array,");
        System.out.println("e qual a posiçao em que se localiza esse numero caso ele esteja incluso. ");
        System.out.print("Digite um numero: ");
        numero = leitor.nextInt();

        for (int i = 0; i < 100; i++) {
            if (numero == array[i]) {
                posicao[apoio] = i;

                apoio++;
            }
        }

        if (apoio > 0) {
            System.out.println("O numero digitado se encontra dentro do array nas posiçoes:");
            for (int i = 0; i < apoio; i++) {
                System.out.println("posiçao: " + posicao[i]);
            }
        } else
            System.out.println("O numero digitado nao se encontra dentro do array");

        leitor.close();
    }
}