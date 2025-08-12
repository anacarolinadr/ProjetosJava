//Crie uma classe para representar um carro com os atributos privados
//de tipo, cor, placa e numero de portas.

//Crie os métodos públicos necessários para sets e gets e também um
//método para imprimir todos dados de um carro.

//Na sequência implemente uma classe com método main para
//instanciar o carro, solicitar seus dados e depois imprimi-los.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula03.Atividade01;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Sedan", "Branca", "ACP1234", 5);
        Carro carro2 = new Carro("SUV", "Preto", "GSS1234", 3);

        carro1.exibirDados();
        carro2.exibirDados();
    }
}
