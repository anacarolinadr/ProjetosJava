package ProjetosPOO.DesafioSistemaEntrega;

public class Alimento implements Entregavel{
    private String nome;
    private double quantidade;
    private String enderecoEntrega;
    private StatusEntrega statusEntrega;

    public Alimento(String nome, double quantidade, String enderecoEntrega) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.enderecoEntrega = enderecoEntrega;
        this.statusEntrega = StatusEntrega.PREPARANDO;
    }

    @Override
    public void entregar() {
        System.out.println("Alimento entregue, confirme se a qualidade está boa!");
        System.out.println("Entregando " + nome + " para " + enderecoEntrega + ", quantidade: "+ quantidade);
        setStatusEntrega(StatusEntrega.ENTREGUE);
    }

    public StatusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(StatusEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
}
