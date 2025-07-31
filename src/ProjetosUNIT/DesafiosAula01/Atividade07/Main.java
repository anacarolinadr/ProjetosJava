//Escrever um programa para verificar se duas strings são anagramas ou não. Um anagrama
//é uma espécie de jogo de palavras criado com a reorganização das letras de uma palavra
//ou expressão para produzir outras palavras ou expressões, utilizando todas as letras
//originais exatamente uma vez. Exemplos amplamente conhecidos são Iracema e América
//e amor e Roma.

package ProjetosUNIT.DesafiosAula01.Atividade07;

public class Main {
    public static void main(String[] args) {
        Anagrama anagrama = new Anagrama("America", "Iracema");
        Anagrama anagrama2 = new Anagrama("Amor", "Bola");

        System.out.println(anagrama.isAnagrama());
        System.out.println(anagrama2.isAnagrama());
    }
}
