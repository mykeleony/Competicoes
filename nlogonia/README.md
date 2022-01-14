## Divisão da Nlogônia
Após séculos de hostilidades e escaramuças entre as quatro nações que vivem na terra conhecida como Nlogônia, e anos de negociações envolvendo diplomatas, políticos e forças armadas de todas as partes interessadas, com mediação da ONU, OTAN, G7 e SBC, foi finalmente acordado que a terra seria dividida em quatro territórios independentes.

Ficou determinado que um ponto, denominado ponto de divisão -- de coordenadas estabelecidas nas negociações -- definiria a divisão do país, da seguinte forma: duas linhas, ambas contendo o ponto de divisão, uma no sentido Norte-Sul e outra no sentido Leste-Oeste, seriam desenhadas no mapa, dividindo o território em quatro novos países. A partir do quadrante mais a oeste e mais ao norte, no sentido horário, os novos países serão chamados de Noroeste da Nlogônia, Nordeste da Nlogônia, Sudeste da Nlogônia e Sudoeste da Nlogônia. <br>
![](https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1091.png) <br>
A ONU determinou que deveria existir uma página na internet para que os habitantes pudessem verificar em qual dos novos países estão suas casas. Você foi contratado para ajudar na implementação do sistema.

---
#### Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém um inteiro **K** indicando o número de consultas que serão feitas (*0 < K ≤ 103*). A segunda linha de um caso de teste contém dois inteiros **N** e **M** representando as coordenadas do ponto de divisão (*-104 < N, M < 104*). Cada uma das K linhas seguintes contém dois inteiros X e Y representando as coordenadas de uma residência (*-104 ≤ X, Y ≤ 104*).

O fim da entrada é indicado por uma linha contendo apenas o número zero.
<br>
#### Saída
Para cada caso de teste na entrada, seu programa deve imprimir uma linha contendo:

- a palavra **divisa** se a residência estiver em uma das linhas de fronteira (Norte-Sul ou Leste-Oeste);
- **NO** (NW em português) se a residência estiver no Noroeste da Nlogônia;
- **NE** se a residência estiver no nordeste da Nlogônia;
- **SE** se a residência for no sudeste da Nlogônia;
- **SO** (SW em português) se a residência estiver no sudoeste da Nlogônia.

---

Exemplo de entrada  | Saída do exemplo
------------- | -------------
3 <br> 2 1 <br> 10 10 <br> -10 1 <br> 0 33 <br> 4 <br> 	-1000 -1000 <br> -1000 -1000 <br> 0 0 <br> -2000 -10000 <br> -999 -1001 <br> 0 | NE <br> divisa <br> NO <br> divisa <br> NE <br> SO <br> SE
