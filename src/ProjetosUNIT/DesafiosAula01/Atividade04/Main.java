//Escrever um programa que leia o valor do salário mínimo e o valor do salário de um
//usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o
//resultado. (1 Salário Mínimo = R$1.320,00).

package ProjetosUNIT.DesafiosAula01.Atividade04;

public class Main {
    public static void main(String[] args) {
        Salario salario = new Salario(5678.3);
        System.out.println(salario.calcularSalariosMinimos());
    }
}
