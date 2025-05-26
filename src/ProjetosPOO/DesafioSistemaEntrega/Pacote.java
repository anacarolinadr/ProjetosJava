package ProjetosPOO.DesafioSistemaEntrega;

public class Pacote implements Entregavel{
    private double peso;
    private String enderecoDestino;
    private boolean fragil;
    private StatusEntrega statusEntrega;

    public Pacote(double peso, String enderecoDestino, boolean fragil) {
        this.peso = peso;
        this.enderecoDestino = enderecoDestino;
        this.fragil = fragil;
        this.statusEntrega = StatusEntrega.PREPARANDO;
    }

    @Override
    public void entregar() {
        System.out.println("Pacote entregue, por favor confirme no app a entrega");
        System.out.println(
                "Entregando pacote de " + peso + " para " +
                enderecoDestino + ", conteúdo " + verificarFragilidade()
        );
        setStatusEntrega(StatusEntrega.ENTREGUE);
    }

    public String verificarFragilidade(){
        if (isFragil()){
            return "FRAGIL";
        } else {
            return "Conteúdo normal";
        }
    }

    public StatusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(StatusEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setEnderecoDestino(String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
}
