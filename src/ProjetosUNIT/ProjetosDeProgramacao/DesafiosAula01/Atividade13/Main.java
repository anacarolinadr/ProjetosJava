//Escrever um programa para criar uma classe chamada "Restaurante" com atributos para
//itens do menu, preços e classificações, e métodos para adicionar e remover itens e para
//calcular a classificação média.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade13;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Macarronada", 30, 8);
        Item item2 = new Item("Lasanha", 25, 9);
        Item item3 = new Item("Suco de Manga", 12, 5);

        Menu menu = new Menu(10);
        menu.adicionarItem(item1);
        menu.adicionarItem(item2);
        menu.adicionarItem(item3);

        Restaurante restauranteItalia = new Restaurante(menu);
        restauranteItalia.menu.mostrarClassificacao();
    }
}
