""""
*************************************************************************************
* Solução do problema da Fuga do Cavalo em Python.                                  *
* Link para o enunciado: https://www.beecrowd.com.br/judge/en/problems/view/1147    *
*                                                                                   *
* Myke Leony dos Santos Amorim. 24 de janeiro de 2021.                              *
*************************************************************************************
"""

qtd_movimentos = list()
colunas = {'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5, 'f': 6, 'g': 7, 'h': 8}

while True:
    casa_cavalo = input()   # Casa inicial do cavalo na forma 'lc', com l = linha e c = coluna da casa.

    linha_cavalo = int(casa_cavalo[0])

    if linha_cavalo < 1:
        break

    coluna_cavalo = colunas[casa_cavalo[1]]

    mvts = list()

    if linha_cavalo < 7:
        if coluna_cavalo > 1:
            mvts.append([coluna_cavalo-1, linha_cavalo+2])

        if coluna_cavalo < 8:
            mvts.append([coluna_cavalo+1, linha_cavalo+2])

    if linha_cavalo < 8:
        if coluna_cavalo > 2:
            mvts.append([coluna_cavalo-2, linha_cavalo+1])

        if coluna_cavalo < 7:
            mvts.append([coluna_cavalo+2, linha_cavalo+1])

    if linha_cavalo > 2:
        if coluna_cavalo > 1:
            mvts.append([coluna_cavalo-1, linha_cavalo-2])

        if coluna_cavalo < 8:
            mvts.append([coluna_cavalo+1, linha_cavalo-2])

    if linha_cavalo > 1:
        if coluna_cavalo > 2:
            mvts.append([coluna_cavalo-2, linha_cavalo-1])

        if coluna_cavalo < 7:
            mvts.append([coluna_cavalo+2, linha_cavalo-1])

    peoes = list()
    possiveis = len(mvts)

    for i in range(8):
        casa_peao = input()
        peoes.append([colunas[casa_peao[1]], int(casa_peao[0])])

    for mvt in mvts:
        for peao in peoes:
            if peao[1]-1 == mvt[1] and (peao[0]+1 == mvt[0] or peao[0]-1 == mvt[0]):
                possiveis -= 1

    qtd_movimentos.append(possiveis)

[print(f'Caso de Teste #{i+1}: {movimentos} movimento(s).') for i, movimentos in enumerate(qtd_movimentos)]
