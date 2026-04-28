## 📍Passo EXTRA ☠️☠️☠️

Caso você tenha concluído todos os passos anteriores, você poderá implementar uma funcionalidade extra para o seu programa.

Você irá criar na tela inicial, uma nova tela de opções, sendo:

```
1 - Iniciar o sistema para cadastro de PETS
2 - Iniciar o sistema para alterar formulário
```

Caso o usuário escolha a opção 2, você deverá exibir um novo menu com as seguintes opções:

1. Criar nova pergunta
2. Alterar pergunta existente
3. Excluir pergunta existente
4. Voltar para o menu inicial
5. Sair

### _Regras Opção 1 ⚠️_
1. O usuário deverá digitar a nova pergunta, e você deverá salvar no arquivo `formulario.txt` a nova pergunta
2. A pergunta deverá SEGUIR a ordem com a númeração obrigatória, ou seja, ele deverá olhar para a pergunta ANTERIOR e adicionar +1 na númeração.
3. Novas perguntas não tem obrigatoriedade de resposta, mas caso o usuário **NÃO** responda, coloque um NÃO INFORMADO.

### _Regras Opção 2 ⚠️_
1. O usuário NÃO PODERÁ modificar as perguntas ORIGINAIS (de 1 a 7), somente as perguntas que ele adicionou.
2. O usuário deverá digitar o número da pergunta que deseja alterar,então você deverá printar na tela e oferecer a opção a ser alterada.
3. O usuário poderá alterar a pergunta, mas não a resposta, ou seja, você deverá perguntar a nova pergunta e salvar no arquivo.

### _Regras Opção 3 ⚠️_
1. O usuário NÃO PODERÁ deletar as perguntas ORIGINAIS (de 1 a 7), somente as perguntas que ele adicionou.
2. O usuário deverá digitar o número da pergunta que deseja deletar, então você deverá printar na tela e oferecer a opção a ser deletada.
3. O usuário deverá confirmar a exclusão da pergunta, digitando SIM ou NÃO.

### _Regras GERAIS das novas opções ⚠️_

1. Caso existam 9 perguntas (2 adicionadas), e o usuário DELETE A PERGUNTA 8, a pergunta 9 deverá tomar o lugar da 8.
2. Não deixe NENHUMA LINHA VAZIA no arquivo de perguntas ou de respostas, sempre reorganize-os
3. Ao perguntar uma das novas PERGUNTAS adicionadas (caso existam), você deverá ler o arquivo de perguntas e exibir as perguntas adicionadas normalmente.
4. Caso o usuário RESPONDA, o arquivo salvo com o pet deverá conter a resposta da pergunta adicionada no seguinte formato:

```
1 - Florzinha da Silva 
2 - Gato 
3 - Femea 
4 - Rua 2, 456, Seilandia 
5 - 6 anos 
6 - 5kg 
7 - Siames
8 - [EXTRA - PERGUNTA NOVA ADICIONADA] - RESPOSTA DO USUÁRIO
9 - [EXTRA - PERGUNTA NOVA ADICIONADA] - RESPOSTA DO USUÁRIO
```

## Considerações Finais 📝

- **Siga implementando o projeto e fazendo commits à medida que for concluindo as funcionalidades, seguindo o padrão sempre de [Conventional commits](https://www.youtube.com/watch?v=sbK9h45Jc5o)**

- **Crie um arquivo README.md com uma descrição do seu projeto e instruções de como executá-lo.**

### Gostou do projeto?
Se você chegou até aqui, parabéns! Você concluiu o primeiro grande desafio do guia. 🚀