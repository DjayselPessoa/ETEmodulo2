import java.util.Date;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double valorTotal;
	
	public Contrato(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getnumero() {
		return numero;
	}

	public void setnumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return data;
	}

	public void setDate(Date data) {
		this.data = data;
	}

	public Double getTotalValue() {
		return valorTotal;
	}

	public void setTotalValue(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
