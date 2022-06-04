
public class PayPalPromocao extends PayPal {
 
	@Override
	public double taxaPagamento(double valor) {
		return valor * TX * 0.9;
	}

	@Override
	public double parcelamento(double valor, int qtdMeses) {
		return valor * qtdMeses * JUROS * 0.9;
	}
}
