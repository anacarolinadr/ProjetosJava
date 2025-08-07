package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade15;

public class MaquinaDeLavar extends ProdutoEletronico{
    public int periodoGarantia;

    public MaquinaDeLavar(String nome, int ID, double valor, int periodoGarantia) {
        super(nome, ID, valor);
        this.periodoGarantia = periodoGarantia;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto) {
        return super.aplicarDesconto(percentualDesconto);
    }

    public int extenderGarantia(int periodoExtra){
        System.out.println("Parabéns! Seu período de garantia agora é de " + (periodoGarantia + periodoExtra) + " anos!");
        return this.periodoGarantia += periodoExtra;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }

    public int getPeriodoGarantia() {
        return periodoGarantia;
    }

    public void setPeriodoGarantia(int periodoGarantia) {
        this.periodoGarantia = periodoGarantia;
    }
}
