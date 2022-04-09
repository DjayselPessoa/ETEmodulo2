package br.com.bancoaula;

public class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo(String placa, int ano){
        this.placa  = placa;
        this.ano = ano;
    }
    
    public Veiculo(){
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("A placa do veículo é " + placa + " e o ano de fabricação é " + ano);
    }
}
