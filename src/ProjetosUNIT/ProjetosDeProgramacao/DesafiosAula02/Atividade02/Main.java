//Escreva um programa que pede para o usuário informar a sua idade, e
// em seguida, o programa deve imprimir a idade informada pelo usuário.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula02.Atividade02;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Ana", 19);
        Usuario user2 = new Usuario("Eric", 15);

        user1.exibirDetalhes();
        user2.exibirDetalhes();
    }
}
