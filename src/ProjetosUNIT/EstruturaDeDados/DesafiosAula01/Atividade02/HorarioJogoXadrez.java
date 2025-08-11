package ProjetosUNIT.EstruturaDeDados.DesafiosAula01.Atividade02;

public class HorarioJogoXadrez {
    private int horarioInicial;
    private int horarioFinal;

    public HorarioJogoXadrez(int horarioInicial, int horarioFinal) {
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
    }

    public void exibirTempo(){
        if (horarioInicial < horarioFinal) {
            int tempo = horarioFinal - horarioInicial;
            System.out.println("Tempo total: " + tempo);
        } else if (horarioInicial > horarioFinal) {
            int h1 = 24 - horarioInicial;
            int tempo = horarioFinal + h1;
            System.out.println("Tempo total: " + tempo);
        } else if (horarioInicial == horarioFinal) {
            System.out.println("Tempo total: 24");
        }
    }

    public int getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(int horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public int getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(int horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
}
