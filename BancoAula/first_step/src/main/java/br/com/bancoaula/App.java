package br.com.bancoaula;

import java.util.ArrayList;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        veiculos.add(new Veiculo("XPO-0987", 2010));
        veiculos.add(new Veiculo("ABC-1234", 2014));
        veiculos.add(new Veiculo("KYX-0987", 2014));
        veiculos.add(new Veiculo("XPO-0987", 2010));
        veiculos.add(new Caminhao("NZT-3028", 2014, 5));
        veiculos.add(new Caminhao("HJU-3341", 2000, 7));

        for(Veiculo veiculo : veiculos ){
            veiculo.exibirDados();
        }

        for (Caminhao caminhao : caminhoes){
            caminhao.exibirDados();
        }

    }
}
