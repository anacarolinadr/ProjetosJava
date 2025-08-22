package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

public class Conteudo {
    private String descricao;
    private Curso curso;

    public Conteudo(String descricao, Curso curso) {
        this.descricao = descricao;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
