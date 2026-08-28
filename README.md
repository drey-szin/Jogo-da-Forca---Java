# 🎮 Jogo da Forca em Java

Um clássico jogo da forca feito em Java, jogado direto pelo terminal.

Este projeto nasceu como um desafio pessoal para praticar lógica de programação em Java. Depois de finalizado, voltei ao código para refatorá-lo aplicando conceitos de **Programação Orientada a Objetos (POO)**, separando responsabilidades em classes e deixando a estrutura mais organizada e fácil de manter.

## 🧠 Como funciona

Ao iniciar, o jogo pede para o usuário escolher uma categoria de palavras:

1. Times de Futebol Brasileiro
2. Marcas de Carros
3. Dinossauros
4. Profissões
5. Frutas
6. Animais
7. Países

Uma palavra é sorteada aleatoriamente dentro da categoria escolhida. O jogador então tenta adivinhá-la letra por letra:

- Cada letra correta é revelada na palavra.
- Cada letra errada consome uma vida (o jogador começa com **5 vidas**).
- O jogo termina quando a palavra é completamente revelada (vitória) ou quando as vidas acabam (derrota).

## 🏗️ Estrutura do projeto

O código está organizado em pacotes, separando a inicialização da lógica do jogo:

```
src/
├── application/
│   └── Main.java          # Ponto de entrada: exibe o menu e inicia o jogo
└── entities/
    ├── Categoria.java     # Armazena as categorias e sorteia a palavra
    └── JogoForca.java     # Contém toda a lógica da partida (tentativas, vidas, vitória/derrota)
```

- **`Main`**: responsável apenas por interagir com o usuário no menu inicial e disparar o jogo.
- **`Categoria`**: encapsula as listas de palavras por categoria e a lógica de sorteio.
- **`JogoForca`**: controla o estado da partida — tentativas de letras, contagem de vidas, verificação de vitória e exibição do progresso da palavra.

## ▶️ Como executar

**Pré-requisitos:** ter o JDK instalado (Java 17+ recomendado, já que o projeto usa `switch` com expressão).

1. Clone o repositório:
   ```bash
   git clone https://github.com/drey-szin/Jogo-da-Forca---Java.git
   cd Jogo-da-Forca---Java
   ```
2. Compile os arquivos:
   ```bash
   javac -d bin src/application/Main.java src/entities/*.java
   ```
3. Execute:
   ```bash
   java -cp bin application.Main
   ```

Ou simplesmente abra o projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, etc.) e rode a classe `Main`.

## 🚀 Possíveis melhorias futuras

- Adicionar mais categorias e palavras
- Exibir um desenho ASCII da forca conforme as vidas diminuem
- Permitir que o jogador digite a palavra inteira, não só letras
- Adicionar testes unitários para `JogoForca` e `Categoria`

## 📚 Sobre o projeto

Este projeto foi criado para fins de estudo, unindo prática de lógica de programação com conceitos de Orientação a Objetos. Sugestões e feedbacks são muito bem-vindos!
