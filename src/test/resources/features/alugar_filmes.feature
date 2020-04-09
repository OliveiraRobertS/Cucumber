
Feature: Alugar Filmes
Como um usuario 
Eu quero cadastrar alugueis de filmes
Para controlar preços e datas de entrega

Scenario: Deve alugar um filme com sucesso

Given Um filme com estoque de 2 unidades
And que o preco do aluguel seja R$ 3
When alugar
Then o preco do aluguel sera R$ 3
And data de entrega sera no dia seguinte
And estoque do filme sera 1 unidade