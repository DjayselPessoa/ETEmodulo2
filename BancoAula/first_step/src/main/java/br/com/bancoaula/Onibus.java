package br.com.bancoaula;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos(){
        return assentos;
    }

    public void setAssentos(int assentos){
        this.assentos = assentos;
    }

    @Override
    public void exibirDados(){
        System.out.println("A placa do ônibus é " + placa + " e o ano de fabricação é " + ano + ", o número de assentos são/é " + assentos);
    }
}
