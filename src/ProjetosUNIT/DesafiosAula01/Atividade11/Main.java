//Escrever um programa para criar uma classe chamada "Banco" com uma coleção de
//contas e métodos para adicionar e remover contas, além de depositar e sacar dinheiro.
//Defina também uma classe chamada "Conta" para manter os detalhes da conta de um
//cliente específico.

package ProjetosUNIT.DesafiosAula01.Atividade11;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Ana", 1234, 1200);
        Conta conta2 = new Conta("Eric", 5678);
        Banco bancoBrasil = new Banco(10);

        bancoBrasil.adicionarConta(conta1);
        bancoBrasil.adicionarConta(conta2);
        bancoBrasil.listarContas();
        conta1.sacarDinheiro(200);
        conta2.depositarDinheiro(500);
        bancoBrasil.listarContas();
    }
}
