//Escreva um programa que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

package ProjetosUNIT.DesafiosAula01.Atividade01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de Dias de Idade");
        System.out.print("Digite a quantidade de anos na sua idade: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a quantidade de meses na sua idade: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a quantidade de dias na sua idade: ");
        int dias = scanner.nextInt();

        ContagemDias contagemDias = new ContagemDias(anos, meses, dias);
        contagemDias.mostrarContagem();
    }
}
