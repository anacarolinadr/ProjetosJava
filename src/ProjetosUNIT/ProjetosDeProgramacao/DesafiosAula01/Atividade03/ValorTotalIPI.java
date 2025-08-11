package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade03;

public class ValorTotalIPI {
    private double codigo1;
    private double codigo2;
    private double valorUnitario1;
    private double valorUnitario2;
    private double qtdPecas1;
    private double qtdPecas2;
    private double ipi;

    public ValorTotalIPI(double valorUnitario1, double valorUnitario2, double qtdPecas1, double qtdPecas2, double ipi) {
        this.valorUnitario1 = valorUnitario1;
        this.valorUnitario2 = valorUnitario2;
        this.qtdPecas1 = qtdPecas1;
        this.qtdPecas2 = qtdPecas2;
        this.ipi = ipi;
    }

    public double calcularValorTotal() {
        double valorTotal = (this.valorUnitario1 * this.qtdPecas1 + this.valorUnitario2 * this.qtdPecas2) * (this.ipi / 100 + 1);
        return valorTotal;
    }
}
