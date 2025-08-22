package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

public class Certificado {
    private Curso curso;
    private Aluno aluno;
    private String descricao;

    public Certificado(Curso curso, Aluno aluno, String descricao) {
        this.curso = curso;
        this.aluno = aluno;
        this.descricao = descricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
