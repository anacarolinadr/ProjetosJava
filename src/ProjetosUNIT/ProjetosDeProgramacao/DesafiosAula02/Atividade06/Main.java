//Escreva um programa em Java para ler a quantidade de pessoas, nome,
//idade, altura e peso de cada pessoa. Em seguida calcule o IMC, mostre
//o nome da pessoa e se a pessoa está abaixo do peso ideal, no peso
//normal, com sobrepeso, obesidade grau I, obesidade grau II ou
//obesidade grau III.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade06;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 19, 1.6, 50);
        Pessoa pessoa2 = new Pessoa("Luis", 19, 1.5, 80);

        pessoa1.exibirClassificacao();
        pessoa2.exibirClassificacao();
    }
}
