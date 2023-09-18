import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio del kilometro: ");
		double precioKm = sc.nextDouble();
		System.out.println("Introduce el kilometro en el que has entrado: ");
		int kmEntrada = sc.nextInt();
		System.out.println("Introduce el kilometro de salida: ");
		int kmSalida = sc.nextInt();
		double precioTicketSimple = TicketGeneral.ticketSimple(precioKm, kmEntrada, kmSalida);
		System.out.println("El precio del ticket sin reduccion es :" + precioTicketSimple);
		double precioReducido = TicketGeneral.reduccionSimple(precioTicketSimple, kmEntrada, kmSalida);
		System.out.println("El precio del ticket con la reduccion es: " + precioReducido);
	}

}
