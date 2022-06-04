import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ControllerContrato {

	private PagamentoOnline operadora;
	
	public ControllerContrato(PagamentoOnline operadora) {
		this.operadora = operadora;
	}
	
	public List<Parcela> calcularContrato(Contrato contrato, int qtdMeses) {
		
		double vlrParcelaSJ = contrato.getTotalValue() / qtdMeses;
		
		List<Parcela> parcelas = new ArrayList<Parcela>();

		int i = 0;
		while (i < qtdMeses) {
			
			double valorParcela = vlrParcelaSJ + operadora.parcelamento(vlrParcelaSJ, i);
			double valorTotalParcela = valorParcela + operadora.taxaPagamento(valorParcela);
			Date addData = addMonths(contrato.getDate(), i+1);
			
			parcelas.add(new Parcela(addData, valorTotalParcela));
			
			i += 1;
		}
		
		return parcelas;
	}
	
	public double calculaTotalJuros(List<Parcela> parcelas, double valorContrato) {
		double total = 0;
		for (Parcela p : parcelas) {
			total = total + p.getValorP();			
		}
		return total-valorContrato;
	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);	
		return calendar.getTime();
	}
}
