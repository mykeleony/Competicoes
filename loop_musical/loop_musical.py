'''
******************************************************************************************************************************
* Solução do problema do Loop Musical (Maratona de Programação SBC 2008) em Python.                                          *
* Link para o enunciado: https://www.beecrowd.com.br/judge/en/problems/view/1089                                             *
*                                                                                                                            *
* Myke Leony dos Santos Amorim. 14 de janeiro de 2021.                                                                       *                                                                              *
******************************************************************************************************************************
'''

qtd_picos = list()

while True:
    qtd_magnitudes = int(input())

    if qtd_magnitudes == 0: break

    magnitudes = [int(magnitude) for magnitude in input().split()]
    magnitudes.extend([magnitudes[0], magnitudes[1]])   # O loop é criado ao conectar o início e o fim da lista de magnitudes.

    picos = 0

    for i in range(1, qtd_magnitudes+1):
         if (magnitudes[i] < magnitudes[i-1] and magnitudes[i] < magnitudes[i+1]) or (magnitudes[i] > magnitudes[i-1] and magnitudes[i] > magnitudes[i+1]):
            picos += 1

    qtd_picos.append(picos)

[print(pico) for pico in qtd_picos]
