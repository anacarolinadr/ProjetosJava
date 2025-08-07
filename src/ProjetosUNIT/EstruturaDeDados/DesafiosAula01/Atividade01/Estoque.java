package ProjetosUNIT.EstruturaDeDados.DesafiosAula01.Atividade01;

public class Estoque {
    Mercadoria mercadorias [];
    int qtdMaxima;
    int contador = 0;

    public Estoque(Mercadoria[] mercadorias, int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
        this.mercadorias = new Mercadoria[qtdMaxima];
        if (mercadorias != null) {
            int limite = Math.min(mercadorias.length, qtdMaxima);
            for (int i = 0; i < limite; i++) {
                this.mercadorias[i] = mercadorias[i];
                this.contador++;
            }
        }
    }

    public Estoque(int qtdMaxima) {
        this.mercadorias = new Mercadoria[qtdMaxima];
        this.contador = 0;
        this.qtdMaxima = qtdMaxima;
    }

    public boolean adicionarMercadoria(Mercadoria mercadoria) {
        if (contador < qtdMaxima) {
            mercadorias[contador] = mercadoria;
            contador++;
            return true;
        } else {
            System.out.println("Estoque cheio.");
            return false;
        }
    }

    public boolean removerMercadoria(int id) {
        for (int i = 0; i < contador; i++) {
            if (mercadorias[i].getId() == id) {
                for (int j = i; j < contador - 1; j++) {
                    mercadorias[j] = mercadorias[j + 1];
                }
                mercadorias[contador - 1] = null;
                contador--;
                return true;
            }
        }
        System.out.println("Mercadoria com ID " + id + " não encontrada.");
        return false;
    }

    public void gerarMedia() {
        if (contador == 0){
            System.out.println("Estoque vazio");
            return;
        }

        double soma = 0;
        System.out.println("Média dos valores das mercadorias");

        for (int i = 0; i < contador; i++) {
            Mercadoria m = mercadorias[i];
            System.out.println("Mercadoria: " + m.getNome() + " é: R$ " + m.getValor());
            soma += m.getValor();
        }

        double media = soma / contador;
        System.out.println("Valor total no estoque: " + soma);
        System.out.println("Média dos valores: " + media);
    }

    public Mercadoria [] getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(Mercadoria [] mercadorias) {
        this.mercadorias = mercadorias;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
