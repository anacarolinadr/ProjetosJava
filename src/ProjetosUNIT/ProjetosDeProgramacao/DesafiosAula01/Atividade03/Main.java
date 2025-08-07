//Escrever um programa que lê:
//        ● A porcentagem do IPI a ser acrescido no valor das peças:
//        ○ O código da peça 1, valor unitário da peça 1, quantidade de peças 1
//        ○ O código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O programa deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de IPI");
        System.out.print("Digite o código do produto 1: ");
        double codigo1 = scanner.nextDouble();

        System.out.print("Digite o valor do produto 1: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite a quantidade que será comprada do produto 1: ");
        double qtd1 = scanner.nextDouble();

        System.out.print("Digite o código do produto 2: ");
        double codigo2 = scanner.nextDouble();

        System.out.print("Digite o valor do produto 2: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite a quantidade que será comprada do produto 2: ");
        double qtd2 = scanner.nextDouble();

        System.out.print("Qual o valor do IPI? Digite em porcentagem ");
        double ipi = scanner.nextDouble();

        ValorTotalIPI valorTotalIPI = new ValorTotalIPI(valor1, valor2, qtd1, qtd2, ipi);
        System.out.println(valorTotalIPI.calcularValorTotal());
    }
}
