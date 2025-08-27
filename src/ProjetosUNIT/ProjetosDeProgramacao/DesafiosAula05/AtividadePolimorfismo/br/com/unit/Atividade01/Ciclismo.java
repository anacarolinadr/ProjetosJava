package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Atividade01;

public class Ciclismo extends Bicicleta {
    private int espessuraPneu;

    public Ciclismo() {}

    public Ciclismo(int marcha, double velocidade, int espessuraPneu) {
        super(marcha, velocidade);
        this.espessuraPneu = espessuraPneu;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", espessura do pneu: " + espessuraPneu + " mm";
    }

    public int getEspessuraPneu() {
        return espessuraPneu;
    }

    public void setEspessuraPneu(int espessuraPneu) {
        this.espessuraPneu = espessuraPneu;
    }
}

