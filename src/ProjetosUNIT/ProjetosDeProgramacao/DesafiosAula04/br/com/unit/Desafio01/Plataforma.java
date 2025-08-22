package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Desafio01;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Plataforma {
    private String nome;
    private ArrayList<Curso> cursos;
    private ArrayList<Aluno> alunos;
    private ArrayList<Instrutor> instrutores;
    private ArrayList<TransacaoFinanceira> transacoes;
    private int contadorAlunos;
    private int contadorInstrutores;

    public Plataforma(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.instrutores = new ArrayList<>();
        this.transacoes = new ArrayList<>();
        this.contadorAlunos = 1;
        this.contadorInstrutores = 1;
    }

    public boolean matricularAluno(Aluno aluno, Curso curso, FormaPagamento formaPagamento) {
        if (curso.getStatus() == Status.ATIVO) {
            TransacaoFinanceira transacao = new TransacaoFinanceira(aluno, curso, formaPagamento);
            transacoes.add(transacao);

            boolean matriculado = aluno.matricularCurso(curso);
            if (matriculado) {
                System.out.println("Transação realizada com sucesso!");
                System.out.println("Valor pago: R$ " + String.format("%.2f", transacao.getValorPago()) + " | Forma: " + formaPagamento);
                return true;
            }
        }
        return false;
    }

    public String gerarMatriculaAluno() {
        String matricula;
        do {
            matricula = String.format("ALU%04d", contadorAlunos);
            contadorAlunos++;
        } while (matriculaExiste(matricula));
        return matricula;
    }

    public String gerarMatriculaInstrutor() {
        String matricula;
        do {
            matricula = String.format("INST%04d", contadorInstrutores);
            contadorInstrutores++;
        } while (matriculaExiste(matricula));
        return matricula;
    }

    private boolean matriculaExiste(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() != null && aluno.getMatricula().equals(matricula)) {
                return true;
            }
        }
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getMatricula() != null && instrutor.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    public Aluno cadastrarAluno(String nome, String cpf, String dataNascimento) {
        Aluno aluno = new Aluno(nome, cpf, dataNascimento);
        String matricula = gerarMatriculaAluno();
        aluno.setMatricula(matricula);
        alunos.add(aluno);

        System.out.println("Aluno cadastrado: " + nome + ". Matrícula: " + matricula);
        return aluno;
    }

    public Instrutor cadastrarInstrutor(String nome, String cpf, String dataNascimento) {
        Instrutor instrutor = new Instrutor(nome, cpf, dataNascimento);
        String matricula = gerarMatriculaInstrutor();
        instrutor.setMatricula(matricula);
        instrutores.add(instrutor);

        System.out.println("Instrutor cadastrado: " + nome + ". Matrícula: " + matricula);
        return instrutor;
    }

    public void relatorioCursosMaisPopulares() {
        cursos.stream()
                .sorted((c1, c2) -> Integer.compare(c2.getAlunos().size(), c1.getAlunos().size()))
                .limit(5)
                .forEach(curso -> {
                    System.out.println("Curso " + curso.getTitulo() + " possui " + curso.getAlunos().size() + " alunos");
                });
    }

    public void relatorioInstrutoresMelhorAvaliados() {
        instrutores.stream()
                .sorted((i1, i2) -> {
                    int totalAlunos1 = i1.getCursos().stream()
                            .mapToInt(c -> c.getAlunos().size())
                            .sum();
                    int totalAlunos2 = i2.getCursos().stream()
                            .mapToInt(c -> c.getAlunos().size())
                            .sum();
                    return Integer.compare(totalAlunos2, totalAlunos1);
                })
                .limit(5)
                .forEach(instrutor -> {
                    int totalAlunos = instrutor.getCursos().stream()
                            .mapToInt(c -> c.getAlunos().size())
                            .sum();
                    System.out.println(instrutor.getNome() + ": " + instrutor.getCursos().size() + " curso(s), " + totalAlunos + " alunos total");
                });
    }

    public void relatorioFinanceiro(LocalDateTime inicio, LocalDateTime fim) {
        double totalArrecadado = transacoes.stream()
                .filter(t -> t.getDataTransacao().isAfter(inicio) &&
                        t.getDataTransacao().isBefore(fim))
                .mapToDouble(TransacaoFinanceira::getValorPago)
                .sum();

        double totalPlataforma = transacoes.stream()
                .filter(t -> t.getDataTransacao().isAfter(inicio) &&
                        t.getDataTransacao().isBefore(fim))
                .mapToDouble(TransacaoFinanceira::getValorPlataforma)
                .sum();

        System.out.println("Total arrecadado: R$ " + String.format("%.2f", totalArrecadado));
        System.out.println("Receita da plataforma: R$ " + String.format("%.2f", totalPlataforma));
    }

    public void relatorioGastoMedioAlunos() {
        Map<Aluno, Double> gastosPorAluno = new HashMap<>();

        for (TransacaoFinanceira t : transacoes) {
            gastosPorAluno.merge(t.getAluno(), t.getValorPago(), Double::sum);
        }

        double gastoMedio = gastosPorAluno.values().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Gasto médio por aluno: R$ " + String.format("%.2f", gastoMedio));
        System.out.println("Total de alunos ativos: " + gastosPorAluno.size());
    }

    public void relatorioFormasPagamento() {
        Map<FormaPagamento, Long> formasPagamento = transacoes.stream()
                .collect(Collectors.groupingBy(
                        TransacaoFinanceira::getFormaPagamento,
                        Collectors.counting()
                ));

        formasPagamento.entrySet().stream()
                .sorted(Map.Entry.<FormaPagamento, Long>comparingByValue().reversed())
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue() + " transações");
                });
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public ArrayList<Curso> getCursos() { return cursos; }
    public void setCursos(ArrayList<Curso> cursos) { this.cursos = cursos; }

    public ArrayList<Aluno> getAlunos() { return alunos; }
    public void setAlunos(ArrayList<Aluno> alunos) { this.alunos = alunos; }

    public ArrayList<Instrutor> getInstrutores() { return instrutores; }
    public void setInstrutores(ArrayList<Instrutor> instrutores) { this.instrutores = instrutores; }

    public ArrayList<TransacaoFinanceira> getTransacoes() { return transacoes; }
    public void setTransacoes(ArrayList<TransacaoFinanceira> transacoes) { this.transacoes = transacoes; }
}