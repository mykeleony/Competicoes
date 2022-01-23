""""
*************************************************************************************
* Solução do problema da Formula 1 (Maratona de Programação SBC 2010) em Python.    *
* Link para o enunciado: https://www.beecrowd.com.br/judge/en/problems/view/1125    *
*                                                                                   *
* Myke Leony dos Santos Amorim. 20 de janeiro de 2021.                              *                                                                              *
*************************************************************************************
"""

ranks = list()

while True:
    qtd_corridas, qtd_pilotos = input().split()

    if int(qtd_corridas) == 0 and int(qtd_pilotos) == 0:
        break

    resultados = list()
    scores = list()
    podio = list()

    for i in range(int(qtd_corridas)):
        resultados.append(input().split())

    qtd_scores = int(input())

    for i in range(qtd_scores):
        scores.append(input().split())
        scores[i].pop(0)    # O primeiro número informa a última colocação a receber pontos.
        scores[i] = [int(num) for num in scores[i]]

        podio.append({k: 0 for k in range(1, int(qtd_pilotos)+1)})

        for corrida in resultados:
            for j, piloto in enumerate(corrida):
                try:
                    podio[i][j+1] += scores[i][int(piloto)-1]

                except ValueError:
                    pass    # A colocação do piloto não adiciona pontos no torneio.

    ranks.append(podio)

for rank in ranks:
    for pilotos in rank:
        maior_pont = max(pilotos, key=pilotos.get)

        campeoes = list()

        for cod, score in pilotos.items():
            if score == pilotos[maior_pont]:
                campeoes.append(cod)

        if len(campeoes) > 1:    # Em caso de empate, há mais de um campeão mundial.
            print(campeoes[0], end='')
            [print(f' {campeao}', end='') for campeao in campeoes[1:]]
            print('')

        else:
            print(maior_pont)
