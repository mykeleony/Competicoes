'''
******************************************************************************************************************************
* Solução do problema do Leitor Óptico (Maratona de Programação SBC 2010) em Python.                                         *
* Link para o enunciado: https://www.beecrowd.com.br/judge/en/problems/view/1129                                             *
*                                                                                                                            *
* Myke Leony dos Santos Amorim. 14 de janeiro de 2021.                                                                       *                                                                              *
******************************************************************************************************************************
'''

alternativas = ['A', 'B', 'C', 'D', 'E']
alternativas_marcadas = list()

while True:
    qtd_testes = int(input())

    if qtd_testes <= 0:
        break

    for i in range(qtd_testes):
        cores = input().split()

        qtd_marcadas = 0

        for n, cor in enumerate(cores):
            if int(cor) <= 127:
                qtd_marcadas += 1

                marcada = alternativas[n]

        if qtd_marcadas <= 0 or qtd_marcadas > 1:
            alternativas_marcadas.append('*')

        else:
            alternativas_marcadas.append(marcada)

for alternativa in alternativas_marcadas:
    print(alternativa)
