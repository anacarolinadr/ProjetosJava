//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere
//apenas horas inteiras, sem os minutos) e calcule a duração do jogo
//em horas, sabendo-se que o tempo máximo de duração do jogo é de
//24 horas e que o jogo pode iniciar em um dia e terminar no dia
//seguinte.

package ProjetosUNIT.EstruturaDeDados.DesafiosAula01.Atividade02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogo de Xadrez");
        System.out.print("Digite o horário inicial do jogo: ");
        int horarioInicial = scanner.nextInt();

        System.out.print("Digite o horário final do jogo: ");
        int horarioFinal = scanner.nextInt();

        HorarioJogoXadrez horarioJogoXadrez = new HorarioJogoXadrez(horarioInicial, horarioFinal);
        horarioJogoXadrez.exibirTempo();
    }
}
