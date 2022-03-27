package br.com.djpess;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá");
		Scanner input = new Scanner(System.in);
		var active = true;
		int cont = 0;

		while(active){
			try{
				
				if(cont == 1){
					System.out.println("Informe o primeiro valor:");
					float valor1 = input.nextFloat();
					System.out.println("Valor informado: "+ valor1);
					System.out.println("Informe o segundo valor:");
					float valor2 = input.nextFloat();
					System.out.println("Valor informado: "+ valor2);
					System.out.println("O resultado da soma é: " + (valor1 + valor2));
					active = false;
				}else{
					cont += 1;
				}

			}catch(Exception e){
				System.out.println("Erro log");

			}
		};
		input.close();
	}

}
