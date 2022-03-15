# Jogo da Velha

Autor: Junior Vieira

Data: 15/03/2022

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos

Foram implementadas as seguintes funcionalidades:

- Uma classe Main, onde são criadas as instâncias da classe Jogo e as instâncias das classes Jogador, Computador e Tabuleiro. 


- Na classe Main, foram adicionadas verificações como não ser possível jogar na mesma posição em já tivesse um X ou O. Feito o tratamento de erro caso seja digitado uma letra ou um número fora do intervalo.


- A classe Tabuleiro onde é construído o tabuleiro e as funções de verificação de vitória, empate e jogada. Assim como um método para mostrar o tabuleiro na tela sempre após uma jogada.


- A classe Jogador onde foi implementado uma constante "X" como a peça do jogador, um array para guardar as jogadas do jogador e um método para jogar.


- A interface ComputadorInterface onde foi implementado dois métodos: realizarJogada() e adicionarPosicao().


- A classe Computador onde foi implementado uma constante "O" como a peça do computador, um array para guardar as jogadas do computador e um método para jogar. Esta é uma classe abstrata, pois não pode ser instanciada.


- Três classes herdam de Computador, sendo elas: 

#### Classes Computador A, B e C

- Computador A: seu método de jogada é aleatório. A biblioteca random foi utilizada para gerar um número aleatório de 1 a 9. Como este é o mais simples, esta classe não recebe nada em seu construtor.


- Computador B: a primeira tentativa é preencher a posição 5, caso não consiga, ele busca as diagonais nas posições 1, 3, 5 e 9. Caso não tenha sucesso, ele busca nas posições 2, 4, 6 e 8. Recebe um tabuleiro como parâmetro em seu construtor.


- Computador C: a diferença desse é que há um contador para definir qual casa ele vai tentar preencher. O contador começa em 0, sempre que o contador % 2 == 0, ele tenta preencher as casas ímpares, quando o contador % 2 == 1, ele tenta preencher as casas pares. Também recebe um tabuleiro como parâmetro em seu construtor.