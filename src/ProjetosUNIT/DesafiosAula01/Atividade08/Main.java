//Escrever um programa para provar que o algoritmo de Euclides calcula o máximo divisor
//comum de dois inteiros que têm valores positivos.

package ProjetosUNIT.DesafiosAula01.Atividade08;

public class Main {
    public static void main(String[] args) {
        Euclides euclides = new Euclides(30, 18);
        Euclides euclides2 = new Euclides(45, 30);

        System.out.println(euclides.acharMDC());
        System.out.println(euclides2.acharMDC());
    }
}
