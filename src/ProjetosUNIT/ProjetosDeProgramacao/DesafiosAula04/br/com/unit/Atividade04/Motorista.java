package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade04;

import java.util.ArrayList;

public class Motorista {
    private String nome;
    private String cpf;
    private String carro;
    private String placa;
    private double avaliacaoMedia;
    private ArrayList<Integer> notas;
    private int corridasRealizadas;
    private double ganhoTotal;

    public Motorista(String nome, String cpf, String carro, String placa) {
        this.nome = nome;
        this.cpf = cpf;
        this.carro = carro;
        this.placa = placa;
        this.notas = new ArrayList<>();
    }

    public void registrarCorrida(double valor) {
        ganhoTotal += valor;
        corridasRealizadas++;
        System.out.println("Corrida registrada na conta motorista");
    }

    public double atualizarAvaliacao(int nota) {
        notas.add(nota);
        int soma = 0;
        for (Integer n : notas) {
            soma += nota;
        }
        return avaliacaoMedia = soma / notas.size();
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

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public double getGanhoTotal() {
        return ganhoTotal;
    }

    public void setGanhoTotal(double ganhoTotal) {
        this.ganhoTotal = ganhoTotal;
    }
}
