package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade04;

public class Corrida {
    private Motorista motorista;
    private Passageiro passageiro;
    private double distanciaKM;
    private double valor;
    private TipoPagamento tipoPagamento;
    private Status status;
    private int notaMotorista;
    private int notaPassageiro;

    public Corrida(Motorista motorista, Passageiro passageiro, double distanciaKM, TipoPagamento tipoPagamento) {
        this.motorista = motorista;
        this.passageiro = passageiro;
        this.distanciaKM = distanciaKM;
        this.tipoPagamento = tipoPagamento;
        this.status = Status.EM_ANDAMENTO;
    }

    public double calcularValor(){
        if (status == Status.CANCELADA) {
            return valor = 7;
        }
        return valor = 5 + (2.5 * distanciaKM);
    }

    public void finalizarCorrida(int notaMotorista, int notaPassageiro){
        if (notaMotorista > 0 && notaMotorista <= 5) {
            if (notaPassageiro > 0 && notaPassageiro <= 5) {

                this.notaMotorista = notaMotorista;
                this.notaPassageiro = notaPassageiro;
                this.status = Status.CONCLUIDA;

                calcularValor();
                motorista.registrarCorrida(valor);
                motorista.atualizarAvaliacao(notaMotorista);
                passageiro.registrarCorrida(valor);
                passageiro.atualizarAvaliacao(notaPassageiro);

            } else {
                System.out.println("Nota do passageiro inválida");
            }
        } else {
            System.out.println("Nota do motorista inválida");
        }
    }

    public void cancelarCorrida(){
        this.status = Status.CANCELADA;
        System.out.println("Corrida cancelada");
        calcularValor();
        motorista.registrarCorrida(valor);
        passageiro.registrarCorrida(valor);
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }

    public void setDistanciaKM(double distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    public void setNotaMotorista(int notaMotorista) {
        this.notaMotorista = notaMotorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public void setNotaPassageiro(int notaPassageiro) {
        this.notaPassageiro = notaPassageiro;
    }
}
