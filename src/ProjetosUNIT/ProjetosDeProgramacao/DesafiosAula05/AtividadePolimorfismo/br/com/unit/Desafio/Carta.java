package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Desafio;

class Carta extends Documento {
    private String endereco;
    private String formaEnvio;

    public Carta(int codigo) {
        super(codigo);
    }

    @Override
    public void imprimir() {
        System.out.println("Carta:");
        System.out.println("Código: " + codigo);
        System.out.println("Autor: " + autor);
        System.out.println("Data de Criação: " + dataDeCriacao);
        System.out.println("Endereço: " + endereco);
        System.out.println("Forma de Envio: " + formaEnvio);
    }

    @Override
    public void editar() {
        System.out.println("Editando carta, código: " + codigo);
    }

    @Override
    public void verificarAutor(Documento documento) {
        if (this.autor != null && this.autor.equals(documento.getAutor())) {
            System.out.println("Mesmo autor para ambos os documentos: " + this.autor);
        } else {
            System.out.println("Autores diferentes");
        }
    }

    public void anexar() {
        System.out.println("Anexo adicionado à carta");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormaEnvio() {
        return formaEnvio;
    }

    public void setFormaEnvio(String formaEnvio) {
        this.formaEnvio = formaEnvio;
    }
}
