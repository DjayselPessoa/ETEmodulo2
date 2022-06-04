
public class PagSeguro implements PagamentoOnline {
	
	private static final double TX = 0.015; /* 1% => 1/100 */
	private static final double JUROS = 0.02; /* 0,5% => 0,5/100 */
	
	@Override
	public double taxaPagamento(double valor) {
		return valor * TX;
	}

	@Override
	public double parcelamento(double valor, int qtdMeses) {
		return valor * qtdMeses * JUROS;
	}

}
