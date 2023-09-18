
public class TicketGeneral extends Ticket implements ITicket  {
	
	public TicketGeneral(double precioKm, int kmEntrada, int kmSalida) {
		this.precioKm = precioKm;
		this.kmEntrada = kmEntrada;
		this.kmSalida = kmSalida;
	}
	public TicketGeneral() {
		
	}

	/**
	 * @param precioKm
	 * @param kmEntrada
	 * @param kmSalida
	 * @return
	 */
	static double ticketSimple (double precioKm, int kmEntrada, int kmSalida) {
		int kmRecorridos = kmSalida - kmEntrada;
		double total = precioKm * kmRecorridos;
		return total;
	}
	/**
	 * @param total
	 * @param kmEntrada
	 * @param kmSalida
	 * @return
	 */
	static double reduccionSimple (double total, int kmEntrada, int kmSalida) {
		int kmRecorridos = kmSalida - kmEntrada;
		int contador = 0;
		double totalReducido = 0;
		if(kmRecorridos >= 500){
			
			do {
				kmRecorridos = kmRecorridos - 500;
				System.out.println(kmRecorridos);
				contador++;
				System.out.println(contador);
			}while(kmRecorridos >= 500);
			totalReducido = total - (total * (contador / 10));
			
			
		}
		return totalReducido;
	}
}
