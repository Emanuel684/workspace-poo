package Clases;

public class HOTEL {

	public HOTEL() {
		// TODO Auto-generated constructor stub
	}
	
	public void HabitacionesDisponibles() {
		System.out.println("HabitacionesDisponibles()");
	}
	
	public void DescuentoClientesHabitaciones() {
		System.out.println("DescuentoClientesHabitaciones()");
	}
	
	public void CambiarPrecioHabitacion() {
		System.out.println("CambiarPrecioHabitacion()");
	}
	
	public void CambiarDescuento() {
		System.out.println("CambiarDescuento()");
	}
	
	public void CalcularGanancias(String diaInicio, String mesInicio, String yearInicio, String diaFinal, String mesFinal, String yearFinal) {
		System.out.println("CalcularGanancias()");
		System.out.println("diaInicio: " + diaInicio);
		System.out.println("mesInicio: " + mesInicio);
		System.out.println("yearInicio: " + yearInicio);
		System.out.println("yearInicio: " + diaFinal);
		System.out.println("yearInicio: " + mesFinal);
		System.out.println("yearInicio: " + yearFinal);
		
		String gananciasTotales = "0";
		
		for (int j = 0; j < INICIO.datosReservas.length; j++) {
			
			String diaInicioReserva = INICIO.datosReservas[j][0].split("/")[0];
			String mesInicioReserva = INICIO.datosReservas[j][0].split("/")[1];
			String yearInicioReserva = INICIO.datosReservas[j][0].split("/")[2];
			
			if(Integer.parseInt(diaInicio) < Integer.parseInt(diaInicioReserva) && Integer.parseInt(diaInicioReserva) < Integer.parseInt(diaFinal)) {
				
				if(Integer.parseInt(mesInicio) < Integer.parseInt(mesInicioReserva) && Integer.parseInt(mesInicioReserva) < Integer.parseInt(mesFinal)) {
					
					if(Integer.parseInt(yearInicio) < Integer.parseInt(yearInicioReserva) && Integer.parseInt(yearInicioReserva) < Integer.parseInt(yearFinal)) {
						System.out.println("CUMPLE CON LA FECHA");
						System.out.println("INICIO.datosReservas[j][0]Dia: " + INICIO.datosReservas[j][0].split("/")[0]);
						System.out.println("INICIO.datosReservas[j][0]Mes: " + INICIO.datosReservas[j][0].split("/")[1]);
						System.out.println("INICIO.datosReservas[j][0]Año: " + INICIO.datosReservas[j][0].split("/")[2]);
					}
					
				}
				
			}
			
			System.out.println("INICIO.datosReservas[j][0]Dia: " + INICIO.datosReservas[j][0].split("/")[0]);
			System.out.println("INICIO.datosReservas[j][0]Mes: " + INICIO.datosReservas[j][0].split("/")[1]);
			System.out.println("INICIO.datosReservas[j][0]Año: " + INICIO.datosReservas[j][0].split("/")[2]);
				
			/*
				INICIO.datosReservas[j][0] = fechaInicio;
				INICIO.datosReservas[j][1] = cantidadDias;
				INICIO.datosReservas[j][2] = cedulaCliente;
				INICIO.datosReservas[j][3] = numeroHabitacion;
				INICIO.datosReservas[j][4] = precioHabitacion;
				INICIO.datosReservas[j][5] = String.valueOf(j);
				*/
			gananciasTotales = String.valueOf(Integer.parseInt(gananciasTotales) + Integer.parseInt(INICIO.datosReservas[j][4]));
			
			System.out.println("INICIO.datosReservas[j][4]: " + INICIO.datosReservas[j][4]);
			System.out.println("gananciasTotales: " + gananciasTotales);
			
		}
		
	}

}
