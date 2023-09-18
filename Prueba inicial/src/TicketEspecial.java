
public class TicketEspecial extends Ticket implements ITicket{
	int pasajeros;
	public TicketEspecial(double precioKm, int kmEntrada, int kmSalida, int pasajeros) {
		this.precioKm = precioKm;
		this.kmEntrada = kmEntrada;
		this.kmSalida = kmSalida;
		this.pasajeros = pasajeros;
	}
	
	
	
}
