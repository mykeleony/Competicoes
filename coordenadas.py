regioes = list()

while True:
    n = int(input())

    if n == 0:
        break;

    divisa = input().split()
    divisa = [int(num) for num in divisa]
    dx,dy = divisa

    for i in range(n):
        casa = input().split()
        casa = [int(num) for num in casa]
        cx,cy = casa

        if cy == dy or cx == dx:
            regiao = 'divisa'

        elif cy > dy:
            if cx > dx:
                regiao = 'NE'

            else:
                regiao = 'NO'

        elif cy < dy:
            if cx > dx:
                regiao = 'SE'

            else:
                regiao = 'SO'

        regioes.append(regiao)

for regiao in regioes:
    print(regiao)
