package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade05;

public class Operacao {
    public double numero1;
    public double numero2;
    public TipoOperacao tipoOperacao;

    public Operacao(double numero1, double numero2, TipoOperacao tipoOperacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.tipoOperacao = tipoOperacao;
    }

    public double calcular(){
        switch (tipoOperacao) {
            case SOMA:
                return numero1 + numero2;
            case SUBTRACAO:
                return numero1 - numero2;
            case MULTIPLICACAO:
                return numero1 * numero2;
            case DIVISAO:
                if (numero2 == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida!");
                }
                return numero1 / numero2;
            default:
                throw new IllegalArgumentException("Operação não suportada!");
        }
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
}
