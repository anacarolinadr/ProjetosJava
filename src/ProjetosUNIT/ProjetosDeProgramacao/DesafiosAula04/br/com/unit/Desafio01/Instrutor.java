package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

import java.util.ArrayList;

public class Instrutor extends Pessoa{
    private ArrayList<Curso> cursos;
    private ArrayList<Avaliacao> avaliacoesRecebidas;

    public Instrutor(String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.cursos = new ArrayList<>();
        this.avaliacoesRecebidas = new ArrayList<>();
    }

    @Override
    public void gerenciarAvaliacao(Avaliacao avaliacao) {
        if (cursos.contains(avaliacao.getCurso())) {
            avaliacoesRecebidas.add(avaliacao);
            System.out.println("Instrutor " + this.getNome() + " recebeu avaliação do curso " +
                    avaliacao.getCurso().getTitulo());
        }
    }

    public void criarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void gerenciarConteudo(Conteudo conteudo, Curso curso){
        if (cursos.contains(curso)) {
            curso.addConteudo(conteudo);
        }
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Avaliacao> getAvaliacoesRecebidas() {
        return avaliacoesRecebidas;
    }

    public void setAvaliacoesRecebidas(ArrayList<Avaliacao> avaliacoesRecebidas) {
        this.avaliacoesRecebidas = avaliacoesRecebidas;
    }
}
