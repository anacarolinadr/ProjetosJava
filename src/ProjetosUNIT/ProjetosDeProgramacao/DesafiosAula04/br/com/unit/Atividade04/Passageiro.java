package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade04;

import java.util.ArrayList;

public class Passageiro {
    private String nome;
    private String cpf;
    private TipoPagamento tipoPagamento;
    private double avaliacaoMedia;
    private ArrayList<Integer> notas;
    private int corridasRealizadas;
    private double gastoTotal;

    public Passageiro(String nome, String cpf, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoPagamento = tipoPagamento;
        this.notas = new ArrayList<>();
    }

    public void registrarCorrida(double valor) {
        gastoTotal += valor;
        corridasRealizadas++;
        System.out.println("Corrida registrada na conta passageiro");
    }

    public void atualizarAvaliacao(int nota) {
        notas.add(nota);
        int soma = 0;
        for (int n : notas) {
            soma += n;
        }
        avaliacaoMedia = (double) soma / notas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(double avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public int getCorridasRealizadas() {
        return corridasRealizadas;
    }

    public void setCorridasRealizadas(int corridasRealizadas) {
        this.corridasRealizadas = corridasRealizadas;
    }

    public double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }
}
