package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Desafio;

import java.util.Date;

class Documento {
    protected int codigo;
    protected String autor;
    protected Date dataDeCriacao;

    public Documento(int codigo) {
        this.codigo = codigo;
        this.dataDeCriacao = new Date();
    }

    public void imprimir() {};

    public void editar() {};

    public void verificarAutor(Documento documento) {};

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }
}
