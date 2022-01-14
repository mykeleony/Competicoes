## Leitor Óptico
O professor John decidiu aplicar apenas testes de múltipla escolha a seus alunos. Em cada teste, cada questão terá cinco alternativas (A, B, C, D e E), e o professor distribuirá uma folha de respostas para cada aluno. No final do teste, as folhas de respostas serão digitalizadas e processadas digitalmente para obter a pontuação do teste para cada aluno. Inicialmente, ele pediu a um sobrinho, que entende de programação, que construísse um programa para extrair as alternativas assinaladas pelos alunos nas folhas de respostas. O sobrinho criou um bom programa, mas não conseguiu terminá-lo porque precisa estudar para o ICPC.


Durante o processamento, as folhas de respostas são digitalizadas em níveis de cinza, entre 0 (preto total) e 255 (branco total). Após detectar a posição dos cinco retângulos correspondentes a cada uma das alternativas de uma questão, o software calcula o nível de cinza médio do pixel para cada retângulo, retornando um valor inteiro correspondente a cada alternativa. Se o retângulo foi preenchido corretamente o valor médio é zero (totalmente preto). Se o retângulo foi deixado em branco, o valor médio é 255 (totalmente branco). Assim, idealmente, se os valores médios para cada alternativa de uma questão forem (255, 0, 255, 255, 255), sabemos que o aluno marcou a alternativa B para aquela questão. No entanto, como as folhas de respostas são processadas individualmente, o nível de cinza médio para um retângulo completamente preenchido não é necessariamente 0 (pode ser maior), e o valor para um retângulo não preenchido não é necessariamente 255 (pode ser menor). O professor John determinou que os níveis médios de cinza do retângulo seriam divididos em duas classes: aqueles com valores iguais ou inferiores a 127 são considerados pretos e aqueles com valores superiores a 127 serão considerados brancos.

Obviamente, não necessariamente todas as questões de todas as folhas estão marcadas corretamente. Pode acontecer de um aluno errar e marcar mais de uma alternativa para a mesma questão, ou não marcar nenhuma alternativa. Nesses casos, a resposta à pergunta deve ser desconsiderada. <br> <br>
![](https://i.ytimg.com/vi/Hp_JAeSCFKM/maxresdefault.jpg) <br> <br>
Agora, o professor John precisa de um voluntário para escrever um programa que, dados os valores médios dos níveis de cinza dos cinco retângulos correspondentes às alternativas de uma pergunta, determine qual alternativa foi marcada ou se a resposta à pergunta deve ser desconsiderada. 

---
#### Entrada
A entrada contém vários casos de teste. A primeira linha de um caso de teste contém um inteiro **N** indicando o número de perguntas na folha de respostas (*1 ≤ N ≤ 255*). Cada uma das N linhas seguintes descreve a resposta a uma pergunta e contém cinco inteiros **A, B, C, D e E**, indicando os valores dos níveis médios de cinza para cada alternativa (*0 ≤ A, B, C, D, E ≤ 255*).

O fim da entrada é indicado por uma linha contendo apenas o número zero.
<br> <br>
#### Saída
Para cada caso de teste de entrada, seu programa deve imprimir N linhas, cada linha correspondendo a uma pergunta. Caso a resposta da questão tenha sido preenchida corretamente na folha de respostas, a linha deverá conter a alternativa selecionada (‘A’, ‘B’, ‘C’, ‘D’ ou ‘E’). Caso contrário, a linha deve conter o caractere ‘*’ (asterisco).

---

Exemplo de entrada  | Saída do exemplo
------------- | -------------
3 <br> 0 255 255 255 255 <br> 255 255 255 255 0 <br> 255 255 127 255 255<br> 4 <br> 200 200 200 0 200 <br> 200 1 200 200 1 <br> 1 2 3 4 5 <br> 255 5 200 130 205 <br> 0 | A <br> E <br> C <br> D <br> * <br> * <br> B
