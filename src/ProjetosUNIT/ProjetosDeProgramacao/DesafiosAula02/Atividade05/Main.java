//Escreva um programa em Java para ler dois números e realizar as
//        operações de soma, subtração, multiplicação e divisão.
//        OBS.:
//        • O usuário deve escolher qual operação deseja realizar
//        • Os números informados devem ser reais

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o valor respectivo da operação desejada: ");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.print("4- Divisão ");
        int opcao = scanner.nextInt();

        TipoOperacao operacao = TipoOperacao.buscarPorCodigo(opcao);

        Operacao calculo = new Operacao(num1, num2, operacao);
        System.out.println("Valor: " + calculo.calcular());
    }
}
