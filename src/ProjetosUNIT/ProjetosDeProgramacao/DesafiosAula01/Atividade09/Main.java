//Escrever um programa para inverter uma frase (assumir um único espaço entre duas
//        palavras) sem inverter todas as palavras.
//        ● Insira uma string: A raposa marrom rápida salta sobre o cão preguiçoso
//● Resultado: o cão preguiçoso salta sobre a raposa marrom rápido O

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade09;

public class Main {
    public static void main(String[] args) {
        FraseInvertida fraseInvertida = new FraseInvertida("Olá mundo!");
        System.out.println(fraseInvertida.inverterFrase());
    }
}
