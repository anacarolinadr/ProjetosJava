//Escrever um programa que lê:
//        ● A porcentagem do IPI a ser acrescido no valor das peças:
//        ○ O código da peça 1, valor unitário da peça 1, quantidade de peças 1
//        ○ O código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O programa deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

package ProjetosUNIT.DesafiosAula01.Atividade03;

public class Main {
    public static void main(String[] args) {
        ValorTotalIPI valorTotalIPI = new ValorTotalIPI(10,20, 5, 3,10);
        System.out.println(valorTotalIPI.calcularValorTotal());
    }
}
