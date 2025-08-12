//Crie uma classe para representar uma pessoa, com os atributos
//privados de nome, idade e altura. Crie os métodos públicos necessários
//para sets e gets e também um método para imprimir todos dados de
//uma pessoa formatado com quebras de linhas.
//
//Na sequência implemente uma classe com método main para instanciar
//3 pessoas, solicitar seus dados e depois imprimi-los.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula03.Atividade02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inscrição");
        System.out.print("Digite o nome do usuário: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a idade do usuário: ");
        int idade1 = scanner.nextInt();
        System.out.print("Digite a altura do usuário: ");
        double altura1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Inscrição");
        System.out.print("Digite o nome do usuário: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade do usuário: ");
        int idade2 = scanner.nextInt();
        System.out.print("Digite a altura do usuário: ");
        double altura2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Inscrição");
        System.out.print("Digite o nome do usuário: ");
        String nome3 = scanner.nextLine();
        System.out.print("Digite a idade do usuário: ");
        int idade3 = scanner.nextInt();
        System.out.print("Digite a altura do usuário: ");
        double altura3 = scanner.nextDouble();

        Pessoa p1 = new Pessoa(nome1, idade1, altura1);
        Pessoa p2 = new Pessoa(nome2, idade2, altura2);
        Pessoa p3 = new Pessoa(nome3, idade3, altura3);

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}
