package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade15;

public class ProdutoEletronico {
    protected String nome;
    protected int ID;
    protected double valor;
    protected double valorFinal;
    protected double percentualDesconto = 0;

    public ProdutoEletronico(String nome, int ID, double valor) {
        this.nome = nome;
        this.ID = ID;
        this.valor = valor;
        this.valorFinal = valor;
    }

    public double aplicarDesconto(double percentualDesconto){
        this.percentualDesconto = percentualDesconto;
        this.valorFinal = valor - (valor * this.percentualDesconto / 100);
        return this.valorFinal;
    }

    public double calcularValorFinal() {
        return this.valorFinal;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + ID);
        System.out.println("Valor do produto: " + valor);
        System.out.println("Valor do desconto: " + percentualDesconto);
        System.out.println("Valor com desconto: " + valorFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
