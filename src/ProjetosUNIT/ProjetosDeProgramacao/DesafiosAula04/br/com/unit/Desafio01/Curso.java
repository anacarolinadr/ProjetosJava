package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

import java.util.ArrayList;

public class Curso {
    private String titulo;
    private String descricao;
    private Instrutor responsavel;
    private NivelDificuldade nivelDificuldade;
    private double valorMatricula;
    private Status status;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;
    private ArrayList<Certificado> certificadosGerados;
    private ArrayList<Conteudo> conteudos;

    public Curso(String titulo, String descricao, Instrutor responsavel, NivelDificuldade nivelDificuldade, double valorMatricula, Status status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.nivelDificuldade = nivelDificuldade;
        this.valorMatricula = valorMatricula;
        this.status = status;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
        this.certificadosGerados = new ArrayList<>();
        this.conteudos = new ArrayList<>();
    }

    public boolean receberAvaliacao(Avaliacao avaliacao) {
        return avaliacoes.add(avaliacao);
    }

    public void medirPopularidade(){
        if (alunos.size() == 0) {
            System.out.println("Curso está no inicio com nenhum aluno");
        } else if (alunos.size() > 10) {
            System.out.println("Curso está bombando! Já esta com " + alunos.size() + " alunos");
        } else {
            System.out.println("Curso está fraco em popularidade visto que está com " + alunos.size() + " alunos");
        }
    }

    public void gerarCertificado(Aluno aluno, Certificado certificado){
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(aluno.getMatricula())) {
                System.out.println("Aluno: " + a.getNome() + " finalizou o curso " + this.titulo);
                certificadosGerados.add(certificado);
            }
        }
    }

    public void addConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }

    public ArrayList<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(ArrayList<Conteudo> conteudos) {
        this.conteudos = conteudos;
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

    public Instrutor getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Instrutor responsavel) {
        this.responsavel = responsavel;
    }

    public NivelDificuldade getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(NivelDificuldade nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public ArrayList<Certificado> getCertificadosGerados() {
        return certificadosGerados;
    }

    public void setCertificadosGerados(ArrayList<Certificado> certificadosGerados) {
        this.certificadosGerados = certificadosGerados;
    }
}
