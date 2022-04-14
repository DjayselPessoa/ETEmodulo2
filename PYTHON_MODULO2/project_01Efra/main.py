from tkinter import Y
import matplotlib.pyplot as plt

entrada = open("PYTHON_MODULO2\project_01Efra\Planilha sem título - Página1.csv").readlines()

x = []
y = []

for i in range(len(entrada)):
    if i != 0:
        linha=entrada[i].split(",")
        x.append(int(linha[0]))
        y.append(int(linha[1]))




plt.bar(x,y, color="chocolate")
plt.plot(x,y, color="g")
plt.show()