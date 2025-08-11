package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade13;

public class Menu {
    public Item menu [];
    public int contador;
    public int tamanhoMaximo;

    public Menu(int tamanhoMaximo) {
        this.menu = new Item[tamanhoMaximo];
        contador = 0;
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public Menu(Item[] menu, int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.menu = new Item[tamanhoMaximo];
        if (menu != null) {
            int limite = Math.min(menu.length, tamanhoMaximo);
            for (int i = 0; i < limite; i++) {
                this.menu[i] = menu[i];
                this.contador++;
            }
        }
    }

    public boolean adicionarItem(Item item) {
        if (contador < menu.length) {
            menu[contador] = item;
            contador++;
            return true;
        } else {
            System.out.println("Menu cheio, será necessário adicionar espaço ao menu.");
            return false;
        }
    }

    public boolean removerItem(String nome) {
        for (int i = 0; i < contador; i++) {
            if (menu[i].getNome() == nome) {
                for (int j = i; j < contador - 1; j++) {
                    menu[j] = menu[j + 1];
                }
                menu[contador - 1] = null;
                contador--;
                return true;
            }
        }
        System.out.println("Item: " + nome + " não encontrado.");
        return false;
    }

    public void mostrarClassificacao() {
        double soma = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("Item: " + menu[i].getNome() + ", possui classificação: "+ menu[i].getClassificacao());
            soma += menu[i].getClassificacao();
        }
        System.out.println("Classificação geral dos itens do menu: " + String.format("%.2f", soma/contador));
    }
}
