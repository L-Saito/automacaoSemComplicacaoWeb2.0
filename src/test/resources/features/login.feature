#language:pt

Funcionalidade: login

  Contexto:
    Dado que a modal esteja sendo exibida

  @fecharModal
  Cenario: Fechar a modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela modal deve ser fechada

  @fecharModalNoX
  Cenario: Fechar a modal ao clicar no icone fechar
    Quando for realizado um clique icone de fechar da modal
    Entao a janela modal deve ser fechada

  @createNewAccount
  Cenario: Link Create New Account
    Quando for realizado um clique em Create New Account
    Entao a pagina Create Account deve ser exibida

  @loginComSucesso
  Esquema do Cenario: Realizar login <identificacao>
        #Agrupamento de cenários
    Quando os campos de login forem preenchidos com os valores
      | usuario  | <usuario>  |
      | senha    | <senha>    |
      | remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema
    Exemplos:
      | identificacao           | usuario | senha    | remember |
      | com campos obrigatorios | saito   | Senha321 | false    |
      | todos os campos         | saito   | Senha321 | true     |

  @loginComErro
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos com os valores
      | usuario  | <usuario>  |
      | senha    | <senha>    |
      | remember | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o sistema devera exibir uma mensagem de erro
    Exemplos:
      | identificacao    | usuario  | senha    | remember |
      | usuario invalido | invalido | Senha321 | false    |
      | senha invalida   | saito    | invalida | false    |

  @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos com os valores
      | usuario  | <usuario>  |
      | senha    | <senha>    |
      | remember | <remember> |
    Entao o botao sign in deve permanecer desabilitado
    Exemplos:
      | identificacao     | usuario | senha | remember |
      | usuario em branco |         | senha | false    |
      | senha em branco   | chronos |       | false    |

