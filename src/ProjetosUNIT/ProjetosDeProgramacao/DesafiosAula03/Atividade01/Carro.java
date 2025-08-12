package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula03.Atividade01;

public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int qtdPortas;

    public Carro(String tipo, String cor, String placa, int qtdPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.qtdPortas = qtdPortas;
    }

    public void exibirDados(){
        System.out.println("O carro é do tipo " + tipo);
        System.out.println("O carro é da cor " + cor);
        System.out.println("A placa do carro é " + placa);
        System.out.println("O carro tem " + qtdPortas + " portas");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
}
