package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Atividade02;

public class Carro extends Veiculo {
    private int marcha;

    public Carro(String modelo, double velocidade, int passageiros, double combustivel, int marcha) {
        super(modelo, velocidade, passageiros, combustivel);
        this.marcha = marcha;
    }

    public void acelerar(int novaMarcha) {
        if (novaMarcha > marcha) {
            marcha = novaMarcha;
            velocidade += 10;
            System.out.println(modelo + " mudou para marcha " + marcha + " e acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("Marcha inválida para acelerar.");
        }
    }

    @Override
    public void frear(double novaVelocidade) {
        if (novaVelocidade < velocidade) {
            velocidade = novaVelocidade;
            System.out.println("Carro " + modelo + " freou para " + velocidade + " km/h.");
        } else {
            System.out.println("A velocidade informada não é menor que a atual.");
        }
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}

