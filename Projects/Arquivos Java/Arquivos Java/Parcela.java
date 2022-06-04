import java.util.Date;

public class Parcela {

	private Date dataP;
	private Double valorP;
	
	public Parcela(Date dataP, Double valorP) {
		super();
		this.dataP = dataP;
		this.valorP = valorP;
	}

	public Date getDataP() {
		return dataP;
	}

	public void setDataP(Date dataP) {
		this.dataP = dataP;
	}

	public Double getValorP() {
		return valorP;
	}

	public void setValorP(Double valorP) {
		this.valorP = valorP;
	}
}
