package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Atividade01;

public class Bicicleta {
    private int marcha;
    private double velocidade;

    public Bicicleta() {}

    public Bicicleta(int marcha, double velocidade) {
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    public String exibirDados() {
        return "Marcha: " + marcha + ", velocidade: " + velocidade + " km/h";
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}


