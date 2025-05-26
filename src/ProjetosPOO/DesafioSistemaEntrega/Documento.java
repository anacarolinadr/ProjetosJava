package ProjetosPOO.DesafioSistemaEntrega;

public class Documento implements Entregavel{
    private String remetente;
    private String destinatario;
    private int numeroPaginas;
    private StatusEntrega statusEntrega;

    public Documento(String remetente, String destinatario, int numeroPaginas) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.numeroPaginas = numeroPaginas;
        this.statusEntrega = StatusEntrega.PREPARANDO;
    }

    @Override
    public void entregar() {
        System.out.println("Documento entregue, por favor confirme a entrega ao destinatario");
        System.out.println(
                "Entregando documento de " + remetente + " para " + destinatario +
                ". Conteudo com " + numeroPaginas + " folhas."
        );
        setStatusEntrega(StatusEntrega.ENTREGUE);
    }

    public StatusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(StatusEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
