package DesafioGestaoEscolar;

public class Aluno extends Pessoa{
    private double media;
    private double mensalidade;

    public Aluno(String nome, int idade, double media, double mensalidade) {
        super(nome, idade);
        this.media = media;
        this.mensalidade = mensalidade;
    }

    public double gerarDescontoMensalidade(){
        if (media > 7){
            return 0.2;
        } else {
            return 0;
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Desconto aplicado: " + (gerarDescontoMensalidade() * 100) + "%");
        System.out.println("Mensalidade final: " + (mensalidade - (gerarDescontoMensalidade() * mensalidade)));
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
