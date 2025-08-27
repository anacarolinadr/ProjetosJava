package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Desafio;

class Telegrama extends Documento {
    private String quantidadeCaractere;
    private double valorTelegrama;

    public Telegrama(int codigo) {
        super(codigo);
    }

    @Override
    public void imprimir() {
        System.out.println("Telegrama");
        System.out.println("Código: " + codigo);
        System.out.println("Autor: " + autor);
        System.out.println("Data de Criação: " + dataDeCriacao);
        System.out.println("Quantidade de Caracteres: " + quantidadeCaractere);
        System.out.println("Valor: R$ " + valorTelegrama);
    }

    @Override
    public void editar() {
        System.out.println("Editando telegrama código " + codigo);
    }

    @Override
    public void verificarAutor(Documento documento) {
        if (this.autor != null && this.autor.equals(documento.getAutor())) {
            System.out.println("Mesmo autor para ambos os documentos: " + this.autor);
        } else {
            System.out.println("Autores diferentes");
        }
    }

    public void pagar() {
        System.out.println("Telegrama pago. Valor: R$ " + valorTelegrama);
    }

    public String getQuantidadeCaractere() {
        return quantidadeCaractere;
    }

    public void setQuantidadeCaractere(String quantidadeCaractere) {
        this.quantidadeCaractere = quantidadeCaractere;
    }

    public double getValorTelegrama() {
        return valorTelegrama;
    }

    public void setValorTelegrama(double valorTelegrama) {
        this.valorTelegrama = valorTelegrama;
    }
}