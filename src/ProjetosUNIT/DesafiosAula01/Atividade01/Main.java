//Escreva um programa que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

package ProjetosUNIT.DesafiosAula01.Atividade01;

public class Main {
    public static void main(String[] args) {
        ContagemDias contagemDias = new ContagemDias(19, 2, 16);
        contagemDias.mostrarContagem();
    }
}
