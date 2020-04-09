$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/alugar_filmes.feature");
formatter.feature({
  "name": "Alugar Filmes",
  "description": "Como um usuario \nEu quero cadastrar alugueis de filmes\nPara controlar pre�os e datas de entrega",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Deve alugar um filme com sucesso",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Um filme com estoque de 2 unidades",
  "keyword": "Given "
});
formatter.match({
  "location": "br.robert.steps.AlugarFilmesSteps.um_filme_com_estoque_de_unidades(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que o preco do aluguel seja R$ 3",
  "keyword": "And "
});
formatter.match({
  "location": "br.robert.steps.AlugarFilmesSteps.que_o_preco_do_aluguel_seja_R$(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alugar",
  "keyword": "When "
});
formatter.match({
  "location": "br.robert.steps.AlugarFilmesSteps.alugar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o preco do aluguel sera R$ 3",
  "keyword": "Then "
});
formatter.match({
  "location": "br.robert.steps.AlugarFilmesSteps.o_preco_do_aluguel_sera_R$(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "data de entrega sera no dia seguinte",
  "keyword": "And "
});
formatter.match({
  "location": "br.robert.steps.AlugarFilmesSteps.data_de_entrega_sera_no_dia_seguinte()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "estoque do filme sera 1 unidade",
  "keyword": "And "
});
formatter.match({
  "location": "br.robert.steps.AlugarFilmesSteps.estoque_do_filme_sera_unidade(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});