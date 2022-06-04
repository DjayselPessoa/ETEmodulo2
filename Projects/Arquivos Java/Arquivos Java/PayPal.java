public class PayPal implements PagamentoOnline {

	protected static final double TX = 0.02; /* 2% => 2/100 */
	protected static final double JUROS = 0.01; /* 1% => 1/100 */
	
	@Override
	public double taxaPagamento(double valor) {
		return valor * TX;
	}

	@Override
	public double parcelamento(double valor, int qtdMeses) {
		return valor * qtdMeses * JUROS;
	}
}
