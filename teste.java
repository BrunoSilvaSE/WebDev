import java.util.Scanner;

public class mtz8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        boolean valido = true;

        // leitura da matriz
        System.out.println("Digite os números de 1 a 4 para preencher a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // verifica repetição em linhas
        for (int i = 0; i < 4; i++) {
            boolean[] repetido = new boolean[5];
            for (int j = 0; j < 4; j++) {
                int valor = matriz[i][j];
                if (repetido[valor]) {
                    valido = false;
                }
                repetido[valor] = true;
            }
        }

        // verifica repetição em colunas
        for (int j = 0; j < 4; j++) {
            boolean[] repetido = new boolean[5];
            for (int i = 0; i < 4; i++) {
                int valor = matriz[i][j];
                if (repetido[valor]) {
                    valido = false;
                }
                repetido[valor] = true;
            }
        }

        // mostra a matriz
        System.out.println("\n//// Matriz Digitada ////");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // resultado da validação
        if (valido) {
            System.out.println("\nPreenchimento válido: sem repetições nas linhas e colunas.");
        } else {
            System.out.println("\nPreenchimento inválido: há repetições nas linhas ou colunas.");
        }

        sc.close();
    }