package Clases;

import javax.swing.JOptionPane;

import Formularios.frmMenu;

public class INICIO {

	public INICIO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] ar) {
    	int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea ingresar al sistema?");
    	if (JOptionPane.OK_OPTION == respuesta){
        	frmMenu frmMenu = new frmMenu();
        	frmMenu.setVisible(true);
        }
    }   

}
