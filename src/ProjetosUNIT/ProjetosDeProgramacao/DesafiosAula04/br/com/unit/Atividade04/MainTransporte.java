package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade04;

public class MainTransporte {
    public static void main(String[] args) {
        Aplicativo app = new Aplicativo("App Transporte");

        Motorista m1 = new Motorista("Carlos", "11111111111", "Onix", "ABC-1234");
        Motorista m2 = new Motorista("Mariana", "22222222222", "HB20", "DEF-5678");
        Motorista m3 = new Motorista("João", "33333333333", "Corolla", "GHI-9012");
        app.getMotoristas().add(m1);
        app.getMotoristas().add(m2);
        app.getMotoristas().add(m3);

        Passageiro p1 = new Passageiro("Ana", "44444444444", TipoPagamento.CARTAO);
        Passageiro p2 = new Passageiro("Pedro", "55555555555", TipoPagamento.PIX);
        Passageiro p3 = new Passageiro("Julia", "66666666666", TipoPagamento.DINHEIRO);
        app.getPassageiros().add(p1);
        app.getPassageiros().add(p2);
        app.getPassageiros().add(p3);

        Corrida c1 = new Corrida(m1, p1, 10, TipoPagamento.CARTAO); // corrida de 10km
        Corrida c2 = new Corrida(m2, p2, 5, TipoPagamento.PIX);     // corrida de 5km
        Corrida c3 = new Corrida(m3, p3, 8, TipoPagamento.DINHEIRO);// corrida de 8km
        app.getCorridas().add(c1);
        app.getCorridas().add(c2);
        app.getCorridas().add(c3);

        c2.cancelarCorrida();
        c1.finalizarCorrida(5, 4);
        c3.finalizarCorrida(4, 5);

        app.listarMelhoresMotoristas(3);
        app.gerarRelatorioFormasPagamento();
        app.calcularFaturamentoTotal();
        app.mediaGastosPorPassageiro();
    }
}
