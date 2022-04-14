
def conta(n):
    valorFinal = int

    for s in range(n):
        if s == 0:
            # iniciando variável
            valorFinal = int(s)
            continue
        elif s+1 == n:
            valorFinal = valorFinal + s
            break
        valorFinal = valorFinal + s
        print(valorFinal)

    print(valorFinal)
    return valorFinal


valor = int(input("valor: "))
conta(valor)
