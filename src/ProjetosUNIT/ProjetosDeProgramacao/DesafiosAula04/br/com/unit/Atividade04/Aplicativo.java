package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade04;

import java.util.ArrayList;
import java.util.Comparator;

public class Aplicativo {
    private String nome;
    private ArrayList<Motorista> motoristas;
    private ArrayList<Passageiro> passageiros;
    private ArrayList<Corrida> corridas;

    public Aplicativo(String nome) {
        this.nome = nome;
        this.motoristas = new ArrayList<>();
        this.passageiros = new ArrayList<>();
        this.corridas = new ArrayList<>();
    }

    public void listarPassageirosFieis(){
        int qtdPassageiros = 0;
        for (Passageiro p : passageiros) {
            if (p.getCorridasRealizadas() >= 10) {
                System.out.println("Passageiro: " + p.getNome() + " é fiel");
                qtdPassageiros++;
            }
        }
        if (qtdPassageiros == 0) {
            System.out.println("Não há passageiros fieis cadastrados");
        }
    }

    public void listarMelhoresMotoristas(int top) {
        motoristas.stream()
            .sorted(Comparator.comparingDouble(Motorista::getAvaliacaoMedia).reversed())
            .limit(top)
            .forEach(m -> System.out.println(
                    m.getNome() + " | Avaliação: " + String.format("%.2f", m.getAvaliacaoMedia())
            ));
    }

    public double calcularFaturamentoTotal(){
        int somaTotal = 0;
        for (Corrida c : corridas) {
            if (c.getStatus() == Status.CONCLUIDA) {
                somaTotal += c.calcularValor();
            }
        }
        return somaTotal;
    }

    public void gerarRelatorioFormasPagamento(){
        int pagPix = 0;
        int pagDin = 0;
        int pagCartao = 0;
        for (Corrida c : corridas) {
            if (c.getTipoPagamento() == TipoPagamento.PIX) {
                pagPix++;
            } else if (c.getTipoPagamento() == TipoPagamento.DINHEIRO) {
                pagDin++;
            } else {
                pagCartao++;
            }
        }
        System.out.println("Pagamentos em PIX: " + pagPix);
        System.out.println("Pagamentos em Dinheiro: " + pagDin);
        System.out.println("Pagamentos em Cartão: " + pagCartao);
    }

    public void mediaGastosPorPassageiro() {
        for (Passageiro p : passageiros) {
            if (p.getCorridasRealizadas() > 0) {
                double media = p.getGastoTotal() / p.getCorridasRealizadas();
                System.out.println("Passageiro: " + p.getNome() +
                        " | Média de gastos por corrida: R$ " + String.format("%.2f", media));
            } else {
                System.out.println("Passageiro: " + p.getNome() + " ainda não realizou corridas");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(ArrayList<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public ArrayList<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(ArrayList<Corrida> corridas) {
        this.corridas = corridas;
    }
}
