import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] array = new int[10];
        int valores, posicao1, posicao2, apoio;

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite um valores para a posiçao [" + i + "]:");
            valores = leitor.nextInt();
            array[i] = valores;

        }
        System.out.println("O array é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println(
                "\n\nAgora voce ira escolher duas posiçoes dentro do array \npara que seus valores invertam as posiçoes.");
        System.out.println(
                "O Intervalo maximo de posiçoes no array vai de 0 a 9,\nentao escolha valores dentro desse intervalo:");

        System.out.println("Qual a primeira posiçao?");
        posicao1 = leitor.nextInt();
        System.out.println("Qual a segunda posiçao?");
        posicao2 = leitor.nextInt();

        while (0 > posicao1 || posicao1 > 9) {
            System.out.println("****ESCOLHA UMA POSICAO VALIDA****\n");
            System.out.println("Qual a PRIMEIRA posiçao?");
            posicao1 = leitor.nextInt();
        }
        while (0 > posicao2 || posicao2 > 9) {
            System.out.println("****ESCOLHA UMA POSICAO VALIDA****\n");
            System.out.println("Qual a SEGUNDA posiçao?");
            posicao2 = leitor.nextInt();
        }

        apoio = array[posicao1];
        array[posicao1] = array[posicao2];
        array[posicao2] = apoio;

        System.out.println("O novo array é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + ", ");
        }

        leitor.close();
    }
}
