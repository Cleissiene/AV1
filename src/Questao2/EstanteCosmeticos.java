package Questao2;

import java.util.Scanner;

public class EstanteCosmeticos {
    public static void main(String[] args) {

        int[][] estante = new int[40][40];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print("Digite o código do produto para a posição [" + i + "][" + j + "]: ");
                estante[i][j] = scanner.nextInt();
            }
        }

        int[] quantidadeProdutos = new int[5];

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                int codigo = estante[i][j];
                quantidadeProdutos[codigo]++;
            }
        }

        System.out.println("\nQuantidade de produtos na estante:");
        int totalProdutos = 0;

        System.out.println("Total de produtos: " + totalProdutos);

        System.out.println("\nQuantidade de caixas de produtos na estante:");
        System.out.println("Xampu: " + quantidadeProdutos[1]);
        System.out.println("Condicionador: " + quantidadeProdutos[2]);
        System.out.println("Hidratante: " + quantidadeProdutos[3]);
        System.out.println("Tintura: " + quantidadeProdutos[4]);
        System.out.println("Demaquilante: " + quantidadeProdutos[5]);
        System.out.println("Vazio: " + quantidadeProdutos[0]);
    }
}