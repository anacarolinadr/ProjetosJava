package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Atividade01;

public class MountainBike extends Bicicleta {
    private String suspensao;

    public MountainBike() {}

    public MountainBike(int marcha, double velocidade, String suspensao) {
        super(marcha, velocidade);
        this.suspensao = suspensao;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", suspensão: " + suspensao;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }
}

