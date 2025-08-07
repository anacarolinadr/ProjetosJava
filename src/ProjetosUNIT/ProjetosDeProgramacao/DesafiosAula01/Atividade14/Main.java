//Escrever um programa para criar uma classe chamada "Animal de Estimação" com
//atributos para nome, espécie e idade. Crie subclasses "Cachorro" e "Pássaro" que
//adicionem atributos específicos, como brinquedo favorito para cães e envergadura para
//pássaros. Implemente métodos para exibir detalhes do animal de estimação e calcular a
//idade do animal em anos humanos.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade14;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Nescau", "Yorkshire", 7, "Urso azul");
        Passaro passaro = new Passaro("Lala", "Calopsita", 4, 15);

        cachorro.exibirDetalhes();
        cachorro.brincar();
        System.out.println("Idade humana: " + cachorro.calcularIdade());
        passaro.exibirDetalhes();
        System.out.println("Idade humana: " + passaro.calcularIdade());
    }
}
