package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Atividade02;

public class Veiculo {
    protected String modelo;
    protected double velocidade;
    protected int passageiros;
    protected double combustivel;

    public Veiculo(String modelo, double velocidade, int passageiros, double combustivel) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
    }

    public void acelerar(double novaVelocidade) {
        if (novaVelocidade > velocidade) {
            velocidade = novaVelocidade;
            System.out.println(modelo + " acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("A velocidade informada não é maior que a atual");
        }
    }

    public void frear(double novaVelocidade) {
        if (novaVelocidade < velocidade) {
            velocidade = novaVelocidade;
            System.out.println(modelo + " reduziu a velocidade para " + velocidade + " km/h.");
        } else {
            System.out.println("A velocidade informada não é menor que a atual.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
}

