""""
*************************************************************************************
* Solução do problema da Formula 1 (Maratona de Programação SBC 2010) em Python.    *
* Link para o enunciado: https://www.beecrowd.com.br/judge/en/problems/view/1125    *
*                                                                                   *
* Myke Leony dos Santos Amorim. 20 de janeiro de 2021.                              *
*************************************************************************************
"""

ranks = list()

while True:
    qtd_corridas, qtd_pilotos = input().split()

    if int(qtd_corridas) == 0 and int(qtd_pilotos) == 0:
        break

    resultados = list()

    for i in range(int(qtd_corridas)):
        resultados.append(input().split())

    qtd_scores = int(input())

    for i in range(qtd_scores):
        score = [int(num) for num in input().split()]
        podio = dict()

        for k, corrida in enumerate(resultados):
            for j, pos in enumerate(corrida):
                pos = int(pos)

                if pos < len(score):
                    if k == 0:
                        podio[j+1] = score[pos]

                    else:
                        podio[j+1] += score[pos]

                elif k == 0:
                    podio[j+1] = 0

        ranks.append(podio)

for pilotos in ranks:
    maior_pont = -1
    campeoes = list()

    for cod, score in pilotos.items():
        if score > maior_pont:
            maior_pont = score
            campeoes = [cod]

        elif score == maior_pont:
            campeoes.append(cod)

    print(campeoes[0], end='')
    [print(f' {campeao}', end='') for campeao in campeoes[1:]]
    print('')
