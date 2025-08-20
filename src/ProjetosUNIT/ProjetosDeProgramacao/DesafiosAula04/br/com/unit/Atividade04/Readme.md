Crie a classe Motorista com os atributos nome, cpf, carro, placa,
avaliacaoMedia, corridasRealizadas, ganhosTotais. Adicione os
seguintes métodos:

○ atualizarAvaliacao(int nota) → recalcula a média das avaliações
○ registrarCorrida (double valor) → soma ganhos e incrementa
corridas realizadas.

● Crie a classe Passageiro com os atributos nome, cpf,
formaPagamentoPreferida, avaliacaoMedia, corridasRealizadas e
gastosTotais. Adicione os seguintes métodos:

○ avaliarMotorista (int nota)
○ registrarCorrida (double valor) → soma ganhos e incrementa
corridas realizadas

● Crie a classe Corrida com os atributos motorista, passageiro,
distanciaKm, valor, formaPagamento, status (em andamento,
concluída, cancelada), avaliacaoMotorista e avaliacaoPassageiro.
Adicione os seguintes métodos:
○ calcularValor() → considera:
■ tarifa base = R$5,00
■ preço por km = R$2,50
■ taxa de cancelamento = R$7,00
○ finalizarCorrida(int notaMotorista, int notaPassageiro) → atualiza
avaliações e ganhos/gastos
○ cancelarCorrida() → aplica taxa de cancelamento

● Crie a classe Aplicativo com os atributos nome,
ArrayList<Motorista> motoristas, ArrayList<Passageiro> passageiros,
ArrayList<Corrida> corridas. Adicione os seguintes métodos:
○ cadastrarMotorista (Motorista m)
○ cadastrarPassageiro (Passageiro p)
○ chamarCorrida(Passageiro p, double distanciaKm, String
formaPagamento) → seleciona um motorista disponível (regra:
menor número de corridas realizadas)
○ rankingMelhoresMotoristas() → exibe top 3 motoristas por
avaliação

● Crie a classe Aplicativo com os atributos nome,
ArrayList<Motorista> motoristas, ArrayList<Passageiro> passageiros,
ArrayList<Corrida> corridas. Adicione os seguintes métodos:
○ passageirosFieis() → lista passageiros com mais de 10 corridas
○ faturamentoTotal() → soma valores das corridas concluídas
○ relatorioFormasDePagamento() → mostra quantas corridas
foram pagas em dinheiro, cartão ou pix
○ mediaGastosPorPassageiro() → calcula quanto, em média, cada
passageiro gasta por corrida

● Crie a classe MainTransporte para simular:

○ Cadastro de pelo menos 3 motoristas e 3 passageiros
(informados pelo usuário)
○ Realização de corridas com diferentes formas de pagamento
○ Cancelamento de uma corrida
○ Finalização de corridas com avaliações para motoristas e
passageiros
○ Exibição de ranking dos melhores motoristas, passageiros fiéis,
faturamento total, relatório de formas de pagamento e média de
gastos por passageiro.