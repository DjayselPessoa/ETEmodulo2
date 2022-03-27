package br.com.djpess;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá");
		var active = true;
		int cont = 0;

		while(active){
			try{
				if(cont == 1){
					System.out.println("passo um concluido!\n");
					active = false;
				}else{
					cont += 1;
				}

			}catch(Exception e){
				System.out.println("Erro log");

			}
		};
	}

}
