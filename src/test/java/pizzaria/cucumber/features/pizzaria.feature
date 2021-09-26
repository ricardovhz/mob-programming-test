# language: pt
Funcionalidade: Pontos de fidelidade

  Cenario: Test Pedido

  Dado a hora de "11:00"
  Quando o cliente acessa "http://test.pizzariaonline.com/"
  E preenche "4 Queijos" no campo "PesquisarTexto"
  Quando aperta "Pesquisar"
  Então ele deveria ver "4 Queijos" dentro de "ResultadoPesquisa"
  E ele seleciona "Medio" de "Tamanho"
  Quando aperta "Adicionar ao carrinho"
  Então ele deveria ver "1 item" em "NumeroItensCarrinho"
  E ele clica em  "Fechar Pedido"
  E seleciona "ClienteBuscaPessoalmente" de "idInstrucoesDeEntrega"
  Então "idClienteBuscarPessoalmte" deveria ser selecionável de "OpcoesDePgts"
  E preenche "Marcos" em "NomePedido"
  E preenche "12334456" em "NumeroTelefoneContato"
  Quando aperta "Enviar Pedido"
  Então ele deveria ver "MensagemSucesso"
  Então ele não deveria ver "MensagemErro"
  E ele deveria ver "Obrigado pelo seu pedido" dentro de "MensagemSucesso"
  E ele deveria ver "11:20" em "HoraParaBuscar"
  E ele deveria ver "R$40" em "ValorTotal"


