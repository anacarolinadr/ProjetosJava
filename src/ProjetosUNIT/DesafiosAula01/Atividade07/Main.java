//Escrever um programa para verificar se duas strings são anagramas ou não. Um anagrama
//é uma espécie de jogo de palavras criado com a reorganização das letras de uma palavra
//ou expressão para produzir outras palavras ou expressões, utilizando todas as letras
//originais exatamente uma vez. Exemplos amplamente conhecidos são Iracema e América
//e amor e Roma.

package ProjetosUNIT.DesafiosAula01.Atividade07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogo do Anagrama");
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        Anagrama anagrama = new Anagrama(palavra1, palavra2);
        System.out.println("É anagrama: " + anagrama.isAnagrama());
    }
}
