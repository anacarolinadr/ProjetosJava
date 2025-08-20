//Crie a classe Quarto com os atributos nome, tipo (simples, duplo,
//suíte), ocupado (boolean).
//
//        ● Crie a classe Hospede com os atributos nome e cpf.
//
//        ● Crie a classe Reserva com os atributos Hospede hospede, Quarto
//quarto, dataEntrada e dataSaida.
//
//        ● Crie a classe Hotel com atributos nome, ArrayList<Quarto> quartos,
//ArrayList<Reserva> reservas. Inclua métodos para adicionar quarto,
//fazer reserva, listar reservas, atualizar reservas e excluir reservas.
//
//         ● Crie a classe MainHotel para similar o cadastro de hóspedes,
//reservas e listagem. O usuário deve dizer as informações
//necessárias para a simulação.

package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade03;

public class MainHotel {
    public static void main(String[] args) {
        Hospede hospede1 = new Hospede("Ana", "AAA-AAA-AAA-AA");
        Hospede hospede2 = new Hospede("Eric", "BBB-BBB-BBB-BB");

        Quarto quarto1 = new Quarto("Q1", Tipo.SIMPLES, false);
        Quarto quarto2 = new Quarto("Q2", Tipo.SIMPLES, false);

        Reserva reserva1 = new Reserva(quarto1, hospede1, "11/11/11", "12/11/11");
        Reserva reserva2 = new Reserva(quarto2, hospede2, "13/11/11", "14/11/11");

        Hotel hotel = new Hotel();
        hotel.adiconaQuarto(quarto1);
        hotel.adiconaQuarto(quarto2);
        hotel.fazerReserva(reserva1);
        hotel.fazerReserva(reserva2);
        hotel.listarReservas();
        hotel.excluirReserva(reserva1);
        hotel.listarReservas();
    }
}
