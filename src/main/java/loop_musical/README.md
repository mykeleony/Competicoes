## Loop Musical
Um loop musical é uma pequena seção de música composta para ser tocada continuamente (ou seja, a seção é tocada novamente quando chega ao fim). Loops são usados em muitos estilos de música popular (hip hop, techno, etc), bem como em jogos de computador, principalmente jogos casuais na Internet.

Os loops podem ser digitalizados, por exemplo, usando PCM (Pulse Code Modulation), uma técnica para representar sinais analógicos usada extensivamente na área de áudio digital. No PCM, a magnitude do sinal é amostrada em intervalos regulares e os valores amostrados são armazenados em sequência. Para produzir o som para os dados amostrados, o procedimento é aplicado em sentido inverso (demodulação).

Fernanda trabalha para uma casa de software de jogos e compôs um lindo loop musical, codificado em PCM. Analisando a forma de onda de seu loop no software de edição de áudio, Fernanda ficou curiosa ao perceber a quantidade de "picos". Um pico em uma forma de onda é o valor de uma amostra que representa um máximo ou mínimo local. A figura abaixo ilustra (a) uma forma de onda e (b) o laço formado com esta forma de onda, contendo 48 picos. <br> <br>
![](https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1089_en.png) <br> <br>
Fernandinha é sua melhor amiga. Ela pediu sua ajuda para determinar quantos picos existem em seu loop musical.

---
#### Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém um inteiro **N**, representando o número de amostras no loop musical composto por Fernanda (*2 ≤ N ≤ 104*). A segunda linha contém N inteiros **Hi**, separados por espaços, representando a sequência de magnitudes amostradas (*-104 ≤ Hi ≤ 104* para *1 ≤ i ≤ N, H1 ≠ HN* e *Hi ≠ Hi+1* para *1 ≤ i < N*). Observe que H1 segue HN quando o loop é reproduzido.

O fim da entrada é indicado por uma linha contendo apenas o número zero.
<br> <br>
#### Saída
Para cada caso de teste na entrada, seu programa deve imprimir uma única linha contendo um inteiro: o número de picos que existem no loop musical.

---

Exemplo de entrada  | Saída do exemplo
------------- | -------------
2 <br> 1 -3 <br> 6 <br> 40 0 -41 0 41 42 <br> 4 <br> 300 450 449 450 <br> 0  | 2 <br> 2 <br> 4
