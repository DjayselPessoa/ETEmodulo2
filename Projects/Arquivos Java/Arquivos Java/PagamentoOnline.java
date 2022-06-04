
public interface PagamentoOnline {
	
	/* TX por pagamento  */
	double taxaPagamento(double valor);
	
	/* Juros Parcelamento */
	double parcelamento(double valor, int qtdMeses);
	
}
