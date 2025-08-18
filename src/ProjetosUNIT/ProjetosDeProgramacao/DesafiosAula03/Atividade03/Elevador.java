package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula03.Atividade03;

public class Elevador {
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;
    private int andarAtual;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
        this.andarAtual = 0;
    }

    public int andarElevador(int andarDesejado, int pessoasPresentes){
        if (andarDesejado > totalAndares || andarDesejado < 0) {
            System.out.println("Andar não existe");
            return andarAtual;
        }
        if (pessoasPresentes > capacidade) {
            int qtdPessoasSair = pessoasPresentes - capacidade;
            System.out.println("Capacidade atingida, " + qtdPessoasSair + " devem sair para o elevador sair");
            return andarAtual;
        }
        System.out.println("Se locomoveu para o andar " + andarDesejado);
        this.pessoasPresentes = pessoasPresentes;
        return this.andarAtual = andarDesejado;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
