package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade11;

public class Conta {
    private String cliente;
    private double codigoConta;
    private double dinheiroConta = 0;

    public Conta(String cliente, double codigoConta) {
        this.cliente = cliente;
        this.codigoConta = codigoConta;
    }

    public Conta(String cliente, double codigoConta, double dinheiroConta) {
        this.cliente = cliente;
        this.codigoConta = codigoConta;
        this.dinheiroConta = dinheiroConta;
    }

    public double depositarDinheiro(double valor){
        return dinheiroConta += valor;
    }

    public double sacarDinheiro(double valor){
        return dinheiroConta -= valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(double codigoConta) {
        this.codigoConta = codigoConta;
    }

    public double getDinheiroConta() {
        return dinheiroConta;
    }

    public void setDinheiroConta(double dinheiroConta) {
        this.dinheiroConta = dinheiroConta;
    }
}
