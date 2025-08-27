package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Desafio;

class Email extends Documento {
    private String servidorEmail;
    private String emailDestino;

    public Email(int codigo) {
        super(codigo);
    }

    @Override
    public void imprimir() {
        System.out.println("Email");
        System.out.println("Código: " + codigo);
        System.out.println("Autor: " + autor);
        System.out.println("Data de Criação: " + dataDeCriacao);
        System.out.println("Servidor: " + servidorEmail);
        System.out.println("Email Destino: " + emailDestino);
    }

    @Override
    public void editar() {
        System.out.println("Editando email código " + codigo);
    }

    @Override
    public void verificarAutor(Documento documento) {
        if (this.autor != null && this.autor.equals(documento.getAutor())) {
            System.out.println("Mesmo autor para ambos os documentos: " + this.autor);
        } else {
            System.out.println("Autores diferentes");
        }
    }

    public void enviar() {
        System.out.println("Email enviado para: " + emailDestino);
    }

    public String getServidorEmail() {
        return servidorEmail;
    }

    public void setServidorEmail(String servidorEmail) {
        this.servidorEmail = servidorEmail;
    }

    public String getEmailDestino() {
        return emailDestino;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }
}
