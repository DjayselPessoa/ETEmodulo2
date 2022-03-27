package br.com.djpess;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá");
		Scanner input = new Scanner(System.in);
		var active = true;
		int tipo = 0;
		double valorXD = 0.0;
		double valorYD = 0.0;
		int valorXI = 0;
		int valorYI = 0;
		double contaD = 0.0;
		int contaI = 0;

		while(active){
			try{
				
				System.out.println("Informe o primeiro valor ou 'S' para sair:");
				String valor1 = String.valueOf(input.nextLine());
				valor1 = valor1.replaceAll(" ","");
				if((valor1.contains("S") == true) || (valor1.contains("s") == true)) {
					System.out.println("Terminando aplicação!");
					active = false;
					continue;
				}
				if((valor1.contains(".") == true) || (valor1.contains(",") == true)){
					if(valor1.contains(",") == true) {
						valor1 = valor1.replace(",",".");
						valorXD = Double.parseDouble(valor1);
						tipo = 1;
						System.out.println("Primeiro valor informado: "+ valorXD);
					}else {
						valorXD = Double.parseDouble(valor1);
						tipo = 1;
						System.out.println("Primeiro valor informado: "+ valorXD);
					}
					
				}else {
					valorXI = Integer.parseInt(valor1);
					tipo = 0;
					System.out.println("Primeiro valor informado: "+ valorXI);
				}
				
				System.out.println("Informe o segundo valor ou 'S' para sair:");
				String valor2 = String.valueOf(input.nextLine());
				valor2 = valor2.replaceAll("\\s+","");
				if((valor2.contains("S") == true) || (valor2.contains("s") == true)) {
					System.out.println("Terminando aplicação!");
					active = false;
					continue;
				}
				
				if(((valor2.contains(".") == true ) || (valor2.contains(",") == true)) && (tipo == 1)) {
					if((valor2.contains(",") == true)) {
						valor2 = valor2.replace(",",".");
						valorYD = Double.parseDouble(valor2);
						tipo = 1;
						System.out.println("Segundo valor informado: "+ valorYD);
					}else {
						valorYD = Double.parseDouble(valor2);
						tipo = 1;
						System.out.println("Segundo valor informado: "+ valorYD);
					}
				}else if(((valor2.contains(".") == true ) || (valor2.contains(",") == true)) && (tipo == 0)) {
					if(valor2.contains(",") == true) {
						valor2 = valor2.replace(",",".");
						valorYD = Double.parseDouble(valor2);
						valorXD = Double.parseDouble(valor1);
						tipo = 1;
						System.out.println("Segundo valor informado: "+ valorYD);
						System.out.println("Primeiro valor alterado: "+ valorXD);
					}else {
						valorYD = Double.parseDouble(valor2);
						tipo = 1;
						System.out.println("Segundo valor informado: "+ valorYD);
					}
				}else if(((valor2.contains(".") == false ) || (valor2.contains(",") == false)) && (tipo == 1))  {
					valorYD = Double.parseDouble(valor2);
					System.out.println("Segundo valor informado: "+ valorYD);
					tipo = 1;
				}else if (((valor2.contains(".") == false ) || (valor2.contains(",") == false)) && (tipo == 0)) {
					valorYI = Integer.parseInt(valor2);
					tipo = 0;
					System.out.println("Segundo valor informado: "+ valorYI);
				}
				
				System.out.println("Informe o operador ou 'S' para sair: ");
				String operador = String.valueOf(input.nextLine());
				operador = operador.replaceAll("\\s+","");
				if((operador.contains("S") == true) || (operador.contains("s") == true)) {
					System.out.println("Terminando aplicação!");
					active = false;
					break;
				}
				System.out.println(operador);
				if (operador.contains("+") == true) {
					System.out.println("É uma soma!");
					switch(tipo) {
						case 1:
							contaD = valorXD + valorYD;
							System.out.println("O resultado da soma é: " + contaD);
							valorXD = 0.0;
							valorYD = 0.0;
							valorXI = 0;
							valorYI = 0;
							break;
						case 0:
							contaI = valorXI + valorYI;
							System.out.println("O resultado da soma é: " + contaI);
							valorXD = 0.0;
							valorYD = 0.0;
							valorXI = 0;
							valorYI = 0;
							break;
					}
				}else if(operador.contains("-") == true) {
					System.out.println("É uma sub!");
					switch(tipo) {
						case 1:
							contaD = valorXD - valorYD;
							System.out.println("O resultado da subtração é: " + contaD);
							valorXD = 0.0;
							valorYD = 0.0;
							valorXI = 0;
							valorYI = 0;
							break;
						case 0:
							contaI = valorXI - valorYI;
							System.out.println("O resultado da subtração é: " + contaI);
							valorXD = 0.0;
							valorYD = 0.0;
							valorXI = 0;
							valorYI = 0;
							break;
					}
				}else if((operador.contains("*") == true ) || (operador.contains("x") == true ) || (operador.contains("X") == true )) {
					System.out.println("É uma mult!");
					switch(tipo) {
						case 1:
							contaD = valorXD * valorYD;
							System.out.println("O resultado da multiplicação é: " + contaD);
							valorXD = 0.0;
							valorYD = 0.0;
							valorXI = 0;
							valorYI = 0;
							break;
						case 0:
							contaI = valorXI * valorYI; 
							System.out.println("O resultado da multiplicação é: " +  contaI);
							valorXD = 0.0;
							valorYD = 0.0;
							valorXI = 0;
							valorYI = 0;
							break;
					}
				}else if(operador.contains("/") == true) {
					System.out.println("É uma div!");
					switch(tipo) {
						case 1:
							contaD = valorXD / valorYD;
							System.out.println("O resultado da divisão é: " + contaD);
							valorXD = 0.0;
							valorYD = 0.0;
							valorXI = 0;
							valorYI = 0;
							break;
						case 0:
							contaI = valorXI / valorYI;
							System.out.println("O resultado da divisão é: " + contaI);
							valorXD = 0.0;
							valorYD = 0.0;
							valorXI = 0;
							valorYI = 0;
							break;
					}
				}else {
					System.out.println("Operador não reconhecido! REINICIANDO!");
					valorXD = 0.0;
					valorYD = 0.0;
					valorXI = 0;
					valorYI = 0;
					break;
				}

			}catch(Exception e){
				System.out.println("Algo errado não está certo! REINICIANDO!");
				valorXD = 0.0;
				valorYD = 0.0;
				valorXI = 0;
				valorYI = 0;
				continue;
			}
		};
		input.close();
	}

}
