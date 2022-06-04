
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner entrada = new Scanner(System.in);
		
			/* Dados do Contrato */
			System.out.println("Informe os dados do contrato:");
	
			System.out.print("Número: ");
			Integer numero = entrada.nextInt();
	
			System.out.print("Data (dd/MM/yyyy): ");
			Date data = date_format.parse(entrada.next());
			
			System.out.print("Valor do contrato: ");
			Double total = entrada.nextDouble();
			
			/* Instancia o contrato */
			Contrato ct = new Contrato(numero, data, total);
			
			/* solicita o número de parcelas */
			System.out.print("Informe a quantidade de parcelas: ");
			int qtdParcelas = entrada.nextInt();
			
		entrada.close();

		/* Calcula os valores das parcelas e os meses */
		ControllerContrato controller;
		if (data.getMonth() == 11) {
			controller = new ControllerContrato(new PayPalPromocao());
			System.out.println("Promoção");
		} else {		
			controller = new ControllerContrato(new PayPal());
		}
		List<Parcela> parcelas = controller.calcularContrato(ct, qtdParcelas);
		
		/* Imprime as parcelas */
		System.out.println("PARCELAS - PAYPAL");
		for (Parcela p : parcelas) {
			System.out.println(date_format.format(p.getDataP()) + " - " + String.format("%.2f", p.getValorP()));			
		}
		double juros = controller.calculaTotalJuros(parcelas, total);
		System.out.println("---- Total Juros = " + juros);
		
		/* Calcula os valores das parcelas e os meses */
		controller = new ControllerContrato(new MercadoPago());
		List<Parcela> parcelas_2 = controller.calcularContrato(ct, qtdParcelas);
		
		/* Imprime as parcelas */
		System.out.println("PARCELAS - MERCADO PAGO");
		for (Parcela p : parcelas_2) {
			System.out.println(date_format.format(p.getDataP()) + " - " + String.format("%.2f", p.getValorP()));			
		}
		double juros2 = controller.calculaTotalJuros(parcelas_2, total);
		System.out.println("---- Total Juros = " + juros2);
		
		System.out.println("----------");
		System.out.println("PARCELAS - PagSeguro");
		PagSeguro pag = new PagSeguro();
		controller = new ControllerContrato(pag);
		List<Parcela> parcelas_3 = controller.calcularContrato(ct, qtdParcelas);
		for (Parcela p : parcelas_3) {
			System.out.println(date_format.format(p.getDataP()) + " - " + String.format("%.2f", p.getValorP()));			
		}
		double juros3 = controller.calculaTotalJuros(parcelas_3, total);
		System.out.println("---- Total Juros = " + juros3);
			
		
	}

}
