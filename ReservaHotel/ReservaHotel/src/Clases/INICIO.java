package Clases;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

import Formularios.frmMenu;

public class INICIO {
	
	public static String datosClientes[][] = new String [10][6];
	public static String datosReservas[][] = new String [10][6];
	public static String datosClientesHabituales[][] = new String [10][6];
	public static String datosClientesEsporadicos[][] = new String [10][6];

	public INICIO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] ar) {
		
		// Inicializamos los array en ""
		for (int i = 0; i < datosReservas.length; ++i) {
            for(int j = 0; j < datosReservas[i].length; ++j) {
                System.out.println(datosReservas[i][j]);
                datosReservas[i][j] = "";
            }
        }
		
		for (int i = 0; i < datosClientes.length; ++i) {
            for(int j = 0; j < datosClientes[i].length; ++j) {
                System.out.println(datosClientes[i][j]);
                datosClientes[i][j] = "";
            }
        }
		
		for (int i = 0; i < datosClientesHabituales.length; ++i) {
            for(int j = 0; j < datosClientesHabituales[i].length; ++j) {
                System.out.println(datosClientesHabituales[i][j]);
                datosClientesHabituales[i][j] = "";
            }
        }
		
		// Ingresamos un cliente inicialmente
		datosClientes[0][0] = "1000306848";
		datosClientes[0][1] = "Emanuel Acevedo";
		datosClientes[0][2] = "emanuelacag@gmail.com";
		datosClientes[0][3] = "7/9/2003";
		
    	int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea ingresar al sistema?");
    	if (JOptionPane.OK_OPTION == respuesta){
        	frmMenu frmMenu = new frmMenu();
        	frmMenu.setVisible(true);
        }
    }   

}
