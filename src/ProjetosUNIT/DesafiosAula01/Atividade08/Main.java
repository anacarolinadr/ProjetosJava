//Escrever um programa para provar que o algoritmo de Euclides calcula o máximo divisor
//comum de dois inteiros que têm valores positivos.

package ProjetosUNIT.DesafiosAula01.Atividade08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritmo de Euclides");
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        Euclides euclides = new Euclides(num1, num2);

        System.out.println(euclides.acharMDC());
    }
}
