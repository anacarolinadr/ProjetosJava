package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private ArrayList<Curso> cursos;

    public Aluno(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.cursos = new ArrayList<>();
    }

    @Override
    public void gerenciarAvaliacao(Avaliacao avaliacao) {
        if (cursos.contains(avaliacao.getCurso())) {
            avaliacao.getCurso().receberAvaliacao(avaliacao);
            System.out.println("Avaliação realizada por " + this.getNome() + " para o curso " +
                    avaliacao.getCurso().getTitulo());
        } else {
            System.out.println("Aluno não está matriculado neste curso para avaliar");
        }
    }

    public boolean matricularCurso(Curso curso) {
        if (curso.getStatus() == Status.ATIVO && !cursos.contains(curso)) {
            cursos.add(curso);
            curso.getAlunos().add(this);
            System.out.println("Aluno: " + this.getNome() + " matriculado no curso: " + curso.getTitulo());
            return true;
        }
        System.out.println("Não foi possível matricular no curso " + curso.getTitulo());
        return false;
    }

    public void finalizarCurso(Curso curso, Certificado certificado) {
        if (cursos.contains(curso)) {
            curso.gerarCertificado(this, certificado);
            System.out.println("Curso finalizado com sucesso!");
        } else {
            System.out.println("Aluno não está matriculado neste curso.");
        }
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
