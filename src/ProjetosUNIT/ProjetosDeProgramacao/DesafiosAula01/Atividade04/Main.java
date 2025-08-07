//Escrever um programa que leia o valor do salário mínimo e o valor do salário de um
//usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o
//resultado. (1 Salário Mínimo = R$1.320,00).

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de Salários Mínimos");
        System.out.print("Digite o valor do seu salário: ");
        double valorSalario = scanner.nextDouble();

        Salario salario = new Salario(valorSalario);
        System.out.println("Seu salário é " + String.format("%.2f", salario.calcularSalariosMinimos()) + " salários mínimos");
    }
}
