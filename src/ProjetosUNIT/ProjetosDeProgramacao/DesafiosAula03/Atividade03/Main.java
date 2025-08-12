//Crie uma classe denominada Elevador para armazenar as informações
//de um elevador dentro de um prédio. A classe deve armazenar o andar
//atual (térreo = 0), total de andares no prédio (desconsiderando o
//térreo), capacidade do elevador e quantas pessoas estão presentes
//nele.
//
//Na sequência implemente uma classe com método main para instanciar
//o elevador e manipular seus dados.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula03.Atividade03;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 10);

        elevador.andarElevador(12, 9);
        elevador.andarElevador(3, 12);
        elevador.andarElevador(4, 2);
        elevador.andarElevador(5,8);
    }
}
