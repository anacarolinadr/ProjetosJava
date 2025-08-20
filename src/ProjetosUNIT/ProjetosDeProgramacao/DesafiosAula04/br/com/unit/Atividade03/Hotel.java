package ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade03;

import ProjetosUNIT.ProjetosDeProgramacao.DesafiosAula04.br.com.unit.Atividade02.Funcionario;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Quarto> quartos;
    private ArrayList<Reserva> reservas;

    public Hotel() {
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public boolean adiconaQuarto(Quarto quarto) {
        return quartos.add(quarto);
    }

    public boolean fazerReserva(Reserva reserva){
        if (reserva.getQuarto().isOcupado()) {
            System.out.println("Reserva indisponivel");
            return false;
        }
        reserva.getQuarto().setOcupado(true);
        return reservas.add(reserva);
    }

    public boolean excluirReserva(Reserva reserva){
        return reservas.remove(reserva);
    }

    public void listarReservas(){
        for (Reserva reserva : reservas) {
            System.out.println("Reserva");
            System.out.println("Hospede: " + reserva.getHospede().getNome());
            System.out.println("Quarto: " + reserva.getQuarto().getNome() + "\n");
        }
    }

    public boolean atualizarReserva(Reserva reserva) {
        for (Reserva r : reservas) {
            if (r.getHospede().getNome().equals(reserva.getHospede().getNome())) {
                r.setDataEntrada(reserva.getDataEntrada());
                r.setDataSaida(reserva.getDataSaida());
                System.out.println("Datas da reserva atualizadas");
                return true;
            }
        }
        System.out.println("Hospede da reserva não encontrado, não foi possível atualizar a reserva");
        return false;
    }
}
