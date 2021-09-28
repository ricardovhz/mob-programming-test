# language: pt
Funcionalidade: Pagamento do pedido

  Cenario: Pagamento pessoalmente pelo cliente

    Dado Horario é 11:00
    E Cliente realiza um pedido no valor de R$ 40,00
    E Cliente irá buscar pessoalmente o pedido
    Quando Cliente enviar o pedido
    Então É definido a hora para buscar 11:20
    E É cobrado o valor de R$ 40,00 ao cliente

