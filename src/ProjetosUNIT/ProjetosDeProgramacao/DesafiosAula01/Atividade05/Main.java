//Escrever um programa que leia um número inteiro e imprima o seu antecessor e seu
//sucessor.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sucessor e Antecessor");
        System.out.print("Digite o número: ");
        int num = scanner.nextInt();

        Numero numero = new Numero(num);
        numero.acharAntecessorSucessor();
    }
}
