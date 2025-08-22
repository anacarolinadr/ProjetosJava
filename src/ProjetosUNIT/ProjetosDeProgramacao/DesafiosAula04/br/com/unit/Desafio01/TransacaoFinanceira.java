package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

import java.time.LocalDateTime;

public class TransacaoFinanceira {
    private Aluno aluno;
    private Curso curso;
    private double valorPago;
    private FormaPagamento formaPagamento;
    private LocalDateTime dataTransacao;
    private double valorInstrutor;
    private double valorPlataforma;

    public TransacaoFinanceira(Aluno aluno, Curso curso, FormaPagamento formaPagamento) {
        this.aluno = aluno;
        this.curso = curso;
        this.valorPago = curso.getValorMatricula();
        this.formaPagamento = formaPagamento;
        this.dataTransacao = LocalDateTime.now();
        calcularDivisaoValores();
    }

    private void calcularDivisaoValores() {
        this.valorInstrutor = valorPago * 0.7;
        this.valorPlataforma = valorPago * 0.3;
    }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }

    public double getValorPago() { return valorPago; }
    public void setValorPago(double valorPago) { this.valorPago = valorPago; }

    public FormaPagamento getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(FormaPagamento formaPagamento) { this.formaPagamento = formaPagamento; }

    public LocalDateTime getDataTransacao() { return dataTransacao; }
    public void setDataTransacao(LocalDateTime dataTransacao) { this.dataTransacao = dataTransacao; }

    public double getValorInstrutor() { return valorInstrutor; }
    public double getValorPlataforma() { return valorPlataforma; }
}
