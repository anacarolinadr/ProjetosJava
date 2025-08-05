package ProjetosUNIT.DesafiosAula02.Atividade03;

public class ConjuntoMaca {
    public double qtdMacas;

    public ConjuntoMaca(int qtdMacas) {
        this.qtdMacas = qtdMacas;
    }

    public double calcularValorFinal(){
        double valor = qtdMacas < 12 ? 0.3 : 0.25;
        return qtdMacas * valor;
    }

    public double getQtdMacas() {
        return qtdMacas;
    }

    public void setQtdMacas(double qtdMacas) {
        this.qtdMacas = qtdMacas;
    }
}
