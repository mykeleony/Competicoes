## Fuga do Cavalo
Seu amigo Peter está aprendendo xadrez. Porém, ele ainda é amador e não tem convicção suficiente para fazer movimentos seguros com o cavalo. Por isso, Peter pediu-lhe para fazer um programa que calculasse, em um lance, os distintos movimentos possíveis que o cavalo pode realizar sem se colocar sob o ataque de algum dos 8 peões inimigos. Os movimentos do cavalo e do peão estão de acordo com as regras do xadrez, o que significa que o cavalo deve se mover em L e o peão deve se mover para a frente e capturar nas diagonais, sem voltar atrás. Veja o exemplo a seguir:

<br>
<p align="center">
  <img src="https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1147.JPG" />
</p> <br>
Na figura, considerando todas as 8 posições possíveis para mover o cavalo, duas delas estão sob ataque (6b e 3e). Nas demais, o cavalo pode ser movido sem problemas, escapando dos ataques dos peões. Na casa de 2b já existe um peão, mas este também é um movimento válido para o cavalo, pois ele pode ir para esta posição e capturar o peão.

<br> Assim sendo, no exemplo dado os movimentos seguros (válidos) são 6. Lembre-se que o peão preto pode se mover de cima para baixo no tabuleiro, da linha 7 a 1.

---
#### Entrada
O arquivo de entrada consiste em vários casos de teste. Cada caso é composto por 9 linhas de entrada: a primeira, a posição inicial do cavalo; as seguintes, as respectivas posições dos peões.

A última linha do arquivo de entrada contém apenas o número 0 (zero).
<br> <br>
#### Saída
Para cada caso de teste seu programa deve imprimir uma única linha, seguindo o padrão:

Caso de Teste #Y: X movimento(s).

Onde Y representa o número do caso de teste e X representa a quantidade de movimentos seguros para o cavalo (sem estar no ataque do peão).

---

Exemplo de entrada  | Saída do exemplo
------------- | -------------
4c<br> 2b <br> 2c <br> 3d<br> 4f<br> 5d <br> 7a <br> 7d <br> 7g <br> 0 | Caso de Teste #1: 6 movimento(s).
