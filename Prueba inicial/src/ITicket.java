
public interface ITicket {
	static void total () {
		
	}
	static double ticketEspecial (double precioKm, int kilometros, int pasajeros) {
		double total = precioKm * kilometros * pasajeros;
		return total;
	}
	static double reduccionSimple (int kmRecorridos, double precio) {
		if(kmRecorridos >= 500){
			int contador = 0;
			do {
				kmRecorridos = kmRecorridos - 500;
				contador++;
			}while(kmRecorridos >= 500);
			precio = precio - (precio * (contador / 10));
		}
		return precio;
	}
	static double reduccionEspecial (int kmRecorridos, double precio) {
		if(kmRecorridos >= 100) {
			precio = precio * 0.5;
		}
		return precio;
	}
}
