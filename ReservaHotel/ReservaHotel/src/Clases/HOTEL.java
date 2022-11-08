package Clases;

public class HOTEL {
	
	public String CalcularGanancias(String diaInicio, String mesInicio, String yearInicio, String diaFinal, String mesFinal, String yearFinal) {
		
		String gananciasTotales = "0";
		
		for (int j = 0; j < INICIO.datosReservas.length; j++) {
			if(INICIO.datosReservas[j][0] != "") {
				
				String str = INICIO.datosReservas[j][0];
				
		        String[] arrOfStr = str.split("/", 5);
		        
		        String diaInicioReserva = arrOfStr[0];
				
				String mesInicioReserva = arrOfStr[1];
				
				String yearInicioReserva = arrOfStr[2];
				
				if(Integer.parseInt(diaInicio) <= Integer.parseInt(diaInicioReserva) && Integer.parseInt(diaInicioReserva) <= Integer.parseInt(diaFinal)) {
					
					if(Integer.parseInt(mesInicio) <= Integer.parseInt(mesInicioReserva) && Integer.parseInt(mesInicioReserva) <= Integer.parseInt(mesFinal)) {
						
						if(Integer.parseInt(yearInicio) <= Integer.parseInt(yearInicioReserva) && Integer.parseInt(yearInicioReserva) <= Integer.parseInt(yearFinal)) {
							gananciasTotales = String.valueOf(Double.parseDouble(gananciasTotales) + Double.parseDouble(INICIO.datosReservas[j][4]));
						}
						
					}
					
				}
					
				/*
				INICIO.datosReservas[j][0] = fechaInicio;
				INICIO.datosReservas[j][1] = cantidadDias;
				INICIO.datosReservas[j][2] = cedulaCliente;
				INICIO.datosReservas[j][3] = numeroHabitacion;
				INICIO.datosReservas[j][4] = precioHabitacion;
				INICIO.datosReservas[j][5] = String.valueOf(j);
				*/
				
			}
			
			
		}
		
		return gananciasTotales;
		
	}

}
