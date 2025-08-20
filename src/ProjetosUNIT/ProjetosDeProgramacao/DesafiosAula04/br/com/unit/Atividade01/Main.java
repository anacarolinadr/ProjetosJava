//Crie um objeto chamado Cliente com os atributos: id, nome, idade,
//telefone.
//
//Faça um programa para solicitar os dados de vários clientes e armazenar
//em um ArrayList até id seja igual a 0.
//
//Em seguida exiba os dados de todos os clientes, formatando cada objeto
//separado por linhas.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade01;

import ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade01.Cliente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente(1, "Ana", 19, "XXXX-XXXX");
        Cliente cliente2 = new Cliente(2, "Eric", 19, "XXXX-XXXX");
        Cliente cliente3 = new Cliente(3, "Juliana", 19, "XXXX-XXXX");
        Cliente cliente4 = new Cliente(4, "Gabriel", 19, "XXXX-XXXX");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        for (Cliente cliente : clientes) {
            cliente.exibirDados();
        }
    }
}
