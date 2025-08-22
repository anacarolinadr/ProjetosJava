package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

public class Avaliacao {
    private String titulo;
    private String descricao;
    private double nota;
    private Curso curso;
    private Aluno avaliador;

    public Avaliacao(String titulo, String descricao, double nota, Curso curso, Aluno avaliador) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nota = Math.max(0, Math.min(10, nota));
        this.curso = curso;
        this.avaliador = avaliador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Aluno avaliador) {
        this.avaliador = avaliador;
    }
}
