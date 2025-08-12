//Faça um programa com as seguintes características:
//        • Uma classe chamada Universidade que terá como atributo um nome e seus get e set;
//• Uma classe chamada Pessoa com atributo cpf, nome e data de nascimento e seus get e set;
//• Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá ser associada a
//uma Universidade;
//• Criar dois objetos de Universidade;
//• Criar dois objetos da classe Pessoa;
//• Einstein trabalhou na Universidade de Princeton;
//• Newton trabalhou na Universidade de Cambridge.
//        • Criar um programa principal para manipular esses objetos e imprimir os dados das duas pessoas.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula03.Atividade04;

public class Main {
    public static void main(String[] args) {
        Universidade universidade1 = new Universidade("UNIT");
        Universidade universidade2 = new Universidade("UFS");

        Pessoa pessoa1 = new Pessoa("Ana", "123456789", "15/05/2006");
        Pessoa pessoa2 = new Pessoa("Mariano", "987654321", "05/03/2006");
        Pessoa pessoa3 = new Pessoa("Gabriel", "11111111", "21/01/2005");

        pessoa1.setUniversidade(universidade1);
        pessoa2.setUniversidade(universidade2);

        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();
    }
}
