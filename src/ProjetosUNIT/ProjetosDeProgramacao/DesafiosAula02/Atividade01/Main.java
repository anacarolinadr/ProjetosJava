//Escreva um programa que converte galões em litros, sendo que cada
//galão possui 3,7854 litros.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade01;

public class Main {
    public static void main(String[] args) {
        Conversao conversao = new Conversao(15);
        System.out.println("Os " + conversao.getQtdGaloes() + " galões representam aproximadamente " + String.format("%.2f", conversao.conversaoGaloesLitros()));
    }
}
