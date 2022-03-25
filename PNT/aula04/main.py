import matplotlib.pyplot as plp

x = [1, 2, 3, 4, 5, 6, 7, 8]
y = [2, 3, 7, 5, 4, 8, 10, 4]
z = [500, 10, 200, 100, 800, 54, 74, 9]
titulo = "Gráfico de Dispersão"
eixox = "Eixo x"
eixoy = "Eixo y"

plp.title(titulo)
plp.xlabel(eixox)
plp.ylabel(eixoy)

plp.plot(x,  y,  color="b",  linestyle='dotted')
plp.scatter(x,  y,  label="os pontos",  color='chocolate',  marker="_",  s=z)
plp.legend()
plp.show()

