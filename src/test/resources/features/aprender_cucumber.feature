# language: pt
  Funcionalidade: : Aprender cucumber
    Cenario: Deve executar especificação
      Dado que criei o arquivo corretamente
      Quando executa-lo
      Então a especificacao deve finalizar com sucesso


    Cenario: Deve incrementar contador
      Dado que o valor do contador é 15
      Quando eu incrementar em 3
      Então o valor do contador será 18

     Cenario: Login com dados validos
       Dado que acesso a home do portal puravida prime
       Quando realizo login
       Então sou redirecionado para a home