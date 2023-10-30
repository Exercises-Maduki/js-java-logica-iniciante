# Jogo de Aventura: Herói

Neste projeto, desenvolvemos classes para representar um herói em uma aventura. O projeto foi implementado em duas versões: JavaScript e Java.

## 📜 Instruções Originais

O objetivo era criar uma classe genérica que representasse um herói e que possuísse propriedades como nome, idade e tipo (ex: guerreiro, mago, monge, ninja). Além disso, a classe deveria ter um método chamado `atacar` que exibisse uma mensagem de ataque específica para cada tipo de herói.

## 🛠 Como o Trabalho Foi Feito

1. **Definição da Classe**: Começamos definindo a classe `Heroi` com as propriedades solicitadas.
2. **Método Atacar**: Implementamos o método `atacar` que verifica o tipo do herói e exibe a mensagem de ataque correspondente.
3. **Testes**: Criamos instâncias de diferentes tipos de heróis e testamos o método `atacar` para garantir que a saída fosse a esperada.

## 📂 Versões do Projeto

- **JavaScript**: A versão em JavaScript foi desenvolvida considerando a execução em um ambiente Node.js. A classe foi definida usando a sintaxe ES6 e os testes foram escritos em um arquivo separado.
  
- **Java**: Na versão Java, a classe foi definida em um arquivo `.java` separado e os testes foram escritos em uma função `main` para facilitar a execução e teste.

## 🚀 Execução

Para testar cada versão do projeto:

### JavaScript

1. Navegue até a pasta `javascript-version`.
2. Execute `node HeroiTest.js`.

### Java

1. Navegue até a pasta `java-version`.
2. Compile o arquivo `Heroi.java` usando `javac Heroi.java`.
3. Execute a classe usando `java Heroi`.

## 📌 Saída Esperada

Ao executar o teste para cada tipo de herói, você deve ver mensagens como:

- "mago atacou usando magia"
- "guerreiro atacou usando espada"
- ... e assim por diante para cada tipo de herói.

---

Esperamos que este README forneça uma visão clara do projeto e de como ele foi desenvolvido. Se você tiver alguma dúvida ou feedback, sinta-se à vontade para contribuir!
