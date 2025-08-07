//Uma loja está levantando o valor total de todas as mercadorias em
//estoque. Escreva um algoritmo que permita a entrada das seguintes
//informações:
//a) o número total de mercadorias no estoque;
//b) valor de cada mercadoria.
//Ao final imprimir o valor total em estoque e a média de valor das
//mercadorias.

package ProjetosUNIT.EstruturaDeDados.DesafiosAula01.Atividade01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mercadoria mercadoria1 = new Mercadoria("Pão", 5, 10, 1);
        Mercadoria mercadoria2 = new Mercadoria("Torta", 50, 15, 2);
        Mercadoria mercadoria3 = new Mercadoria("Bolo", 20, 5, 3);

        Mercadoria [] mercadorias = {mercadoria1, mercadoria2, mercadoria3};
        Estoque estoque = new Estoque(mercadorias);

        estoque.gerarMedia();
    }
}
