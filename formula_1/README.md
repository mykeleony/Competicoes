## Fórmula 1
A temporada de Fórmula 1 consiste em uma série de corridas, conhecidas como Grand Prix, organizadas pela Federação Internacional de Automóveis (FIA). Os resultados de cada Grand Prix são combinados para determinar o Campeonato Mundial de Pilotos. Mais especificamente, para cada prova são distribuídos alguns pontos aos pilotos, dependendo da sua classificação na prova. No final da temporada, o piloto que somar mais pontos é declarado Campeão Mundial.

Os organizadores da Fórmula 1 mudam constantemente as regras da competição, com o objetivo de proporcionar mais emoção aos fãs. Uma regra modificada para a temporada de 2010 foi a distribuição de pontos em cada Grand Prix. Desde 2003, a regra de pontuação premiava os oito melhores pilotos, conforme tabela a seguir: <br>
<p align="center">
  <img src="https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1125_a.png" />
</p>
Ou seja, o piloto vencedor recebeu 10 pontos, o segundo colocado recebeu 8 pontos e assim por diante. Na temporada 2010 os dez primeiros receberão pontos, obedecendo a tabela a seguir:

<p align="center"> <br>
  <img src="https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1125_b.png" />
</p>

A mudança no sistema de pontuação levou a muita especulação sobre qual teria sido o efeito para o Campeonato Mundial no passado se a nova pontuação tivesse sido usada. Por exemplo, Lewis Hamilton teria sido campeão em 2008 considerando que ele e Felipe Massa estavam separados por apenas um ponto? Para acabar com a especulação, a FIA contratou você para escrever um programa que, dados os resultados de cada corrida de uma temporada, determina o Campeão do Mundo para diferentes sistemas de pontuação.

---
#### Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém dois inteiros **G** e **P** separados por um espaço em branco, indicando o número de Grand Prixs (*1 ≤ G ≤ 100*) e o número de pilotos (*1 ≤ P ≤ 100*). Os pilotos são identificados por inteiros de 1 a P. Cada uma das linhas G a seguir indica o resultado de uma corrida e contém **Q** inteiros separados por espaços. Em cada linha, o i-ésimo número indica a ordem de chegada do piloto i na corrida (o primeiro número indica a ordem de chegada do piloto 1 naquela corrida, o segundo número indica a ordem de chegada do piloto 2 nessa corrida e assim por diante). A próxima linha contém um único inteiro **S** indicando o número de sistemas de pontuação (*1 ≤ S ≤ 10*). Depois disso, cada uma das seguintes linhas S contém uma descrição de um sistema de pontuação. A descrição de um sistema de pontuação começa com um inteiro **K** (*1 ≤ K ≤ P*), indicando a última colocação a receber pontos, seguido por um espaço em branco e K inteiros k0, k1, ... , kn−1 (*1 ≤ ki ≤ 100*) separados por espaços, indicando o número de pontos a serem atribuídos (o primeiro inteiro indica os pontos para o primeiro lugar, o segundo inteiro indica os pontos para o segundo lugar e assim sucessivamente).

O último caso de teste é seguido por uma linha contendo apenas dois zeros separados por um espaço em branco.
<br> <br>
#### Saída
Para cada sistema de pontuação na entrada seu programa deve imprimir uma linha contendo o identificador do Campeão Mundial. Se mais de um piloto for Campeão Mundial (ou seja, se houver empate), a linha deve conter todos os Campeões Mundiais, em ordem crescente de identificador, separados por um espaço.

---

Exemplo de entrada  | Saída do exemplo
------------- | -------------
1 3<br> 3 2 1 <br> 3 <br> 3 5 3 2<br> 3 5 3 1<br> 3 1 1 1 <br> 3 10 <br> 1 2 3 4 5 6 7 8 9 10 <br> 10 1 2 3 4 5 6 7 8 9 <br> 9 10 1 2 3 4 5 6 7 8 <br> 2 <br>5 5 4 3 2 1 <br> 3 10 5 1 <br> 2 4 <br> 1 3 4 2 <br> 4 1 3 2 <br> 2 <br> 3 3 2 1 <br> 3 5 4 2 <br> 0 0| 3 <br> 3 <br> 1 2 3 <br> 3 <br> 3 <br> 2 4 <br> 4
