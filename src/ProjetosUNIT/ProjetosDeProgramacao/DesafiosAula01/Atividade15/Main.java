//Escrever um programa para criar uma classe chamada "ProdutoEletrônico" com atributos
//para ID, nome e preço do produto. Implemente métodos para aplicar um desconto e
//calcular o preço final. Crie uma subclasse "MáquinaDeLavar" que adicione um atributo de
//período de garantia e um método para estender a garantia.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula01.Atividade15;

public class Main {
    public static void main(String[] args) {
        MaquinaDeLavar maquinaDeLavar = new MaquinaDeLavar("Maquina Top", 1234, 2500, 3);
        maquinaDeLavar.aplicarDesconto(20);
        maquinaDeLavar.exibirDetalhes();
        maquinaDeLavar.extenderGarantia(2);
    }
}
