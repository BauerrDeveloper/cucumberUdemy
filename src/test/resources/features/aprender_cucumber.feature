# language: pt
  Funcionalidade: Aprender cucumber
    Como um aluno
    Eu quero aprender a utilizar o Cucumber
    Para que eu possa automatizar critérios de aceitação

    Cenario: Deve executar especificação
      Dado que criei o arquivo corretamente
      Quando executa-lo
      Então a especificacao deve finalizar com sucesso

    Cenario: Deve incrementar contador
      Dado que o valor do contador é 15
      Quando eu incrementar em 3
      Então o valor do contador será 18

    Cenario: Deve calcular atraso na entrega
      Dado que a entrega dve ser feita no dia 05/04/2018
      Quando a entrega atrasar em 2 dias
      Então a entrega deve ser efetuada dia 07/04/2018

    Cenario: Deve calcular atraso na entrega da China
      Dado que a entrega dve ser feita no dia 05/04/2018
      Quando a entrega atrasar em 2 meses
      Então a entrega deve ser efetuada dia 05/06/2018