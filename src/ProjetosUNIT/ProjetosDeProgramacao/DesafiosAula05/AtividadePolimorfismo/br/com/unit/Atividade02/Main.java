package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula05.AtividadePolimorfismo.br.com.unit.Atividade02;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Ônibus", 60.0, 40, 150.0);
        Carro c1 = new Carro("Sedan", 0.0, 5, 50.0, 1);

        v1.acelerar(80);
        v1.frear(40);

        c1.acelerar(2); // muda a marcha e aumenta velocidade
        c1.frear(20);
    }
}

