package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade11;

public class Banco {
    public Conta [] contas;
    public int contador;

    public Banco(int tamanhoMaximo) {
        contas = new Conta[tamanhoMaximo];
        contador = 0;
    }

    public boolean adicionarConta(Conta conta) {
        if (contador < contas.length) {
            contas[contador] = conta;
            contador++;
            return true;
        } else {
            System.out.println("Banco cheio, crescer espaço no banco.");
            return false;
        }
    }

    public boolean removerConta(double codigoConta) {
        for (int i = 0; i < contador; i++) {
            if (contas[i].getCodigoConta() == codigoConta) {
                for (int j = i; j < contador - 1; j++) {
                    contas[j] = contas[j + 1];
                }
                contas[contador - 1] = null;
                contador--;
                return true;
            }
        }
        System.out.println("Conta com código " + codigoConta + " não encontrada.");
        return false;
    }

    public void listarContas() {
        System.out.println("Contas atuais no Banco:");
        for (int i = 0; i < contador; i++) {
            Conta c = contas[i];
            System.out.println("- Código: " + c.getCodigoConta() + " de " + c.getCliente() + " (Valor: " + c.getDinheiroConta() + ")");
        }
    }
}
